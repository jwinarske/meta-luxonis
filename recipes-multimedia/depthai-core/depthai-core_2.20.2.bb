#
# Copyright (c) 2023 Joel Winarske. All rights reserved.
#

SUMMARY = "DepthAI C++ Library"
AUTHOR = "luxonis"
HOMEPAGE = "https://github.com/luxonis/depthai-core"
BUGTRACKER = "https://github.com/luxonis/depthai-core/issues"
SECTION = "multimedia"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=39a6484daa66eaf84c7ee9c45e34db02"

DEPENDS += "\
    backward \
    bzip2 \
    fp16-luxonis \
    libarchive-luxonis \
    libnop-luxonis \
    libusb \
    nlohmann-json \
    psimd \
    spdlog \
    xlink-luxonis \
    xz \
    zlib \
    "

SRCREV = "4ff860838726a5e8ac0cbe59128c58a8f6143c6c"

SRC_URI = "\
    gitsm://github.com/luxonis/depthai-core.git;protocol=https;nobranch=1;name=core \
    file://0001-Remove-Hunter.patch \
    \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/mobilenet-ssd_openvino_2021.4_6shave.blob;name=mobilenet_blob \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/yolo-v3-tiny-tf_openvino_2021.4_6shave.blob;name=tiny_yolo_v3_blob \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/yolo-v4-tiny-tf_openvino_2021.4_6shave.blob;name=tiny_yolo_v4_blob \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/mobilenet-ssd_openvino_2021.4_5shave.blob;name=mobilenet_5shaves_blob \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/mobilenet-ssd_openvino_2021.4_8shave.blob;name=mobilenet_8shaves_blob \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/construction_vest.mp4;name=construction_vest \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/misc/depthai_calib.json;name=calib_v6 \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/misc/depthai_v5.calib;name=calib_v5 \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/misc/BW1098OBC.json;name=device_config \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/person-detection-retail-0013_openvino_2021.4_7shave.blob;name=person_detection \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/concat_openvino_2021.4_6shave.blob;name=concat_model \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/normalize_openvino_2021.4_4shave.blob;name=normalization_model \
    \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/mobilenet-ssd_openvino_2021.2_8shave.blob;name=mobilenet_blob1 \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/text-image-super-resolution-0001_2020.3_4shave.blob;name=openvino_2020_3_blob \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/text-image-super-resolution-0001_2020.4_4shave.blob;name=openvino_2020_4_blob \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/text-image-super-resolution-0001_2021.1_4shave.blob;name=openvino_2021_1_blob \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/text-image-super-resolution-0001_2021.2_4shave.blob;name=openvino_2021_2_blob \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/text-image-super-resolution-0001_2021.3_4shave.blob;name=openvino_2021_3_blob \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/text-image-super-resolution-0001_2021.4.2_4shave.blob;name=openvino_2021_4_2_blob \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/text-image-super-resolution-0001_2022.1.0_4shave.blob;name=openvino_2022_1_blob \
    https://artifacts.luxonis.com/artifactory/luxonis-depthai-data-local/network/yolo-v4-tiny-tf_openvino_2021.4_4shave.blob;name=tiny_yolo_v4_2021-4_4shave_blob \
    "


# Example Models
SRC_URI[mobilenet_blob.sha1sum]         = "4f4506726e3083981064938a0faaf9af6180d2c6"
SRC_URI[tiny_yolo_v3_blob.sha1sum]      = "dedb2d4d96b23e42d15c15e454b8f02eca2713de"
SRC_URI[tiny_yolo_v4_blob.sha1sum]      = "d8d09b697dac298fe83cf8856740a21b1a61ab89"
SRC_URI[mobilenet_5shaves_blob.sha1sum] = "14ab3ef446b8a649d6694d94c2fc8b798efd74a3"
SRC_URI[mobilenet_8shaves_blob.sha1sum] = "7e7ea9a680668f3ca9e8f1d22cc8f3f1a02ac018"
SRC_URI[construction_vest.sha1sum]      = "271d8d0b702e683ce02957db7c100843de5ceaec"
SRC_URI[calib_v6.sha1sum]               = "ec50a47496473116c51cec1c8249bff2679383c3"
SRC_URI[calib_v5.sha1sum]               = "adfe9976b9aacfdaa76ac7138810999988177e71"
SRC_URI[device_config.sha1sum]          = "1e84b6c339ac51e3b254775090b91235a40fac71"
SRC_URI[person_detection.sha1sum]       = "946d102874b287292cdb5952fa66356c8d36025f"
SRC_URI[concat_model.sha1sum]           = "e4af6fb2bed39648a2a4424d8bdc5bac56d616df"
SRC_URI[normalization_model.sha1sum]    = "1435f6d11e0dfdbc60f2dfa45aecd3d530b6153b"

