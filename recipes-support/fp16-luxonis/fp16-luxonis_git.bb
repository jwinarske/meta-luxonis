#
# Copyright (c) 2023 Joel Winarske. All rights reserved.
#

SUMMARY = "Conversion to/from half-precision floating point formats"
DESCRIPTION = "Header-only library for conversion to/from half-precision floating point formats"
AUTHOR = "Marat Dukhan"
HOMEPAGE = "https://github.com/Maratyszcza/FP16"
BUGTRACKER = "https://github.com/Maratyszcza/FP16/issues"
SECTION = "support"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=998fb0b16ad8a4fb8bd41bf3faf2d21c"

DEPENDS += " psimd"

SRCREV="c911175d2717e562976e606c6e5f799bf40cf94e"
SRC_URI = "\
    git://github.com/luxonis/FP16.git;protocol=https;branch=master \
    file://0001-Do-not-configure-psimd.patch \
    "

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "\
    -D PSIMD_SOURCE_DIR=${STAGING_INCDIR}/psimd \
    -D FP16_BUILD_BENCHMARKS=OFF \
    -D FP16_BUILD_TESTS=OFF \
    "
