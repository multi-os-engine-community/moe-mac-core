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

//
//  Foundation.m
//

#import <CoreFoundation/CFBase.h>
#import <CoreGraphics/CGBase.h>
#import <CoreGraphics/CGGeometry.h>
#import <Foundation/NSByteOrder.h>
#import <Foundation/NSDecimal.h>
#import <Foundation/NSGeometry.h>
#import <Foundation/NSObject.h>
#import <Foundation/NSRange.h>
#import <Foundation/NSZone.h>
#import <objc/NSObjCRuntime.h>


#define EXPORT __attribute__ ((visibility ("default")))

EXPORT id __natj_inline_NSMakeCollectable(CFTypeRef cf) {
	return NSMakeCollectable(cf);
}

EXPORT CFTypeRef __natj_inline_CFBridgingRetain(id X) {
	return CFBridgingRetain(X);
}

EXPORT id __natj_inline_CFBridgingRelease(CFTypeRef X) {
	return CFBridgingRelease(X);
}

EXPORT NSRange __natj_inline_NSMakeRange(NSUInteger loc, NSUInteger len) {
	return NSMakeRange(loc, len);
}

EXPORT NSUInteger __natj_inline_NSMaxRange(NSRange range) {
	return NSMaxRange(range);
}

EXPORT BOOL __natj_inline_NSLocationInRange(NSUInteger loc, NSRange range) {
	return NSLocationInRange(loc, range);
}

EXPORT BOOL __natj_inline_NSEqualRanges(NSRange range1, NSRange range2) {
	return NSEqualRanges(range1, range2);
}

EXPORT long __natj_inline_NSHostByteOrder() {
	return NSHostByteOrder();
}

EXPORT unsigned short __natj_inline_NSSwapShort(unsigned short inv) {
	return NSSwapShort(inv);
}

EXPORT unsigned int __natj_inline_NSSwapInt(unsigned int inv) {
	return NSSwapInt(inv);
}

EXPORT unsigned long __natj_inline_NSSwapLong(unsigned long inv) {
	return NSSwapLong(inv);
}

EXPORT unsigned long long __natj_inline_NSSwapLongLong(unsigned long long inv) {
	return NSSwapLongLong(inv);
}

EXPORT unsigned short __natj_inline_NSSwapBigShortToHost(unsigned short x) {
	return NSSwapBigShortToHost(x);
}

EXPORT unsigned int __natj_inline_NSSwapBigIntToHost(unsigned int x) {
	return NSSwapBigIntToHost(x);
}

EXPORT unsigned long __natj_inline_NSSwapBigLongToHost(unsigned long x) {
	return NSSwapBigLongToHost(x);
}

EXPORT unsigned long long __natj_inline_NSSwapBigLongLongToHost(unsigned long long x) {
	return NSSwapBigLongLongToHost(x);
}

EXPORT unsigned short __natj_inline_NSSwapHostShortToBig(unsigned short x) {
	return NSSwapHostShortToBig(x);
}

EXPORT unsigned int __natj_inline_NSSwapHostIntToBig(unsigned int x) {
	return NSSwapHostIntToBig(x);
}

EXPORT unsigned long __natj_inline_NSSwapHostLongToBig(unsigned long x) {
	return NSSwapHostLongToBig(x);
}

EXPORT unsigned long long __natj_inline_NSSwapHostLongLongToBig(unsigned long long x) {
	return NSSwapHostLongLongToBig(x);
}

EXPORT unsigned short __natj_inline_NSSwapLittleShortToHost(unsigned short x) {
	return NSSwapLittleShortToHost(x);
}

EXPORT unsigned int __natj_inline_NSSwapLittleIntToHost(unsigned int x) {
	return NSSwapLittleIntToHost(x);
}

EXPORT unsigned long __natj_inline_NSSwapLittleLongToHost(unsigned long x) {
	return NSSwapLittleLongToHost(x);
}

EXPORT unsigned long long __natj_inline_NSSwapLittleLongLongToHost(unsigned long long x) {
	return NSSwapLittleLongLongToHost(x);
}

EXPORT unsigned short __natj_inline_NSSwapHostShortToLittle(unsigned short x) {
	return NSSwapHostShortToLittle(x);
}

EXPORT unsigned int __natj_inline_NSSwapHostIntToLittle(unsigned int x) {
	return NSSwapHostIntToLittle(x);
}

EXPORT unsigned long __natj_inline_NSSwapHostLongToLittle(unsigned long x) {
	return NSSwapHostLongToLittle(x);
}

EXPORT unsigned long long __natj_inline_NSSwapHostLongLongToLittle(unsigned long long x) {
	return NSSwapHostLongLongToLittle(x);
}

