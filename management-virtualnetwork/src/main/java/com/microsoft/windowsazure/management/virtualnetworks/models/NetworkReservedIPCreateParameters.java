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

package com.microsoft.windowsazure.management.virtualnetworks.models;

/**
* Preview Only. Parameters supplied to the Create Reserved IP operation.
*/
public class NetworkReservedIPCreateParameters
{
    private String affinityGroup;
    
    /**
    * An affinity group, which indirectly refers to the location where the
    * virtual network exists.
    */
    public String getAffinityGroup()
    {
        return this.affinityGroup;
    }
    
    /**
    * An affinity group, which indirectly refers to the location where the
    * virtual network exists.
    */
    public void setAffinityGroup(String affinityGroup)
    {
        this.affinityGroup = affinityGroup;
    }
    
    private String deploymentName;
    
    /**
    * The name of the deployment the IP belongs to, if being used.
    */
    public String getDeploymentName()
    {
        return this.deploymentName;
    }
    
    /**
    * The name of the deployment the IP belongs to, if being used.
    */
    public void setDeploymentName(String deploymentName)
    {
        this.deploymentName = deploymentName;
    }
    
    private String label;
    
    /**
    * The friendly identifier of the site.
    */
    public String getLabel()
    {
        return this.label;
    }
    
    /**
    * The friendly identifier of the site.
    */
    public void setLabel(String label)
    {
        this.label = label;
    }
    
    private String name;
    
    /**
    * Name of the reserved IP.
    */
    public String getName()
    {
        return this.name;
    }
    
    /**
    * Name of the reserved IP.
    */
    public void setName(String name)
    {
        this.name = name;
    }
    
    private String serviceName;
    
    /**
    * The name of the service the IP belongs to, if being used.
    */
    public String getServiceName()
    {
        return this.serviceName;
    }
    
    /**
    * The name of the service the IP belongs to, if being used.
    */
    public void setServiceName(String serviceName)
    {
        this.serviceName = serviceName;
    }
}
