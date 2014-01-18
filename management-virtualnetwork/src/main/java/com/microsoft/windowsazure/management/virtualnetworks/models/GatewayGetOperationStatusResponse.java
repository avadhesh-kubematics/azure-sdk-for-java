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

import com.microsoft.windowsazure.core.OperationResponse;

/**
* The response body contains the status of the specified asynchronous
* operation, indicating whether it has succeeded, is inprogress, or has
* failed. Note that this status is distinct from the HTTP status code returned
* for the Get Operation Status operation itself.  If the asynchronous
* operation succeeded, the response body includes the HTTP status code for the
* successful request.  If the asynchronous operation failed, the response body
* includes the HTTP status code for the failed request, and also includes
* error information regarding the failure.
*/
public class GatewayGetOperationStatusResponse extends OperationResponse
{
    private GatewayGetOperationStatusResponse.ErrorDetails error;
    
    /**
    * If the asynchronous operation failed, the response body includes the HTTP
    * status code for the failed request, and also includes error information
    * regarding the failure.
    */
    public GatewayGetOperationStatusResponse.ErrorDetails getError()
    {
        return this.error;
    }
    
    /**
    * If the asynchronous operation failed, the response body includes the HTTP
    * status code for the failed request, and also includes error information
    * regarding the failure.
    */
    public void setError(GatewayGetOperationStatusResponse.ErrorDetails error)
    {
        this.error = error;
    }
    
    private Integer httpStatusCode;
    
    /**
    * The HTTP status code for the asynchronous request.
    */
    public Integer getHttpStatusCode()
    {
        return this.httpStatusCode;
    }
    
    /**
    * The HTTP status code for the asynchronous request.
    */
    public void setHttpStatusCode(Integer httpStatusCode)
    {
        this.httpStatusCode = httpStatusCode;
    }
    
    private String id;
    
    /**
    * The request ID of the asynchronous request. This value is returned in the
    * x-ms-request-id response header of the asynchronous request.
    */
    public String getId()
    {
        return this.id;
    }
    
    /**
    * The request ID of the asynchronous request. This value is returned in the
    * x-ms-request-id response header of the asynchronous request.
    */
    public void setId(String id)
    {
        this.id = id;
    }
    
    private GatewayOperationStatus status;
    
    /**
    * The status of the asynchronous request.
    */
    public GatewayOperationStatus getStatus()
    {
        return this.status;
    }
    
    /**
    * The status of the asynchronous request.
    */
    public void setStatus(GatewayOperationStatus status)
    {
        this.status = status;
    }
    
    /**
    * If the asynchronous operation failed, the response body includes the HTTP
    * status code for the failed request, and also includes error information
    * regarding the failure.
    */
    public static class ErrorDetails
    {
        private String code;
        
        /**
        * The management service error code returned if the asynchronous
        * request failed.
        */
        public String getCode()
        {
            return this.code;
        }
        
        /**
        * The management service error code returned if the asynchronous
        * request failed.
        */
        public void setCode(String code)
        {
            this.code = code;
        }
        
        private String message;
        
        /**
        * The management service error message returned if the asynchronous
        * request failed.
        */
        public String getMessage()
        {
            return this.message;
        }
        
        /**
        * The management service error message returned if the asynchronous
        * request failed.
        */
        public void setMessage(String message)
        {
            this.message = message;
        }
    }
}
