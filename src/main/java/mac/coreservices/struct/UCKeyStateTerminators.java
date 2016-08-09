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
@Structure()
public final class UCKeyStateTerminators extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public UCKeyStateTerminators() {
		super(UCKeyStateTerminators.class);
	}

	@Generated
	protected UCKeyStateTerminators(Pointer peer) {
		super(peer);
	}

	@Generated
	public UCKeyStateTerminators(short keyStateTerminatorsFormat,
			short keyStateTerminatorCount, char keyStateTerminators) {
		super(UCKeyStateTerminators.class);
		setKeyStateTerminatorsFormat(keyStateTerminatorsFormat);
		setKeyStateTerminatorCount(keyStateTerminatorCount);
		setKeyStateTerminators(keyStateTerminators);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native short keyStateTerminatorsFormat();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setKeyStateTerminatorsFormat(short value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native short keyStateTerminatorCount();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setKeyStateTerminatorCount(short value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native char keyStateTerminators();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setKeyStateTerminators(char value);
}
