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

package mac.appkit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.coregraphics.struct.CGPoint;
import mac.coregraphics.struct.CGRect;

@Generated
@Library("AppKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSlider extends NSControl {
	static {
		NatJ.register();
	}

	@Generated
	protected NSSlider(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("acceptsFirstMouse:")
	public native boolean acceptsFirstMouse(NSEvent theEvent);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSSlider alloc();

	@Generated
	@Selector("allowsTickMarkValuesOnly")
	public native boolean allowsTickMarkValuesOnly();

	@Generated
	@Selector("altIncrementValue")
	public native double altIncrementValue();

	@Generated
	@Selector("closestTickMarkValueToValue:")
	public native double closestTickMarkValueToValue(double value);

	@Generated
	@Selector("image")
	public native NSImage image();

	@Generated
	@Selector("indexOfTickMarkAtPoint:")
	public native long indexOfTickMarkAtPoint(@ByValue CGPoint point);

	@Generated
	@Selector("init")
	public native NSSlider init();

	@Generated
	@Selector("initWithFrame:")
	public native NSSlider initWithFrame(@ByValue CGRect frameRect);

	@Generated
	@Selector("isVertical")
	public native long isVertical();

	@Generated
	@Selector("knobThickness")
	public native double knobThickness();

	@Generated
	@Selector("maxValue")
	public native double maxValue();

	@Generated
	@Selector("minValue")
	public native double minValue();

	@Generated
	@Selector("numberOfTickMarks")
	public native long numberOfTickMarks();

	@Generated
	@Selector("rectOfTickMarkAtIndex:")
	@ByValue
	public native CGRect rectOfTickMarkAtIndex(long index);

	@Generated
	@Selector("setAllowsTickMarkValuesOnly:")
	public native void setAllowsTickMarkValuesOnly(boolean yorn);

	@Generated
	@Selector("setAltIncrementValue:")
	public native void setAltIncrementValue(double incValue);

	@Generated
	@Selector("setImage:")
	public native void setImage(NSImage backgroundImage);

	@Generated
	@Selector("setKnobThickness:")
	public native void setKnobThickness(double aFloat);

	@Generated
	@Selector("setMaxValue:")
	public native void setMaxValue(double aDouble);

	@Generated
	@Selector("setMinValue:")
	public native void setMinValue(double aDouble);

	@Generated
	@Selector("setNumberOfTickMarks:")
	public native void setNumberOfTickMarks(long count);

	@Generated
	@Selector("setTickMarkPosition:")
	public native void setTickMarkPosition(long position);

	@Generated
	@Selector("setTitle:")
	public native void setTitle(String aString);

	@Generated
	@Selector("setTitleCell:")
	public native void setTitleCell(NSCell aCell);

	@Generated
	@Selector("setTitleColor:")
	public native void setTitleColor(NSColor newColor);

	@Generated
	@Selector("setTitleFont:")
	public native void setTitleFont(NSFont fontObj);

	@Generated
	@Selector("tickMarkPosition")
	public native long tickMarkPosition();

	@Generated
	@Selector("tickMarkValueAtIndex:")
	public native double tickMarkValueAtIndex(long index);

	@Generated
	@Selector("title")
	public native String title();

	@Generated
	@Selector("titleCell")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object titleCell();

	@Generated
	@Selector("titleColor")
	public native NSColor titleColor();

	@Generated
	@Selector("titleFont")
	public native NSFont titleFont();
}
