DESCRIPTION = "Library for the Laika Flight Computer"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/AeybelV/liblaika.git;branch=main;protocol=https"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

# Cargo Dependencies

SRC_URI += " \
    crate://crates.io/android-tzdata/0.1.1 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/autocfg/1.4.0 \
    crate://crates.io/bumpalo/3.16.0 \
    crate://crates.io/cc/1.1.37 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.38 \
    crate://crates.io/core-foundation-sys/0.8.7 \
    crate://crates.io/iana-time-zone-haiku/0.1.2 \
    crate://crates.io/iana-time-zone/0.1.61 \
    crate://crates.io/itoa/1.0.11 \
    crate://crates.io/js-sys/0.3.72 \
    crate://crates.io/libc/0.2.162 \
    crate://crates.io/log/0.4.22 \
    crate://crates.io/memchr/2.7.4 \
    crate://crates.io/num-traits/0.2.19 \
    crate://crates.io/once_cell/1.20.2 \
    crate://crates.io/proc-macro2/1.0.89 \
    crate://crates.io/quote/1.0.37 \
    crate://crates.io/reed-solomon/0.2.1 \
    crate://crates.io/ryu/1.0.18 \
    crate://crates.io/serde/1.0.215 \
    crate://crates.io/serde_derive/1.0.215 \
    crate://crates.io/serde_json/1.0.132 \
    crate://crates.io/shlex/1.3.0 \
    crate://crates.io/syn/2.0.87 \
    crate://crates.io/unicode-ident/1.0.13 \
    crate://crates.io/wasm-bindgen-backend/0.2.95 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.95 \
    crate://crates.io/wasm-bindgen-macro/0.2.95 \
    crate://crates.io/wasm-bindgen-shared/0.2.95 \
    crate://crates.io/wasm-bindgen/0.2.95 \
    crate://crates.io/windows-core/0.52.0 \
    crate://crates.io/windows-targets/0.52.6 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.6 \
    crate://crates.io/windows_aarch64_msvc/0.52.6 \
    crate://crates.io/windows_i686_gnu/0.52.6 \
    crate://crates.io/windows_i686_gnullvm/0.52.6 \
    crate://crates.io/windows_i686_msvc/0.52.6 \
    crate://crates.io/windows_x86_64_gnu/0.52.6 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.6 \
    crate://crates.io/windows_x86_64_msvc/0.52.6 \
"