# Test Models
SRC_URI[mobilenet_blob1.sha1sum]        = "3329bb8f3a9c881ef9756d232055f9d6f38aa07b"
SRC_URI[openvino_2020_3_blob.sha1sum]   = "f0134c9b843fe414f6d98b17a70f069d1ab0f3d8"
SRC_URI[openvino_2020_4_blob.sha1sum]   = "25dcf0b146da8c85c9c4cba00ad5fdd4ed02a1b6"
SRC_URI[openvino_2021_1_blob.sha1sum]   = "39c4f47f2a75627b7561e97dd7cdfcd0b1925a1e"
SRC_URI[openvino_2021_2_blob.sha1sum]   = "a204467f86aa4ad63d31782ada271bea6f57f789"
SRC_URI[openvino_2021_3_blob.sha1sum]   = "af19470feb59317e74d045bc31d93ca129c46674"
SRC_URI[openvino_2021_4_2_blob.sha1sum] = "164b6b2ae48d38bc4f07cc8296b8bcb7644a1578"
SRC_URI[openvino_2022_1_blob.sha1sum]   = "98e94b865b9c48a92eaebd1ddc883712dfe7cfcb"
SRC_URI[tiny_yolo_v4_2021-4_4shave_blob.sha1sum] = "7da2f96f7300e3828940557e6a86ac6f243eef7e"


S = "${WORKDIR}/git"

inherit cmake pkgconfig

PACKAGECONFIG ??= "examples tests opencv resource-compile usb2-patch-only-mode"

PACKAGECONFIG[examples]             = "-DDEPTHAI_BUILD_EXAMPLES=ON,           -DDEPTHAI_BUILD_EXAMPLES=OFF, opencv"
PACKAGECONFIG[tests]                = "-DDEPTHAI_BUILD_TESTS=ON,              -DDEPTHAI_BUILD_TESTS=OFF, catch2"
PACKAGECONFIG[opencv]               = "-DDEPTHAI_OPENCV_SUPPORT=ON,           -DDEPTHAI_OPENCV_SUPPORT=OFF,opencv"
PACKAGECONFIG[resource-compile]     = "-DDEPTHAI_BINARIES_RESOURCE_COMPILE=ON,-DDEPTHAI_BINARIES_RESOURCE_COMPILE=OFF"
PACKAGECONFIG[usb2-patch-only-mode] = "-DDEPTHAI_USB2_PATCH_ONLY_MODE=ON,     -DDEPTHAI_USB2_PATCH_ONLY_MODE=OFF"


EXTRA_OECMAKE += "\
    \
    -D DEPTHAI_CLANG_FORMAT=OFF \
    -D DEPTHAI_INSTALL=ON \
    -D CMAKE_SKIP_RPATH=TRUE \
    -D DEPTHAI_XLINK_LOCAL=OFF \
    -D DEPTHAI_ENABLE_BACKWARD=ON \
    \
    -Dmobilenet_blob="${datadir}/luxonis/examples/mobilenet-ssd_openvino_2021.4_6shave.blob" \
    -Dmobilenet_5shaves_blob="${datadir}/luxonis/examples/mobilenet-ssd_openvino_2021.4_5shave.blob" \
    -Dmobilenet_8shaves_blob="${datadir}/luxonis/examples/mobilenet-ssd_openvino_2021.4_8shave.blob" \
    -Dconstruction_vest="${datadir}/luxonis/examples/construction_vest.mp4" \
    -Dconcat_model="${datadir}/luxonis/examples/concat_openvino_2021.4_6shave.blob" \
    -Dnormalization_model="${datadir}/luxonis/examples/normalize_openvino_2021.4_4shave.blob" \
    -Dperson_detection="${datadir}/luxonis/examples/person-detection-retail-0013_openvino_2021.4_7shave.blob" \
    -Dtiny_yolo_v3_blob="${datadir}/luxonis/examples/yolo-v3-tiny-tf_openvino_2021.4_6shave.blob" \
    -Dtiny_yolo_v4_blob="${datadir}/luxonis/examples/yolo-v4-tiny-tf_openvino_2021.4_6shave.blob" \
    \
    -Dtest_mobilenet_blob="${datadir}/luxonis/tests/mobilenet-ssd_openvino_2021.2_8shave.blob" \
    -Dtest_openvino_2020_3_blob="${datadir}/luxonis/tests/text-image-super-resolution-0001_2020.3_4shave.blob" \
    -Dtest_openvino_2020_4_blob="${datadir}/luxonis/tests/text-image-super-resolution-0001_2020.4_4shave.blob" \
    -Dtest_openvino_2021_1_blob="${datadir}/luxonis/tests/text-image-super-resolution-0001_2021.1_4shave.blob" \
    -Dtest_openvino_2021_2_blob="${datadir}/luxonis/tests/text-image-super-resolution-0001_2021.2_4shave.blob" \
    -Dtest_openvino_2021_3_blob="${datadir}/luxonis/tests/text-image-super-resolution-0001_2021.3_4shave.blob" \
    -Dtest_openvino_2021_4_2_blob="${datadir}/luxonis/tests/text-image-super-resolution-0001_2021.4.2_4shave.blob" \
    -Dtest_openvino_2022_1_blob="${datadir}/luxonis/tests/text-image-super-resolution-0001_2022.1.0_4shave.blob" \
    -Dtest_tiny_yolo_v4_2021-4_4shave_blob="${datadir}/luxonis/tests/yolo-v4-tiny-tf_openvino_2021.4_4shave.blob" \
    "

