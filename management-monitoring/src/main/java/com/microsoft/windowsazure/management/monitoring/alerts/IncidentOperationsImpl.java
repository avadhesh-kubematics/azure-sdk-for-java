/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.monitoring.alerts;

import com.microsoft.windowsazure.core.ServiceOperations;
import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.monitoring.alerts.models.Incident;
import com.microsoft.windowsazure.management.monitoring.alerts.models.IncidentCollection;
import com.microsoft.windowsazure.management.monitoring.alerts.models.IncidentGetResponse;
import com.microsoft.windowsazure.management.monitoring.alerts.models.IncidentListResponse;
import com.microsoft.windowsazure.tracing.CloudTracing;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;

/**
* Operations for managing the alert incidents.
*/
public class IncidentOperationsImpl implements ServiceOperations<AlertsClientImpl>, IncidentOperations
{
    /**
    * Initializes a new instance of the IncidentOperationsImpl class.
    *
    * @param client Reference to the service client.
    */
    IncidentOperationsImpl(AlertsClientImpl client)
    {
        this.client = client;
    }
    
    private AlertsClientImpl client;
    
    /**
    * Gets a reference to the
    * microsoft.windowsazure.management.monitoring.alerts.AlertsClientImpl.
    */
    public AlertsClientImpl getClient()
    {
        return this.client;
    }
    
    /**
    *
    * @param incidentId The id of the incident to retrieve.
    * @return The Get Incident operation response.
    */
    @Override
    public Future<IncidentGetResponse> getAsync(final String incidentId)
    {
        return this.getClient().getExecutorService().submit(new Callable<IncidentGetResponse>() { 
            @Override
            public IncidentGetResponse call() throws Exception
            {
                return get(incidentId);
            }
         });
    }
    
    /**
    *
    * @param incidentId The id of the incident to retrieve.
    * @return The Get Incident operation response.
    */
    @Override
    public IncidentGetResponse get(String incidentId) throws IOException, ServiceException, ParseException
    {
        // Validate
        if (incidentId == null)
        {
            throw new NullPointerException("incidentId");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace)
        {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("incidentId", incidentId);
            CloudTracing.enter(invocationId, this, "getAsync", tracingParameters);
        }
        
        // Construct URL
        String url = this.getClient().getBaseUri() + "/" + this.getClient().getCredentials().getSubscriptionId() + "/services/monitoring/alertincidents/" + incidentId;
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        httpRequest.setHeader("Accept", "application/json");
        httpRequest.setHeader("Content-Type", "application/json");
        httpRequest.setHeader("x-ms-version", "2013-10-01");
        
        // Send Request
        HttpResponse httpResponse = null;
        if (shouldTrace)
        {
            CloudTracing.sendRequest(invocationId, httpRequest);
        }
        httpResponse = this.getClient().getHttpClient().execute(httpRequest);
        if (shouldTrace)
        {
            CloudTracing.receiveResponse(invocationId, httpResponse);
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode != HttpStatus.SC_OK)
        {
            ServiceException ex = ServiceException.createFromJson(httpRequest, null, httpResponse, httpResponse.getEntity());
            if (shouldTrace)
            {
                CloudTracing.error(invocationId, ex);
            }
            throw ex;
        }
        
        // Create Result
        IncidentGetResponse result = null;
        // Deserialize Response
        InputStream responseContent = httpResponse.getEntity().getContent();
        result = new IncidentGetResponse();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode responseDoc = objectMapper.readTree(responseContent);
        
        if (responseDoc != null)
        {
            JsonNode incidentValue = responseDoc.get("Incident");
            if (incidentValue != null)
            {
                Incident incidentInstance = new Incident();
                result.setIncident(incidentInstance);
                
                JsonNode idValue = incidentValue.get("Id");
                if (idValue != null)
                {
                    String idInstance;
                    idInstance = idValue.getTextValue();
                    incidentInstance.setId(idInstance);
                }
                
                JsonNode ruleIdValue = incidentValue.get("RuleId");
                if (ruleIdValue != null)
                {
                    String ruleIdInstance;
                    ruleIdInstance = ruleIdValue.getTextValue();
                    incidentInstance.setRuleId(ruleIdInstance);
                }
                
                JsonNode isActiveValue = incidentValue.get("IsActive");
                if (isActiveValue != null)
                {
                    boolean isActiveInstance;
                    isActiveInstance = isActiveValue.getBooleanValue();
                    incidentInstance.setIsActive(isActiveInstance);
                }
                
                JsonNode activatedTimeValue = incidentValue.get("ActivatedTime");
                if (activatedTimeValue != null)
                {
                    Calendar activatedTimeInstance;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(simpleDateFormat.parse(activatedTimeValue.getTextValue()));
                    activatedTimeInstance = calendar;
                    incidentInstance.setActivatedTime(activatedTimeInstance);
                }
                
                JsonNode resolvedTimeValue = incidentValue.get("ResolvedTime");
                if (resolvedTimeValue != null)
                {
                    Calendar resolvedTimeInstance;
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTime(simpleDateFormat2.parse(resolvedTimeValue.getTextValue()));
                    resolvedTimeInstance = calendar2;
                    incidentInstance.setResolvedTime(resolvedTimeInstance);
                }
            }
        }
        
        result.setStatusCode(statusCode);
        if (httpResponse.getHeaders("x-ms-request-id").length > 0)
        {
            result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
        }
        
        if (shouldTrace)
        {
            CloudTracing.exit(invocationId, result);
        }
        return result;
    }
    
