/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package mac.sys.enums;


import org.moe.natj.general.ann.Generated;

@Generated
public final class acl_entry_id_t {
	@Generated
	private acl_entry_id_t() {
	}

	@Generated
	public static final int ACL_FIRST_ENTRY = 0x00000000;
	@Generated
	public static final int ACL_NEXT_ENTRY = 0xFFFFFFFF;
	@Generated
	public static final int ACL_LAST_ENTRY = 0xFFFFFFFE;
}
