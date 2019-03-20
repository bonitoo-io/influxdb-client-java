/*
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.influxdata.client.internal;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.influxdata.Arguments;
import org.influxdata.client.LabelsApi;
import org.influxdata.client.domain.Label;
import org.influxdata.client.domain.LabelCreateRequest;
import org.influxdata.client.domain.LabelResponse;
import org.influxdata.client.domain.LabelUpdate;
import org.influxdata.client.domain.LabelsResponse;
import org.influxdata.client.service.LabelsService;
import org.influxdata.exceptions.NotFoundException;

import com.google.gson.Gson;
import retrofit2.Call;

/**
 * @author Jakub Bednar (bednar@github) (28/01/2019 10:48)
 */
class LabelsApiImpl extends AbstractInfluxDBRestClient implements LabelsApi {

    private static final Logger LOG = Logger.getLogger(LabelsApiImpl.class.getName());

    private final LabelsService labelsService;

    LabelsApiImpl(@Nonnull final InfluxDBService influxDBService,
                  @Nonnull final LabelsService labelsService,
                  @Nonnull final Gson gson) {

        super(influxDBService, gson);

        this.labelsService = labelsService;
    }

    @Nonnull
    @Override
    public Label createLabel(@Nonnull final Label label) {

        Arguments.checkNotNull(label, "label");

        LabelCreateRequest request = new LabelCreateRequest();
        request.setOrgID(label.getOrgID());
        request.setName(label.getName());
        request.setProperties(label.getProperties());

        return createLabel(request);
    }

    @Nonnull
    @Override
    public Label createLabel(@Nonnull final String name, @Nonnull final Map<String, String> properties) {

        Arguments.checkNonEmpty(name, "name");
        Arguments.checkNotNull(properties, "properties");

        Label label = new Label();
        label.setName(name);
        label.setProperties(properties);

        return createLabel(label);
    }

    @Nonnull
    @Override
    public Label createLabel(@Nonnull final LabelCreateRequest request) {

        Arguments.checkNotNull(request, "request");

        Call<LabelResponse> call = labelsService.labelsPost(request);
        LabelResponse labelResponse = execute(call);

        LOG.log(Level.FINEST, "createLabel response: {0}", labelResponse);

        return labelResponse.getLabel();
    }

    @Nonnull
    @Override
    public Label updateLabel(@Nonnull final Label label) {

        Arguments.checkNotNull(label, "label");

        LabelUpdate labelUpdate = new LabelUpdate();
        labelUpdate.properties(label.getProperties());

        return updateLabel(label.getId(), labelUpdate);
    }

    @Nonnull
    @Override
    public Label updateLabel(@Nonnull final String labelID, @Nonnull final LabelUpdate labelUpdate) {

        Arguments.checkNonEmpty(labelID, "labelID");
        Arguments.checkNotNull(labelUpdate, "labelUpdate");

        Call<LabelResponse> call = labelsService.labelsLabelIDPatch(labelID, labelUpdate, null);
        LabelResponse labelResponse = execute(call);

        LOG.log(Level.FINEST, "updateLabel response: {0}", labelResponse);

        return labelResponse.getLabel();
    }

    @Override
    public void deleteLabel(@Nonnull final Label label) {

        Arguments.checkNotNull(label, "label");

        deleteLabel(label.getId());
    }

    @Override
    public void deleteLabel(@Nonnull final String labelID) {

        Arguments.checkNonEmpty(labelID, "labelID");

        Call<Void> call = labelsService.labelsLabelIDDelete(labelID, null);
        execute(call);
    }

    @Nonnull
    @Override
    public Label cloneLabel(@Nonnull final String clonedName, @Nonnull final String labelID) {

        Arguments.checkNonEmpty(clonedName, "clonedName");
        Arguments.checkNonEmpty(labelID, "labelID");

        Label label = findLabelByID(labelID);
        if (label == null) {
            throw new IllegalStateException("NotFound Label with ID: " + labelID);
        }

        return cloneLabel(clonedName, label);
    }

    @Nonnull
    @Override
    public Label cloneLabel(@Nonnull final String clonedName, @Nonnull final Label label) {

        Arguments.checkNonEmpty(clonedName, "clonedName");
        Arguments.checkNotNull(label, "label");

        Label cloned = new Label();
        cloned.setName(clonedName);

        if (label.getProperties() != null) {
            label.getProperties().forEach(cloned::putPropertiesItem);
        }
        cloned.getProperties().putAll(label.getProperties());

        return createLabel(cloned);
    }

    @Nullable
    @Override
    public Label findLabelByID(@Nonnull final String labelID) {

        Arguments.checkNonEmpty(labelID, "labelID");

        Call<LabelResponse> call = labelsService.labelsLabelIDGet(labelID, null);
        LabelResponse labelResponse = execute(call, NotFoundException.class);

        if (labelResponse == null) {
            return null;
        }

        LOG.log(Level.FINEST, "findLabelByID response: {0}", labelResponse);

        return labelResponse.getLabel();
    }

    @Nonnull
    @Override
    public List<Label> findLabels() {

        Call<LabelsResponse> sourcesCall = labelsService.labelsGet();

        LabelsResponse labels = execute(sourcesCall);
        LOG.log(Level.FINEST, "findLabels found: {0}", labels);

        return labels.getLabels();
    }
}