    /**
    *
    * @return The List incidents operation response.
    */
    @Override
    public Future<IncidentListResponse> listActiveForSubscriptionAsync()
    {
        return this.getClient().getExecutorService().submit(new Callable<IncidentListResponse>() { 
            @Override
            public IncidentListResponse call() throws Exception
            {
                return listActiveForSubscription();
            }
         });
    }
    
    /**
    *
    * @return The List incidents operation response.
    */
    @Override
    public IncidentListResponse listActiveForSubscription() throws IOException, ServiceException, ParseException
    {
        // Validate
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace)
        {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            CloudTracing.enter(invocationId, this, "listActiveForSubscriptionAsync", tracingParameters);
        }
        
        // Construct URL
        String url = this.getClient().getBaseUri() + "/" + this.getClient().getCredentials().getSubscriptionId() + "/services/monitoring/alertincidents?$filter=IsActive eq true";
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        httpRequest.setHeader("Accept", "application/json");
        httpRequest.setHeader("Content-Type", "application/json");
        httpRequest.setHeader("x-ms-version", "2013-10-01");
        
        // Send Request
        HttpResponse httpResponse = null;
        if (shouldTrace)
        {
            CloudTracing.sendRequest(invocationId, httpRequest);
        }
        httpResponse = this.getClient().getHttpClient().execute(httpRequest);
        if (shouldTrace)
        {
            CloudTracing.receiveResponse(invocationId, httpResponse);
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode != HttpStatus.SC_OK)
        {
            ServiceException ex = ServiceException.createFromJson(httpRequest, null, httpResponse, httpResponse.getEntity());
            if (shouldTrace)
            {
                CloudTracing.error(invocationId, ex);
            }
            throw ex;
        }
        
        // Create Result
        IncidentListResponse result = null;
        // Deserialize Response
        InputStream responseContent = httpResponse.getEntity().getContent();
        result = new IncidentListResponse();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode responseDoc = objectMapper.readTree(responseContent);
        
