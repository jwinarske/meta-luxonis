#
# Copyright (c) 2024 Stephen Street (stephen@redrocketcomputing.com). All rights reserved.
#

SUMMARY = "An implementation of C++17 std::filesystem for C++11 /C++14/C++17/C++20 on Windows, macOS, Linux and FreeBSD."
DESCRIPTION = "This is a header-only single-file std::filesystem compatible helper library, based on the C++17 and C++20 specs, but implemented for C++11, C++14, C++17 or C++20 (tightly following the C++17 standard with very few documented exceptions)."
AUTHOR = "Steffen Schümann"
HOMEPAGE = "https://github.com/gulrak/filesystem"
BUGTRACKER = "https://github.com/gulrak/filesystem/issues"
SECTION = "support"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0e30d84046fa808d0addd61d412bc9d1"

SRCREV="8a2edd6d92ed820521d42c94d179462bf06b5ed3"
SRC_URI = "\
    git://github.com/gulrak/filesystem.git;protocol=https;branch=master \
    "

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "\
    -D GHC_FILESYSTEM_BUILD_EXAMPLES=OFF \
    -D GHC_FILESYSTEM_BUILD_TESTING=OFF \
    "
