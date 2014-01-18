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

package com.microsoft.windowsazure.management.monitoring.metrics.models;

/**
* A metric setting get response.
*/
public class MetricSetting
{
    private String namespace;
    
    /**
    * The metric settings namespace. For endpoint monitoring metrics the
    * namespace value is WindowsAzure.Availability
    */
    public String getNamespace()
    {
        return this.namespace;
    }
    
    /**
    * The metric settings namespace. For endpoint monitoring metrics the
    * namespace value is WindowsAzure.Availability
    */
    public void setNamespace(String namespace)
    {
        this.namespace = namespace;
    }
    
    private String resourceId;
    
    /**
    * The resource id of the service.
    */
    public String getResourceId()
    {
        return this.resourceId;
    }
    
    /**
    * The resource id of the service.
    */
    public void setResourceId(String resourceId)
    {
        this.resourceId = resourceId;
    }
    
    private MetricSettingValue value;
    
    /**
    * The metric settings value.
    */
    public MetricSettingValue getValue()
    {
        return this.value;
    }
    
    /**
    * The metric settings value.
    */
    public void setValue(MetricSettingValue value)
    {
        this.value = value;
    }
}