        if (responseDoc != null)
        {
            JsonNode incidentCollectionValue = responseDoc.get("IncidentCollection");
            if (incidentCollectionValue != null)
            {
                IncidentCollection incidentCollectionInstance = new IncidentCollection();
                result.setIncidentCollection(incidentCollectionInstance);
                
                ArrayNode valueArray = ((ArrayNode) incidentCollectionValue.get("Value"));
                if (valueArray != null)
                {
                    for (JsonNode valueValue : valueArray)
                    {
                        Incident incidentInstance = new Incident();
                        incidentCollectionInstance.getValue().add(incidentInstance);
                        
                        JsonNode idValue = valueValue.get("Id");
                        if (idValue != null)
                        {
                            String idInstance;
                            idInstance = idValue.getTextValue();
                            incidentInstance.setId(idInstance);
                        }
                        
                        JsonNode ruleIdValue = valueValue.get("RuleId");
                        if (ruleIdValue != null)
                        {
                            String ruleIdInstance;
                            ruleIdInstance = ruleIdValue.getTextValue();
                            incidentInstance.setRuleId(ruleIdInstance);
                        }
                        
                        JsonNode isActiveValue = valueValue.get("IsActive");
                        if (isActiveValue != null)
                        {
                            boolean isActiveInstance;
                            isActiveInstance = isActiveValue.getBooleanValue();
                            incidentInstance.setIsActive(isActiveInstance);
                        }
                        
                        JsonNode activatedTimeValue = valueValue.get("ActivatedTime");
                        if (activatedTimeValue != null)
                        {
                            Calendar activatedTimeInstance;
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(simpleDateFormat.parse(activatedTimeValue.getTextValue()));
                            activatedTimeInstance = calendar;
                            incidentInstance.setActivatedTime(activatedTimeInstance);
                        }
                        
                        JsonNode resolvedTimeValue = valueValue.get("ResolvedTime");
                        if (resolvedTimeValue != null)
                        {
                            Calendar resolvedTimeInstance;
                            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTime(simpleDateFormat2.parse(resolvedTimeValue.getTextValue()));
                            resolvedTimeInstance = calendar2;
                            incidentInstance.setResolvedTime(resolvedTimeInstance);
                        }
                    }
                }
            }
        }
        
        result.setStatusCode(statusCode);
        if (httpResponse.getHeaders("x-ms-request-id").length > 0)
        {
            result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
        }
        