EXPORT NSSwappedFloat __natj_inline_NSConvertHostFloatToSwapped(float x) {
	return NSConvertHostFloatToSwapped(x);
}

EXPORT float __natj_inline_NSConvertSwappedFloatToHost(NSSwappedFloat x) {
	return NSConvertSwappedFloatToHost(x);
}

EXPORT NSSwappedDouble __natj_inline_NSConvertHostDoubleToSwapped(double x) {
	return NSConvertHostDoubleToSwapped(x);
}

EXPORT double __natj_inline_NSConvertSwappedDoubleToHost(NSSwappedDouble x) {
	return NSConvertSwappedDoubleToHost(x);
}

EXPORT NSSwappedFloat __natj_inline_NSSwapFloat(NSSwappedFloat x) {
	return NSSwapFloat(x);
}

EXPORT NSSwappedDouble __natj_inline_NSSwapDouble(NSSwappedDouble x) {
	return NSSwapDouble(x);
}

EXPORT double __natj_inline_NSSwapBigDoubleToHost(NSSwappedDouble x) {
	return NSSwapBigDoubleToHost(x);
}

EXPORT float __natj_inline_NSSwapBigFloatToHost(NSSwappedFloat x) {
	return NSSwapBigFloatToHost(x);
}

EXPORT NSSwappedDouble __natj_inline_NSSwapHostDoubleToBig(double x) {
	return NSSwapHostDoubleToBig(x);
}

EXPORT NSSwappedFloat __natj_inline_NSSwapHostFloatToBig(float x) {
	return NSSwapHostFloatToBig(x);
}

EXPORT double __natj_inline_NSSwapLittleDoubleToHost(NSSwappedDouble x) {
	return NSSwapLittleDoubleToHost(x);
}

EXPORT float __natj_inline_NSSwapLittleFloatToHost(NSSwappedFloat x) {
	return NSSwapLittleFloatToHost(x);
}

EXPORT NSSwappedDouble __natj_inline_NSSwapHostDoubleToLittle(double x) {
	return NSSwapHostDoubleToLittle(x);
}

EXPORT NSSwappedFloat __natj_inline_NSSwapHostFloatToLittle(float x) {
	return NSSwapHostFloatToLittle(x);
}

EXPORT BOOL __natj_inline_NSDecimalIsNotANumber(const NSDecimal * dcm) {
	return NSDecimalIsNotANumber(dcm);
}

EXPORT NSPoint __natj_inline_NSMakePoint(CGFloat x, CGFloat y) {
	return NSMakePoint(x, y);
}

EXPORT NSSize __natj_inline_NSMakeSize(CGFloat w, CGFloat h) {
	return NSMakeSize(w, h);
}

EXPORT NSRect __natj_inline_NSMakeRect(CGFloat x, CGFloat y, CGFloat w, CGFloat h) {
	return NSMakeRect(x, y, w, h);
}

EXPORT CGFloat __natj_inline_NSMaxX(NSRect aRect) {
	return NSMaxX(aRect);
}

EXPORT CGFloat __natj_inline_NSMaxY(NSRect aRect) {
	return NSMaxY(aRect);
}

EXPORT CGFloat __natj_inline_NSMidX(NSRect aRect) {
	return NSMidX(aRect);
}

EXPORT CGFloat __natj_inline_NSMidY(NSRect aRect) {
	return NSMidY(aRect);
}

EXPORT CGFloat __natj_inline_NSMinX(NSRect aRect) {
	return NSMinX(aRect);
}

EXPORT CGFloat __natj_inline_NSMinY(NSRect aRect) {
	return NSMinY(aRect);
}

EXPORT CGFloat __natj_inline_NSWidth(NSRect aRect) {
	return NSWidth(aRect);
}

EXPORT CGFloat __natj_inline_NSHeight(NSRect aRect) {
	return NSHeight(aRect);
}

EXPORT NSRect __natj_inline_NSRectFromCGRect(CGRect cgrect) {
	return NSRectFromCGRect(cgrect);
}

EXPORT CGRect __natj_inline_NSRectToCGRect(NSRect nsrect) {
	return NSRectToCGRect(nsrect);
}

EXPORT NSPoint __natj_inline_NSPointFromCGPoint(CGPoint cgpoint) {
	return NSPointFromCGPoint(cgpoint);
}

EXPORT CGPoint __natj_inline_NSPointToCGPoint(NSPoint nspoint) {
	return NSPointToCGPoint(nspoint);
}

EXPORT NSSize __natj_inline_NSSizeFromCGSize(CGSize cgsize) {
	return NSSizeFromCGSize(cgsize);
}

EXPORT CGSize __natj_inline_NSSizeToCGSize(NSSize nssize) {
	return NSSizeToCGSize(nssize);
}


