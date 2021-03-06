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

package mac.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class host_basic_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public host_basic_info() {
		super(host_basic_info.class);
	}

	@Generated
	protected host_basic_info(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int max_cpus();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setMax_cpus(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int avail_cpus();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setAvail_cpus(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int memory_size();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setMemory_size(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int cpu_type();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setCpu_type(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int cpu_subtype();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setCpu_subtype(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int cpu_threadtype();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setCpu_threadtype(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int physical_cpu();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setPhysical_cpu(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int physical_cpu_max();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setPhysical_cpu_max(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int logical_cpu();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setLogical_cpu(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int logical_cpu_max();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setLogical_cpu_max(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native long max_mem();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setMax_mem(long value);
}
