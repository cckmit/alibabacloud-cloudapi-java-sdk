/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 *
 */
public class ModifyApiGroupInstanceRequest extends RpcAcsRequest<ModifyApiGroupInstanceResponse> {

	public ModifyApiGroupInstanceRequest() {
		super("CloudAPI", "2016-07-14", "ModifyApiGroupInstance", "apigateway");
	}

	private String groupId;

	private String targetInstanceId;

	private String remark;

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		putQueryParameter("GroupId", groupId);
	}

	public String getTargetInstanceId() {
		return targetInstanceId;
	}

	public void setTargetInstanceId(String targetInstanceId) {
		this.targetInstanceId = targetInstanceId;
		putQueryParameter("TargetInstanceId", targetInstanceId);
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		putQueryParameter("Remark", remark);
	}

	@Override
	public Class<ModifyApiGroupInstanceResponse> getResponseClass() {
		return ModifyApiGroupInstanceResponse.class;
	}

}
