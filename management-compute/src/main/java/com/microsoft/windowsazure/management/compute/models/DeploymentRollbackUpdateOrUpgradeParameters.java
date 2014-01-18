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

/**
* Parameters supplied to the Rollback Update Or Upgrade operation.
*/
public class DeploymentRollbackUpdateOrUpgradeParameters
{
    private boolean force;
    
    /**
    * Specifies whether the rollback should proceed even when it will cause
    * local data to be lost from some role instances. True if the rollback
    * should proceed; otherwise false.
    */
    public boolean getForce()
    {
        return this.force;
    }
    
    /**
    * Specifies whether the rollback should proceed even when it will cause
    * local data to be lost from some role instances. True if the rollback
    * should proceed; otherwise false.
    */
    public void setForce(boolean force)
    {
        this.force = force;
    }
    
    private RollbackUpdateOrUpgradeMode mode;
    
    /**
    * Required. Specifies whether the rollback should proceed automatically.
    */
    public RollbackUpdateOrUpgradeMode getMode()
    {
        return this.mode;
    }
    
    /**
    * Required. Specifies whether the rollback should proceed automatically.
    */
    public void setMode(RollbackUpdateOrUpgradeMode mode)
    {
        this.mode = mode;
    }
}
