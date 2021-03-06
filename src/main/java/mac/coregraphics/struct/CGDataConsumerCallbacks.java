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

package mac.coregraphics.struct;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CGDataConsumerCallbacks extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public CGDataConsumerCallbacks() {
		super(CGDataConsumerCallbacks.class);
	}

	@Generated
	protected CGDataConsumerCallbacks(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setPutBytes(
			@FunctionPtr(name = "call_putBytes") Function_putBytes value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_putBytes {
		@Generated
		public long call_putBytes(VoidPtr arg0, ConstVoidPtr arg1, long arg2);
	}

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setReleaseConsumer(
			@FunctionPtr(name = "call_releaseConsumer") Function_releaseConsumer value);

	@Runtime(CRuntime.class)
	@Generated
	static public interface Function_releaseConsumer {
		@Generated
		public void call_releaseConsumer(VoidPtr arg0);
	}
}
