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

package mac.foundation.protocol;


import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.foundation.NSMetadataItem;
import mac.foundation.NSMetadataQuery;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSMetadataQueryDelegate")
public interface NSMetadataQueryDelegate {
	@Generated
	@IsOptional
	@Selector("metadataQuery:replacementObjectForResultObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object metadataQueryReplacementObjectForResultObject(
			NSMetadataQuery query, NSMetadataItem result);

	@Generated
	@IsOptional
	@Selector("metadataQuery:replacementValueForAttribute:value:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object metadataQueryReplacementValueForAttributeValue(
			NSMetadataQuery query, String attrName,
			@Mapped(ObjCObjectMapper.class) Object attrValue);
}
