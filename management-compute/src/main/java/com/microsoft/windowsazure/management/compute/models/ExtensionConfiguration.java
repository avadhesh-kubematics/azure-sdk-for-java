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

package com.microsoft.windowsazure.management.compute.models;

import java.util.ArrayList;

/**
* Represents an extension that is added to the cloud service.
*/
public class ExtensionConfiguration
{
    private ArrayList<ExtensionConfiguration.Extension> allRoles;
    
    /**
    * Optional. Specifies a list of extensions that are applied to all roles in
    * a deployment.
    */
    public ArrayList<ExtensionConfiguration.Extension> getAllRoles()
    {
        return this.allRoles;
    }
    
    /**
    * Optional. Specifies a list of extensions that are applied to all roles in
    * a deployment.
    */
    public void setAllRoles(ArrayList<ExtensionConfiguration.Extension> allRoles)
    {
        this.allRoles = allRoles;
    }
    
    private ArrayList<ExtensionConfiguration.NamedRole> namedRoles;
    
    /**
    * Optional. Specifies a list of extensions that are applied to specific
    * roles in a deployment.
    */
    public ArrayList<ExtensionConfiguration.NamedRole> getNamedRoles()
    {
        return this.namedRoles;
    }
    
    /**
    * Optional. Specifies a list of extensions that are applied to specific
    * roles in a deployment.
    */
    public void setNamedRoles(ArrayList<ExtensionConfiguration.NamedRole> namedRoles)
    {
        this.namedRoles = namedRoles;
    }
    
    /**
    * Initializes a new instance of the ExtensionConfiguration class.
    *
    */
    public ExtensionConfiguration()
    {
        this.allRoles = new ArrayList<ExtensionConfiguration.Extension>();
        this.namedRoles = new ArrayList<ExtensionConfiguration.NamedRole>();
    }
    
    /**
    * Represents an extension that is to be deployed to a role in a cloud
    * service.
    */
    public static class Extension
    {
        private String id;
        
        /**
        * Required. The identifier of the extension. The identifier is created
        * when the extension is added to the cloud service. You can find the
        * Id of an extension that was added to a cloud service by using List
        * Extensions.
        */
        public String getId()
        {
            return this.id;
        }
        
        /**
        * Required. The identifier of the extension. The identifier is created
        * when the extension is added to the cloud service. You can find the
        * Id of an extension that was added to a cloud service by using List
        * Extensions.
        */
        public void setId(String id)
        {
            this.id = id;
        }
    }
    
    /**
    * Specifies a list of extensions that are applied to specific roles in a
    * deployment.
    */
    public static class NamedRole
    {
        private ArrayList<ExtensionConfiguration.Extension> extensions;
        
        /**
        * Required. Represents an extension that is to be deployed to a role in
        * a cloud service.
        */
        public ArrayList<ExtensionConfiguration.Extension> getExtensions()
        {
            return this.extensions;
        }
        
        /**
        * Required. Represents an extension that is to be deployed to a role in
        * a cloud service.
        */
        public void setExtensions(ArrayList<ExtensionConfiguration.Extension> extensions)
        {
            this.extensions = extensions;
        }
        
        private String roleName;
        
        /**
        * Required. Specifies the name of the role.
        */
        public String getRoleName()
        {
            return this.roleName;
        }
        
        /**
        * Required. Specifies the name of the role.
        */
        public void setRoleName(String roleName)
        {
            this.roleName = roleName;
        }
        
        /**
        * Initializes a new instance of the NamedRole class.
        *
        */
        public NamedRole()
        {
            this.extensions = new ArrayList<ExtensionConfiguration.Extension>();
        }
    }
}
