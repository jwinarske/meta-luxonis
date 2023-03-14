SUMMARY = "Movidius USB Rule"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "\
    file://80-movidius.rules \
"

do_install () {
    install -Dm0666 ${WORKDIR}/80-movidius.rules ${D}/etc/udev/rules.d/80-movidius.rules
}    

FILES:${PN} += "/etc/udev/rules.d"
