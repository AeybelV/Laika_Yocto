DESCRIPTION = "Library for the Laika Flight Computer"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/AeybelV/liblaika.git;branch=main;protocol=https"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

inherit cargo

do_install() {
    install -d ${D}${libdir}
    install -m 0755 ${B}/target/${CARGO_TARGET_SUBDIR}/liblaika.so ${D}${libdir}/liblaika.so.0.1.0
    ln -sf liblaika.so.0.1.0 ${D}${libdir}/liblaika.so  # Create symlink to the versioned library

}

# Ensure the shared library is built
CARGO_BUILD_TARGET ?= "${TARGET_SYS}"
EXTRA_OECARGO += "--release"
