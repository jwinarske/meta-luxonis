#
# Copyright (c) 2023 Joel Winarske. All rights reserved.
#

SUMMARY = "Portable 128-bit SIMD intrinsics "
AUTHOR = "Marat Dukhan"
HOMEPAGE = "https://github.com/Maratyszcza/psimd/"
BUGTRACKER = "https://github.com/Maratyszcza/psimd/issues"
SECTION = "support"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1a15870c3c6ac367fa27851881128c00"


SRCREV="072586a71b55b7f8c584153d223e95687148a900"
SRC_URI = "git://github.com/Maratyszcza/psimd.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake
