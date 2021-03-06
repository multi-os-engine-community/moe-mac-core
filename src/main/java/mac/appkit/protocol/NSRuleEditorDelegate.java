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

package mac.appkit.protocol;


import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.appkit.NSRuleEditor;
import mac.foundation.NSDictionary;
import mac.foundation.NSNotification;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSRuleEditorDelegate")
public interface NSRuleEditorDelegate {
	@Generated
	@Selector("ruleEditor:child:forCriterion:withRowType:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object ruleEditorChildForCriterionWithRowType(NSRuleEditor editor,
			long index, @Mapped(ObjCObjectMapper.class) Object criterion,
			long rowType);

	@Generated
	@Selector("ruleEditor:displayValueForCriterion:inRow:")
	@MappedReturn(ObjCObjectMapper.class)
	public Object ruleEditorDisplayValueForCriterionInRow(NSRuleEditor editor,
			@Mapped(ObjCObjectMapper.class) Object criterion, long row);

	@Generated
	@Selector("ruleEditor:numberOfChildrenForCriterion:withRowType:")
	public long ruleEditorNumberOfChildrenForCriterionWithRowType(
			NSRuleEditor editor,
			@Mapped(ObjCObjectMapper.class) Object criterion, long rowType);

	@Generated
	@IsOptional
	@Selector("ruleEditor:predicatePartsForCriterion:withDisplayValue:inRow:")
	public NSDictionary ruleEditorPredicatePartsForCriterionWithDisplayValueInRow(
			NSRuleEditor editor,
			@Mapped(ObjCObjectMapper.class) Object criterion,
			@Mapped(ObjCObjectMapper.class) Object value, long row);

	@Generated
	@IsOptional
	@Selector("ruleEditorRowsDidChange:")
	public void ruleEditorRowsDidChange(NSNotification notification);
}
