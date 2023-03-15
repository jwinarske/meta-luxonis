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
FWP_DEVICE_COMMIT = "8c3d6ac1c77b0bf7f9ea6fd4d962af37663d2fbd"
FWP_BOOT_VER = "0.0.24"

DEPTHAI_BOOTLOADER_FWP_PATH = "depthai-bootloader-fwp-${FWP_BOOT_VER}.tar.xz"
DEPTHAI_DEVICE_FWP_FILENAME = "depthai-device-fwp-${FWP_DEVICE_COMMIT}.tar.xz"
DEPTHAI_ARTIFACTORY_URL     = "https://artifacts.luxonis.com/artifactory"

SRC_URI = "\
    gitsm://github.com/luxonis/depthai-core.git;protocol=https;nobranch=1;name=core \
    file://0001-Remove-Hunter.patch \
    \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-myriad-release-local/depthai-bootloader/${FWP_BOOT_VER}/${DEPTHAI_BOOTLOADER_FWP_PATH};unpack=0;name=bootloader-fwp \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-myriad-snapshot-local/depthai-device-side/${FWP_DEVICE_COMMIT}/${DEPTHAI_DEVICE_FWP_FILENAME};unpack=0;name=device-fwp \
    \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/mobilenet-ssd_openvino_2021.4_6shave.blob;name=mobilenet_blob \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/yolo-v3-tiny-tf_openvino_2021.4_6shave.blob;name=tiny_yolo_v3_blob \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/yolo-v4-tiny-tf_openvino_2021.4_6shave.blob;name=tiny_yolo_v4_blob \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/mobilenet-ssd_openvino_2021.4_5shave.blob;name=mobilenet_5shaves_blob \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/mobilenet-ssd_openvino_2021.4_8shave.blob;name=mobilenet_8shaves_blob \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/construction_vest.mp4;name=construction_vest \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/misc/depthai_calib.json;name=calib_v6 \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/misc/depthai_v5.calib;name=calib_v5 \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/misc/BW1098OBC.json;name=device_config \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/person-detection-retail-0013_openvino_2021.4_7shave.blob;name=person_detection \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/concat_openvino_2021.4_6shave.blob;name=concat_model \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/normalize_openvino_2021.4_4shave.blob;name=normalization_model \
    \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/mobilenet-ssd_openvino_2021.2_8shave.blob;name=mobilenet_blob1 \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/text-image-super-resolution-0001_2020.3_4shave.blob;name=openvino_2020_3_blob \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/text-image-super-resolution-0001_2020.4_4shave.blob;name=openvino_2020_4_blob \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/text-image-super-resolution-0001_2021.1_4shave.blob;name=openvino_2021_1_blob \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/text-image-super-resolution-0001_2021.2_4shave.blob;name=openvino_2021_2_blob \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/text-image-super-resolution-0001_2021.3_4shave.blob;name=openvino_2021_3_blob \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/text-image-super-resolution-0001_2021.4.2_4shave.blob;name=openvino_2021_4_2_blob \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/text-image-super-resolution-0001_2022.1.0_4shave.blob;name=openvino_2022_1_blob \
    ${DEPTHAI_ARTIFACTORY_URL}/luxonis-depthai-data-local/network/yolo-v4-tiny-tf_openvino_2021.4_4shave.blob;name=tiny_yolo_v4_2021-4_4shave_blob \
    "

# Firmware Packages
SRC_URI[bootloader-fwp.sha256sum]         = "c913c636c86652ea96eda2135a517620f7d528d6357ddc697edfa20762a7cb30"
SRC_URI[device-fwp.sha256sum]             = "7b036b9ab1b5c20d37dffd4977ccbe1c43b54dbf770a2abbcdcfd3d4ffdf04b1"

