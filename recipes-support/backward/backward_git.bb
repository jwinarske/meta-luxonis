#
# Copyright (c) 2023 Joel Winarske. All rights reserved.
#

SUMMARY = "A beautiful stack trace pretty printer for C++"
AUTHOR = "François-Xavier Bourlet"
HOMEPAGE = "https://github.com/bombela/backward-cpp"
BUGTRACKER = "https://github.com/bombela/backward-cpp/issues"
SECTION = "support"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=74ea9734864a5514a5d672f385e3b382"

SRCREV = "3bb9240cb15459768adb3e7d963a20e1523a6294"
SRC_URI = "git://github.com/bombela/backward-cpp.git;protocol=https;branch=master"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "\
    -D BACKWARD_TESTS=OFF \
    "
