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

package mac.coretext.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 2)
public final class TrakTableEntry extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public TrakTableEntry() {
		super(TrakTableEntry.class);
	}

	@Generated
	protected TrakTableEntry(Pointer peer) {
		super(peer);
	}

	@Generated
	public TrakTableEntry(int track, short nameTableIndex, short sizesOffset) {
		super(TrakTableEntry.class);
		setTrack(track);
		setNameTableIndex(nameTableIndex);
		setSizesOffset(sizesOffset);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int track();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setTrack(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short nameTableIndex();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setNameTableIndex(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native short sizesOffset();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setSizesOffset(short value);
}
