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

package com.microsoft.windowsazure.management.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
* The List Management Certificates operation response.
*/
public class ManagementCertificateListResponse extends OperationResponse implements Iterable<ManagementCertificateListResponse.SubscriptionCertificate>
{
    private ArrayList<ManagementCertificateListResponse.SubscriptionCertificate> subscriptionCertificates;
    
    /**
    * The management certificates that are valid for your subscription.
    */
    public ArrayList<ManagementCertificateListResponse.SubscriptionCertificate> getSubscriptionCertificates()
    {
        return this.subscriptionCertificates;
    }
    
    /**
    * The management certificates that are valid for your subscription.
    */
    public void setSubscriptionCertificates(ArrayList<ManagementCertificateListResponse.SubscriptionCertificate> subscriptionCertificates)
    {
        this.subscriptionCertificates = subscriptionCertificates;
    }
    
    /**
    * Initializes a new instance of the ManagementCertificateListResponse class.
    *
    */
    public ManagementCertificateListResponse()
    {
        super();
        this.subscriptionCertificates = new ArrayList<ManagementCertificateListResponse.SubscriptionCertificate>();
    }
    
    /**
    * Gets the sequence of SubscriptionCertificates.
    *
    */
    public Iterator<ManagementCertificateListResponse.SubscriptionCertificate> iterator()
    {
        return this.getSubscriptionCertificates().iterator();
    }
    
    /**
    * A management certificate that is valid for your subscription.
    */
    public static class SubscriptionCertificate
    {
        private Calendar created;
        
        /**
        * The time that the management certificate was created, in UTC.
        */
        public Calendar getCreated()
        {
            return this.created;
        }
        
        /**
        * The time that the management certificate was created, in UTC.
        */
        public void setCreated(Calendar created)
        {
            this.created = created;
        }
        
        private byte[] data;
        
        /**
        * A base64 representation of the data contained in the management
        * certificate, in .cer format.
        */
        public byte[] getData()
        {
            return this.data;
        }
        
        /**
        * A base64 representation of the data contained in the management
        * certificate, in .cer format.
        */
        public void setData(byte[] data)
        {
            this.data = data;
        }
        
        private byte[] publicKey;
        
        /**
        * A base64 representation of the management certificate public key.
        */
        public byte[] getPublicKey()
        {
            return this.publicKey;
        }
        
        /**
        * A base64 representation of the management certificate public key.
        */
        public void setPublicKey(byte[] publicKey)
        {
            this.publicKey = publicKey;
        }
        
        private String thumbprint;
        
        /**
        * The X509 certificate thumb print property of the management
        * certificate. This thumb print uniquely identifies the certificate.
        */
        public String getThumbprint()
        {
            return this.thumbprint;
        }
        
        /**
        * The X509 certificate thumb print property of the management
        * certificate. This thumb print uniquely identifies the certificate.
        */
        public void setThumbprint(String thumbprint)
        {
            this.thumbprint = thumbprint;
        }
    }
}
