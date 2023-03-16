#
# Copyright (c) 2023 Joel Winarske. All rights reserved.
#

SUMMARY = "Library to communicate with Movidius devices"
DESCRIPTION = "A cross-platform library for communicating with devices over various physical links."
AUTHOR = "luxonis"
HOMEPAGE = "https://github.com/luxonis/XLink"
BUGTRACKER = "https://github.com/luxonis/XLink/issues"
SECTION = "connectivity"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"


DEPENDS += "\
    libusb1 \
"

SRCREV="d209b7eeb8ac68435df5097e57e1dfd8ea1d0e83"
SRC_URI = "\
    git://github.com/luxonis/XLink.git;protocol=https;branch=master \
    file://0001-Remove-Hunter.patch \
    "

S = "${WORKDIR}/git"

inherit cmake pkgconfig

PACKAGECONFIG ??= "examples tests pic"

PACKAGECONFIG[pic] = "-DCMAKE_POSITION_INDEPENDENT_CODE=ON, -DCMAKE_POSITION_INDEPENDENT_CODE=OFF"
PACKAGECONFIG[examples] = "-DXLINK_BUILD_EXAMPLES=ON, -DXLINK_BUILD_EXAMPLES=OFF"
PACKAGECONFIG[tests] = "-DXLINK_BUILD_TESTS=ON, -DXLINK_BUILD_TESTS=OFF"
PACKAGECONFIG[myriad-no-boot] = "-DENABLE_MYRIAD_NO_BOOT=ON,"

EXTRA_OECMAKE += "\
    -D XLINK_LIBUSB_SYSTEM=ON \
    "

PACKAGES =+ "\
    ${PN}-examples \
    ${PN}-tests \
    "

FILES_${PN}-examples = "\
    ${bindir}/bootbootloader \
    ${bindir}/bootfirmware \
    ${bindir}/listdevices \
    "

FILES_${PN}-tests = "\
    ${bindir}/multiple_open_stream \
    ${bindir}/multithreading_search_test \
"
