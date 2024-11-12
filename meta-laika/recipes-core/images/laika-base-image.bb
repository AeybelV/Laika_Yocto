SUMMARY = "Laika Base Image"
IMAGE_FEATURES += "splash"
LICENSE = "MIT"
inherit core-image

IMAGE_FEATURES += "tools-sdk"

IMAGE_INSTALL += '\
    os-release \
    bash \
    gcc \
    g++ \
    make \
    util-linux \
    liblaika-dev \
    '