# Example Models
SRC_URI[mobilenet_blob.sha256sum]         = "5ae9cb636bfa40df02c2ca3e64bc68a6690abd8a147903d4580aea6b6feb9c1c"
SRC_URI[tiny_yolo_v3_blob.sha256sum]      = "f2729a42e277e994ba68f0e914b66fe52ce665175a80a5596b8d50d18b220343"
SRC_URI[tiny_yolo_v4_blob.sha256sum]      = "0229c068ff220631affd323b84eece865bfe28d5fe8950ab602825a8444b86f4"
SRC_URI[mobilenet_5shaves_blob.sha256sum] = "782d80902c5ce7da01f8fc83894b68da33216edc93d94afb16dd7576a25e50e2"
SRC_URI[mobilenet_8shaves_blob.sha256sum] = "8c9a0189d95580b2442c88539af3198a433efd41b9b0837cea8d09a4d16a2d4a"
SRC_URI[construction_vest.sha256sum]      = "2f35ea35a41e98ee17dc9136c495ed0ff3aa7ba6774d5eedc2b9935350c6084f"
SRC_URI[calib_v6.sha256sum]               = "f27dc05a57d2d964189e459599b1633556dc647e67a3b7e3eb7fe1b00740f157"
SRC_URI[calib_v5.sha256sum]               = "c258902222d7b9ec55eee56b1b39255f9a3bb55c02eb8c5228f5a251c70740ee"
SRC_URI[device_config.sha256sum]          = "fed667afd54e97b4918f1118788ae14acd6461ac6364850e32686ce111fa4528"
SRC_URI[person_detection.sha256sum]       = "4a5d7ef7c27ddbae51a3bfe20b093006f44b3b6329c8d5f6482f9f348b21ad37"
SRC_URI[concat_model.sha256sum]           = "6ac3023ea8dac9b7501ead0f9b2c2a4495d2791a58b7049de065246455cf87be"
SRC_URI[normalization_model.sha256sum]    = "9b5dc4b375ed9218c2910284556f8152cbfcc0130e7b7a42d9a9991eae8be23a"

# Test Models
SRC_URI[mobilenet_blob1.sha256sum]        = "e0c60156ee97b01ac115ad838d13c8d90559064fec04c6d423bb03fdc40524eb"
SRC_URI[openvino_2020_3_blob.sha256sum]   = "681fb8532c5b9e39f40b4332f3ed5cede454305d3993b711bec4bb31f448993a"
SRC_URI[openvino_2020_4_blob.sha256sum]   = "840800c8cc043a43352f3a5438ec35c477de19e6daf32d99d4cbcf4542949a37"
SRC_URI[openvino_2021_1_blob.sha256sum]   = "9550a3b76a8a7e987d1d2881399aa84ed671ec7d6225ac20a2cd7acf9471f034"
SRC_URI[openvino_2021_2_blob.sha256sum]   = "b0f88c76cfa4a4158614f654b6da1b4600137fd89df07e9f73cb8893146a4b5e"
SRC_URI[openvino_2021_3_blob.sha256sum]   = "6e563fe1f0da4d1f813acffb16050c4ab53baa98d8818514639036e156b2857f"
SRC_URI[openvino_2021_4_2_blob.sha256sum] = "5c83cb3ce7d5a29357a975e5df3cd1163741a133695c7904cd4408e33f07f1bc"
SRC_URI[openvino_2022_1_blob.sha256sum]   = "3a4ec484d2890835adb239c06ae1f22b1141c02cc70bd2661b7f9e37703a23ee"
SRC_URI[tiny_yolo_v4_2021-4_4shave_blob.sha256sum] = "68e9fc04971f602038457505f7d90f3db81e0bf6f73bfa0e1fed5486ec6ffcc3"


inherit cmake pkgconfig

PACKAGECONFIG ??= "examples tests opencv resource-compile"

PACKAGECONFIG[examples]             = "-DDEPTHAI_BUILD_EXAMPLES=ON,           -DDEPTHAI_BUILD_EXAMPLES=OFF, opencv"
PACKAGECONFIG[tests]                = "-DDEPTHAI_BUILD_TESTS=ON,              -DDEPTHAI_BUILD_TESTS=OFF, catch2"
PACKAGECONFIG[opencv]               = "-DDEPTHAI_OPENCV_SUPPORT=ON,           -DDEPTHAI_OPENCV_SUPPORT=OFF,opencv"
PACKAGECONFIG[resource-compile]     = "-DDEPTHAI_BINARIES_RESOURCE_COMPILE=ON,-DDEPTHAI_BINARIES_RESOURCE_COMPILE=OFF"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "\
    \
    -D DEPTHAI_CLANG_FORMAT=OFF \
    -D DEPTHAI_INSTALL=ON \
    -D CMAKE_SKIP_RPATH=TRUE \
    -D DEPTHAI_XLINK_LOCAL=OFF \
    -D DEPTHAI_ENABLE_BACKWARD=ON \
    \
    -D DEPTHAI_BOOTLOADER_FWP_PATH=${WORKDIR}/build/resources/${DEPTHAI_BOOTLOADER_FWP_PATH} \
    -D DEPTHAI_DEVICE_FWP_PATH=${WORKDIR}/build/resources/${DEPTHAI_DEVICE_FWP_FILENAME} \
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

do_configure:prepend() {

    if ${@bb.utils.contains('PACKAGECONFIG', 'resource-compile', 'true', 'false', d)}; then
        mkdir -p ${WORKDIR}/build/resources
        cp ${WORKDIR}/${DEPTHAI_BOOTLOADER_FWP_PATH} ${WORKDIR}/build/resources
        cp ${WORKDIR}/${DEPTHAI_DEVICE_FWP_FILENAME} ${WORKDIR}/build/resources
    fi
}

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
