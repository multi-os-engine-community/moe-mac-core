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

package mac.coreservices.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class UCKeyStateRecord extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public UCKeyStateRecord() {
		super(UCKeyStateRecord.class);
	}

	@Generated
	protected UCKeyStateRecord(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native char stateZeroCharData();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setStateZeroCharData(char value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short stateZeroNextState();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setStateZeroNextState(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short stateEntryCount();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setStateEntryCount(short value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native short stateEntryFormat();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setStateEntryFormat(short value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int stateEntryData();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setStateEntryData(int value);
}
