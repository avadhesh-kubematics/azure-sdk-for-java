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

package com.microsoft.windowsazure.management.sql.models;

import java.net.InetAddress;

/**
* The parameters for the Create Firewall Rule operation.
*/
public class FirewallRuleCreateParameters
{
    private InetAddress endIPAddress;
    
    /**
    * Gets or sets the ending IP address applied to this firewall rule.
    */
    public InetAddress getEndIPAddress()
    {
        return this.endIPAddress;
    }
    
    /**
    * Gets or sets the ending IP address applied to this firewall rule.
    */
    public void setEndIPAddress(InetAddress endIPAddress)
    {
        this.endIPAddress = endIPAddress;
    }
    
    private String name;
    
    /**
    * Gets or sets the name of this firewall rule.
    */
    public String getName()
    {
        return this.name;
    }
    
    /**
    * Gets or sets the name of this firewall rule.
    */
    public void setName(String name)
    {
        this.name = name;
    }
    
    private InetAddress startIPAddress;
    
    /**
    * Gets or sets the beginning IP address applied to this firewall rule.
    */
    public InetAddress getStartIPAddress()
    {
        return this.startIPAddress;
    }
    
    /**
    * Gets or sets the beginning IP address applied to this firewall rule.
    */
    public void setStartIPAddress(InetAddress startIPAddress)
    {
        this.startIPAddress = startIPAddress;
    }
}
