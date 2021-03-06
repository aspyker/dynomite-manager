/**
 * Copyright 2016 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.dynomitemanager.identity;

/*
 * A means to determine the environment for the running instance
 */
public interface InstanceEnvIdentity {
	/*
	 * @return true if running instance is in "classic", false otherwise.
	 */
	public Boolean isClassic();
	/*
	 * @return true if running instance is in VPC, under your default AWS account, false otherwise.
	 */
	public Boolean isDefaultVpc();
	/*
	 * @return true if running instance is in VPC, under a specific AWS account, false otherwise.
	 */
	public Boolean isNonDefaultVpc();
	
	public static enum InstanceEnvironent {
		CLASSIC, DEFAULT_VPC, NONDEFAULT_VPC
	};
}
