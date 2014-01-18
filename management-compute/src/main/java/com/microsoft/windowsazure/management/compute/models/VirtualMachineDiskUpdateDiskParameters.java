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

import java.net.URI;

/**
* Parameters supplied to the Update Virtual Disk Image operation.
*/
public class VirtualMachineDiskUpdateDiskParameters
{
    private Boolean hasOperatingSystem;
    
    /**
    * Optional.  Specifies whether the disk contains an operation system.
    * Note: Only a disk with an operating system installed can be mounted as
    * OS Drive.
    */
    public Boolean getHasOperatingSystem()
    {
        return this.hasOperatingSystem;
    }
    
    /**
    * Optional.  Specifies whether the disk contains an operation system.
    * Note: Only a disk with an operating system installed can be mounted as
    * OS Drive.
    */
    public void setHasOperatingSystem(Boolean hasOperatingSystem)
    {
        this.hasOperatingSystem = hasOperatingSystem;
    }
    
    private String label;
    
    /**
    * Required. Specifies the friendly name of the disk.
    */
    public String getLabel()
    {
        return this.label;
    }
    
    /**
    * Required. Specifies the friendly name of the disk.
    */
    public void setLabel(String label)
    {
        this.label = label;
    }
    
    private URI mediaLinkUri;
    
    /**
    * Optional. Specifies the location of the blob in Windows Azure storage.
    * The blob location must belong to a storage account in the subscription
    * specified by the SubscriptionId value in the operation call.  Example:
    * http://example.blob.core.windows.net/disks/mydisk.vhd
    */
    public URI getMediaLinkUri()
    {
        return this.mediaLinkUri;
    }
    
    /**
    * Optional. Specifies the location of the blob in Windows Azure storage.
    * The blob location must belong to a storage account in the subscription
    * specified by the SubscriptionId value in the operation call.  Example:
    * http://example.blob.core.windows.net/disks/mydisk.vhd
    */
    public void setMediaLinkUri(URI mediaLinkUri)
    {
        this.mediaLinkUri = mediaLinkUri;
    }
    
    private String name;
    
    /**
    * Required. Specifies a name for the disk. Windows Azure uses the name to
    * identify the disk when creating virtual machines from the disk.
    */
    public String getName()
    {
        return this.name;
    }
    
    /**
    * Required. Specifies a name for the disk. Windows Azure uses the name to
    * identify the disk when creating virtual machines from the disk.
    */
    public void setName(String name)
    {
        this.name = name;
    }
    
    private String operatingSystemType;
    
    /**
    * Optional. The operating system type of the disk. Possible values are:
    * Linux, Windows.
    */
    public String getOperatingSystemType()
    {
        return this.operatingSystemType;
    }
    
    /**
    * Optional. The operating system type of the disk. Possible values are:
    * Linux, Windows.
    */
    public void setOperatingSystemType(String operatingSystemType)
    {
        this.operatingSystemType = operatingSystemType;
    }
}
