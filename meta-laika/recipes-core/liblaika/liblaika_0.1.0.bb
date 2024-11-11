DESCRIPTION = "Library for the Laika Flight Computer"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/AeybelV/liblaika.git;branch=main;protocol=https"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

inherit cargo

do_install() {
    # libs
    install -d ${D}${libdir}
    install -m 0755 ${B}/target/${CARGO_TARGET_SUBDIR}/liblaika.so ${D}${libdir}/liblaika.so.${PV}
    ln -s -r ${D}${libdir}/liblaika.so.${PV} ${D}${libdir}/liblaika.so  # Create symlink to the versioned library
    
    #includes
    install -d ${D}${includedir}/liblaika
    install -m 0644 ${S}/include/liblaika.h ${D}${includedir}/liblaika/
}

# Split the package for library and dev files
FILES_SOLIBSDEV = ""
FILES_SOLIBS = ""
FILES:${PN} += "${libdir}/*.so*"
FILES:${PN}-dev += "${includedir}/liblaika/*"
FILES:${PN}-dbg += "${libdir}/.debug/*"
INSANE_SKIP:${PN} = "dev-so"

# Ensure the shared library is built
CARGO_BUILD_TARGET ?= "${TARGET_SYS}"
EXTRA_OECARGO += "--release"
