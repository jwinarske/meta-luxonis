#
# Copyright (c) 2023 Joel Winarske. All rights reserved.
#

SUMMARY = "Multi-format archive and compression library "
DESCRIPTION = "The libarchive project develops a portable, \
    efficient C library that can read and write streaming \
    archives in a variety of formats. It also includes \
    implementations of the common tar, cpio, and zcat \
    command-line tools that use the libarchive library."
AUTHOR = "libarchive"
HOMEPAGE = "https://github.com/libarchive/libarchive"
BUGTRACKER = "https://github.com/libarchive/libarchive/issues"
SECTION = "support"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

DEPENDS += " xz"

SRCREV = "45baa3a3e57104519e1165bcd5ac29c3bd8c9f3a"
SRC_URI = "\
    git://github.com/luxonis/libarchive.git;protocol=https;nobranch=1 \
    file://0001-Remove-Hunter.patch \
    "

S = "${WORKDIR}/git"

inherit cmake pkgconfig

EXTRA_OECMAKE += "\
    -D CMAKE_POSITION_INDEPENDENT_CODE=ON \
    -D BACKWARD_TESTS=OFF \
    -D ENABLE_ACL=OFF \
    -D ENABLE_BZip2=OFF \
    -D ENABLE_CAT=OFF \
    -D ENABLE_CAT_SHARED=OFF \
    -D ENABLE_CNG=OFF \
    -D ENABLE_COVERAGE=OFF \
    -D ENABLE_CPIO=OFF \
    -D ENABLE_CPIO_SHARED=OFF \
    -D ENABLE_EXPAT=OFF \
    -D ENABLE_ICONV=OFF \
    -D ENABLE_INSTALL=ON \
    -D ENABLE_LIBB2=OFF \
    -D ENABLE_LIBXML2=OFF \
    -D ENABLE_LZ4=OFF \
    -D ENABLE_LZMA=ON \
    -D ENABLE_LZO=OFF \
    -D ENABLE_LibGCC=OFF \
    -D ENABLE_MBEDTLS=OFF \
    -D ENABLE_NETTLE=OFF \
    -D ENABLE_OPENSSL=OFF \
    -D ENABLE_PCREPOSIX=OFF \
    -D ENABLE_SAFESEH=AUTO \
    -D ENABLE_TAR=OFF \
    -D ENABLE_TAR_SHARED=OFF \
    -D ENABLE_TEST=OFF \
    -D ENABLE_WERROR=OFF \
    -D ENABLE_XATTR=OFF \
    -D ENABLE_ZLIB=OFF \
    -D ENABLE_ZSTD=OFF \
    "