do_configure[network] = "1"

do_install:append() {

    if ${@bb.utils.contains('PACKAGECONFIG', 'examples', 'true', 'false', d)}; then

        install -d ${D}${datadir}/luxonis/examples

        install -m 0644 ${WORKDIR}/mobilenet-ssd_openvino_2021.4_6shave.blob                ${D}${datadir}/luxonis/examples
        install -m 0644 ${WORKDIR}/yolo-v3-tiny-tf_openvino_2021.4_6shave.blob              ${D}${datadir}/luxonis/examples
        install -m 0644 ${WORKDIR}/yolo-v4-tiny-tf_openvino_2021.4_6shave.blob              ${D}${datadir}/luxonis/examples
        install -m 0644 ${WORKDIR}/mobilenet-ssd_openvino_2021.4_5shave.blob                ${D}${datadir}/luxonis/examples
        install -m 0644 ${WORKDIR}/mobilenet-ssd_openvino_2021.4_8shave.blob                ${D}${datadir}/luxonis/examples
        install -m 0644 ${WORKDIR}/construction_vest.mp4                                    ${D}${datadir}/luxonis/examples
        install -m 0644 ${WORKDIR}/depthai_calib.json                                       ${D}${datadir}/luxonis/examples
        install -m 0644 ${WORKDIR}/depthai_v5.calib                                         ${D}${datadir}/luxonis/examples
        install -m 0644 ${WORKDIR}/BW1098OBC.json                                           ${D}${datadir}/luxonis/examples
        install -m 0644 ${WORKDIR}/person-detection-retail-0013_openvino_2021.4_7shave.blob ${D}${datadir}/luxonis/examples
        install -m 0644 ${WORKDIR}/concat_openvino_2021.4_6shave.blob                       ${D}${datadir}/luxonis/examples
        install -m 0644 ${WORKDIR}/normalize_openvino_2021.4_4shave.blob                    ${D}${datadir}/luxonis/examples

        install -d ${D}${bindir}/luxonis/examples
        find ${B}/examples -type f -perm /a+x -exec cp {} ${D}${bindir}/luxonis/examples \;
    fi

    if ${@bb.utils.contains('PACKAGECONFIG', 'tests', 'true', 'false', d)}; then

        install -d ${D}${datadir}/luxonis/tests

        install -m 0644 ${WORKDIR}/mobilenet-ssd_openvino_2021.2_8shave.blob                ${D}${datadir}/luxonis/tests
        install -m 0644 ${WORKDIR}/text-image-super-resolution-0001_2020.3_4shave.blob      ${D}${datadir}/luxonis/tests
        install -m 0644 ${WORKDIR}/text-image-super-resolution-0001_2020.4_4shave.blob      ${D}${datadir}/luxonis/tests
        install -m 0644 ${WORKDIR}/text-image-super-resolution-0001_2021.1_4shave.blob      ${D}${datadir}/luxonis/tests
        install -m 0644 ${WORKDIR}/text-image-super-resolution-0001_2021.2_4shave.blob      ${D}${datadir}/luxonis/tests
        install -m 0644 ${WORKDIR}/text-image-super-resolution-0001_2021.3_4shave.blob      ${D}${datadir}/luxonis/tests
        install -m 0644 ${WORKDIR}/text-image-super-resolution-0001_2021.4.2_4shave.blob    ${D}${datadir}/luxonis/tests
        install -m 0644 ${WORKDIR}/text-image-super-resolution-0001_2022.1.0_4shave.blob    ${D}${datadir}/luxonis/tests
        install -m 0644 ${WORKDIR}/yolo-v4-tiny-tf_openvino_2021.4_4shave.blob              ${D}${datadir}/luxonis/tests

        install -d ${D}${bindir}/luxonis/tests
        find ${B}/tests -type f -perm /a+x -exec cp {} ${D}${bindir}/luxonis/tests \;
    fi
}

PACKAGES =+ "\
    ${PN}-examples \
    ${PN}-tests \
    "

FILES:${PN}-examples = "\
    ${datadir}/luxonis/examples \
    ${bindir}/luxonis/examples \
    "

FILES:${PN}-tests = "\
    ${datadir}/luxonis/tests \
    ${bindir}/luxonis/tests \    
"
