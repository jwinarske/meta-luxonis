#
# Copyright (c) 2023 Joel Winarske. All rights reserved.
#

SUMMARY = "Fast C++ logging library."
AUTHOR = "Gabi Melman"
HOMEPAGE = "https://github.com/gabime/spdlog"
BUGTRACKER = "https://github.com/gabime/spdlog/issues"
SECTION = "support"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd5cc7fa6ff5ee46fc1047f0f0c895b7"

SRCREV = "de0dbfa3596a18cd70a4619b6a9766847a941276"
SRC_URI = "git://github.com/gabime/spdlog.git;protocol=https;nobranch=1"

S = "${WORKDIR}/git"

inherit cmake

PACKAGECONFIG ??= "pic"

PACKAGECONFIG[pic] = "-DCMAKE_POSITION_INDEPENDENT_CODE=ON, -DCMAKE_POSITION_INDEPENDENT_CODE=OFF"

EXTRA_OECMAKE += "\
    -D SPDLOG_BUILD_EXAMPLE=OFF \
    -D SPDLOG_FMT_EXTERNAL=OFF \
    -D CMAKE_CXX_VISIBILITY_PRESET=hidden \
    -D CMAKE_C_VISIBILITY_PRESET=hidden \
    "
