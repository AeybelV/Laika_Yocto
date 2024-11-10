SUMMARY = "Laika Base Image"
IMAGE_FEATURES += "splash"
LICENSE = "MIT"
inherit core-image

IMAGE_INSTALL += '\
    os-release \
    bash \
    '
