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

package mac.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.foundation.protocol.NSCopying;
import mac.foundation.protocol.NSSecureCoding;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSError extends NSObject implements NSCopying, NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected NSError(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSError alloc();

	@Generated
	@Selector("code")
	public native long code();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("domain")
	public native String domain();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("errorWithDomain:code:userInfo:")
	public static native NSError errorWithDomainCodeUserInfo(String domain,
			long code, NSDictionary dict);

	@Generated
	@Selector("helpAnchor")
	public native String helpAnchor();

	@Generated
	@Selector("init")
	public native NSError init();

	@Generated
	@Selector("initWithCoder:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithDomain:code:userInfo:")
	public native NSError initWithDomainCodeUserInfo(String domain, long code,
			NSDictionary dict);

	@Generated
	@Selector("localizedDescription")
	public native String localizedDescription();

	@Generated
	@Selector("localizedFailureReason")
	public native String localizedFailureReason();

	@Generated
	@Selector("localizedRecoveryOptions")
	public native NSArray localizedRecoveryOptions();

	@Generated
	@Selector("localizedRecoverySuggestion")
	public native String localizedRecoverySuggestion();

	@Generated
	@Selector("recoveryAttempter")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object recoveryAttempter();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("userInfo")
	public native NSDictionary userInfo();
}