# Create checksums
SRC_URI[android-tzdata-0.1.1.sha256sum] = "e999941b234f3131b00bc13c22d06e8c5ff726d1b6318ac7eb276997bbb4fef0"
SRC_URI[android_system_properties-0.1.5.sha256sum] = "819e7219dbd41043ac279b19830f2efc897156490d7fd6ea916720117ee66311"
SRC_URI[autocfg-1.4.0.sha256sum] = "ace50bade8e6234aa140d9a2f552bbee1db4d353f69b8217bc503490fc1a9f26"
SRC_URI[bumpalo-3.16.0.sha256sum] = "79296716171880943b8470b5f8d03aa55eb2e645a4874bdbb28adb49162e012c"
SRC_URI[cc-1.1.37.sha256sum] = "40545c26d092346d8a8dab71ee48e7685a7a9cba76e634790c215b41a4a7b4cf"
SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[chrono-0.4.38.sha256sum] = "a21f936df1771bf62b77f047b726c4625ff2e8aa607c01ec06e5a05bd8463401"
SRC_URI[core-foundation-sys-0.8.7.sha256sum] = "773648b94d0e5d620f64f280777445740e61fe701025087ec8b57f45c791888b"
SRC_URI[iana-time-zone-haiku-0.1.2.sha256sum] = "f31827a206f56af32e590ba56d5d2d085f558508192593743f16b2306495269f"
SRC_URI[iana-time-zone-0.1.61.sha256sum] = "235e081f3925a06703c2d0117ea8b91f042756fd6e7a6e5d901e8ca1a996b220"
SRC_URI[itoa-1.0.11.sha256sum] = "49f1f14873335454500d59611f1cf4a4b0f786f9ac11f4312a78e4cf2566695b"
SRC_URI[js-sys-0.3.72.sha256sum] = "6a88f1bda2bd75b0452a14784937d796722fdebfe50df998aeb3f0b7603019a9"
SRC_URI[libc-0.2.162.sha256sum] = "18d287de67fe55fd7e1581fe933d965a5a9477b38e949cfa9f8574ef01506398"
SRC_URI[log-0.4.22.sha256sum] = "a7a70ba024b9dc04c27ea2f0c0548feb474ec5c54bba33a7f72f873a39d07b24"
SRC_URI[memchr-2.7.4.sha256sum] = "78ca9ab1a0babb1e7d5695e3530886289c18cf2f87ec19a575a0abdce112e3a3"
SRC_URI[num-traits-0.2.19.sha256sum] = "071dfc062690e90b734c0b2273ce72ad0ffa95f0c74596bc250dcfd960262841"
SRC_URI[once_cell-1.20.2.sha256sum] = "1261fe7e33c73b354eab43b1273a57c8f967d0391e80353e51f764ac02cf6775"
SRC_URI[proc-macro2-1.0.89.sha256sum] = "f139b0662de085916d1fb67d2b4169d1addddda1919e696f3252b740b629986e"
SRC_URI[quote-1.0.37.sha256sum] = "b5b9d34b8991d19d98081b46eacdd8eb58c6f2b201139f7c5f643cc155a633af"
SRC_URI[reed-solomon-0.2.1.sha256sum] = "13de68c877a77f35885442ac72c8beb7c2f0b09380c43b734b9d63d1db69ee54"
SRC_URI[ryu-1.0.18.sha256sum] = "f3cb5ba0dc43242ce17de99c180e96db90b235b8a9fdc9543c96d2209116bd9f"
SRC_URI[serde-1.0.215.sha256sum] = "6513c1ad0b11a9376da888e3e0baa0077f1aed55c17f50e7b2397136129fb88f"
SRC_URI[serde_derive-1.0.215.sha256sum] = "ad1e866f866923f252f05c889987993144fb74e722403468a4ebd70c3cd756c0"
SRC_URI[serde_json-1.0.132.sha256sum] = "d726bfaff4b320266d395898905d0eba0345aae23b54aee3a737e260fd46db03"
SRC_URI[shlex-1.3.0.sha256sum] = "0fda2ff0d084019ba4d7c6f371c95d8fd75ce3524c3cb8fb653a3023f6323e64"
SRC_URI[syn-2.0.87.sha256sum] = "25aa4ce346d03a6dcd68dd8b4010bcb74e54e62c90c573f394c46eae99aba32d"
SRC_URI[unicode-ident-1.0.13.sha256sum] = "e91b56cd4cadaeb79bbf1a5645f6b4f8dc5bde8834ad5894a8db35fda9efa1fe"
SRC_URI[wasm-bindgen-backend-0.2.95.sha256sum] = "cb6dd4d3ca0ddffd1dd1c9c04f94b868c37ff5fac97c30b97cff2d74fce3a358"
SRC_URI[wasm-bindgen-macro-support-0.2.95.sha256sum] = "26c6ab57572f7a24a4985830b120de1594465e5d500f24afe89e16b4e833ef68"
SRC_URI[wasm-bindgen-macro-0.2.95.sha256sum] = "e79384be7f8f5a9dd5d7167216f022090cf1f9ec128e6e6a482a2cb5c5422c56"
SRC_URI[wasm-bindgen-shared-0.2.95.sha256sum] = "65fc09f10666a9f147042251e0dda9c18f166ff7de300607007e96bdebc1068d"
SRC_URI[wasm-bindgen-0.2.95.sha256sum] = "128d1e363af62632b8eb57219c8fd7877144af57558fb2ef0368d0087bddeb2e"
SRC_URI[windows-core-0.52.0.sha256sum] = "33ab640c8d7e35bf8ba19b884ba838ceb4fba93a4e8c65a9059d08afcfc683d9"
SRC_URI[windows-targets-0.52.6.sha256sum] = "9b724f72796e036ab90c1021d4780d4d3d648aca59e491e6b98e725b84e99973"
SRC_URI[windows_aarch64_gnullvm-0.52.6.sha256sum] = "32a4622180e7a0ec044bb555404c800bc9fd9ec262ec147edd5989ccd0c02cd3"
SRC_URI[windows_aarch64_msvc-0.52.6.sha256sum] = "09ec2a7bb152e2252b53fa7803150007879548bc709c039df7627cabbd05d469"
SRC_URI[windows_i686_gnu-0.52.6.sha256sum] = "8e9b5ad5ab802e97eb8e295ac6720e509ee4c243f69d781394014ebfe8bbfa0b"
SRC_URI[windows_i686_gnullvm-0.52.6.sha256sum] = "0eee52d38c090b3caa76c563b86c3a4bd71ef1a819287c19d586d7334ae8ed66"
SRC_URI[windows_i686_msvc-0.52.6.sha256sum] = "240948bc05c5e7c6dabba28bf89d89ffce3e303022809e73deaefe4f6ec56c66"
SRC_URI[windows_x86_64_gnu-0.52.6.sha256sum] = "147a5c80aabfbf0c7d901cb5895d1de30ef2907eb21fbbab29ca94c5b08b1a78"
SRC_URI[windows_x86_64_gnullvm-0.52.6.sha256sum] = "24d5b23dc417412679681396f2b49f3de8c1473deb516bd34410872eff51ed0d"
SRC_URI[windows_x86_64_msvc-0.52.6.sha256sum] = "589f6da84c646204747d1270a2a5661ea66ed1cced2631d546fdfb155959f9ec"

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
