FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

# MMC SPI
SRC_URI += "file://mmc_spi-overlay.dts;subdir=git/arch/${ARCH}/boot/dts/overlays"