        if (shouldTrace)
        {
            CloudTracing.exit(invocationId, result);
        }
        return result;
    }
    
    /**
    *
    * @param ruleId The rule id.
    * @param isActive A boolean to retrieve only active or resolved incidents.
    * @return The List incidents operation response.
    */
    @Override
    public Future<IncidentListResponse> listForRuleAsync(final String ruleId, final boolean isActive)
    {
        return this.getClient().getExecutorService().submit(new Callable<IncidentListResponse>() { 
            @Override
            public IncidentListResponse call() throws Exception
            {
                return listForRule(ruleId, isActive);
            }
         });
    }
    
    /**
    *
    * @param ruleId The rule id.
    * @param isActive A boolean to retrieve only active or resolved incidents.
    * @return The List incidents operation response.
    */
    @Override
    public IncidentListResponse listForRule(String ruleId, boolean isActive) throws IOException, ServiceException, ParseException
    {
        // Validate
        if (ruleId == null)
        {
            throw new NullPointerException("ruleId");
        }
        
        // Tracing
        boolean shouldTrace = CloudTracing.getIsEnabled();
        String invocationId = null;
        if (shouldTrace)
        {
            invocationId = Long.toString(CloudTracing.getNextInvocationId());
            HashMap<String, Object> tracingParameters = new HashMap<String, Object>();
            tracingParameters.put("ruleId", ruleId);
            tracingParameters.put("isActive", isActive);
            CloudTracing.enter(invocationId, this, "listForRuleAsync", tracingParameters);
        }
        
        // Construct URL
        String url = this.getClient().getBaseUri() + "/" + this.getClient().getCredentials().getSubscriptionId() + "/services/monitoring/alertrules/" + ruleId + "/alertincidents?$filter=IsActive eq " + isActive;
        
        // Create HTTP transport objects
        HttpGet httpRequest = new HttpGet(url);
        
        // Set Headers
        httpRequest.setHeader("Accept", "application/json");
        httpRequest.setHeader("Content-Type", "application/json");
        httpRequest.setHeader("x-ms-version", "2013-10-01");
        
        // Send Request
        HttpResponse httpResponse = null;
        if (shouldTrace)
        {
            CloudTracing.sendRequest(invocationId, httpRequest);
        }
        httpResponse = this.getClient().getHttpClient().execute(httpRequest);
        if (shouldTrace)
        {
            CloudTracing.receiveResponse(invocationId, httpResponse);
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode != HttpStatus.SC_OK)
        {
            ServiceException ex = ServiceException.createFromJson(httpRequest, null, httpResponse, httpResponse.getEntity());
            if (shouldTrace)
            {
                CloudTracing.error(invocationId, ex);
            }
            throw ex;
        }
        
        // Create Result
        IncidentListResponse result = null;
        // Deserialize Response
        InputStream responseContent = httpResponse.getEntity().getContent();
        result = new IncidentListResponse();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode responseDoc = objectMapper.readTree(responseContent);
        
        if (responseDoc != null)
        {
            JsonNode incidentCollectionValue = responseDoc.get("IncidentCollection");
            if (incidentCollectionValue != null)
            {
                IncidentCollection incidentCollectionInstance = new IncidentCollection();
                result.setIncidentCollection(incidentCollectionInstance);
                
                ArrayNode valueArray = ((ArrayNode) incidentCollectionValue.get("Value"));
                if (valueArray != null)
                {
                    for (JsonNode valueValue : valueArray)
                    {
                        Incident incidentInstance = new Incident();
                        incidentCollectionInstance.getValue().add(incidentInstance);
                        
                        JsonNode idValue = valueValue.get("Id");
                        if (idValue != null)
                        {
                            String idInstance;
                            idInstance = idValue.getTextValue();
                            incidentInstance.setId(idInstance);
                        }
                        
                        JsonNode ruleIdValue = valueValue.get("RuleId");
                        if (ruleIdValue != null)
                        {
                            String ruleIdInstance;
                            ruleIdInstance = ruleIdValue.getTextValue();
                            incidentInstance.setRuleId(ruleIdInstance);
                        }
                        
                        JsonNode isActiveValue = valueValue.get("IsActive");
                        if (isActiveValue != null)
                        {
                            boolean isActiveInstance;
                            isActiveInstance = isActiveValue.getBooleanValue();
                            incidentInstance.setIsActive(isActiveInstance);
                        }
                        
                        JsonNode activatedTimeValue = valueValue.get("ActivatedTime");
                        if (activatedTimeValue != null)
                        {
                            Calendar activatedTimeInstance;
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(simpleDateFormat.parse(activatedTimeValue.getTextValue()));
                            activatedTimeInstance = calendar;
                            incidentInstance.setActivatedTime(activatedTimeInstance);
                        }
                        
                        JsonNode resolvedTimeValue = valueValue.get("ResolvedTime");
                        if (resolvedTimeValue != null)
                        {
                            Calendar resolvedTimeInstance;
                            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTime(simpleDateFormat2.parse(resolvedTimeValue.getTextValue()));
                            resolvedTimeInstance = calendar2;
                            incidentInstance.setResolvedTime(resolvedTimeInstance);
                        }
                    }
                }
            }
        }
        
        result.setStatusCode(statusCode);
        if (httpResponse.getHeaders("x-ms-request-id").length > 0)
        {
            result.setRequestId(httpResponse.getFirstHeader("x-ms-request-id").getValue());
        }
        
        if (shouldTrace)
        {
            CloudTracing.exit(invocationId, result);
        }
        return result;
    }
}
