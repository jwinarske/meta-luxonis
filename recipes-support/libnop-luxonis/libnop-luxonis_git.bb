#
# Copyright (c) 2023 Joel Winarske. All rights reserved.
#

SUMMARY = "libnop: C++ Native Object Protocols"
AUTHOR = "Google"
HOMEPAGE = "https://github.com/google/libnop"
BUGTRACKER = "https://github.com/google/libnop/issues"
SECTION = "support"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4e5640559f0849cf863b1dc47bac078b"

SRCREV = "ab842f51dc2eb13916dc98417c2186b78320ed10"
SRC_URI = "git://github.com/luxonis/libnop.git;protocol=https;nobranch=1"

S = "${WORKDIR}/git"

inherit cmake
