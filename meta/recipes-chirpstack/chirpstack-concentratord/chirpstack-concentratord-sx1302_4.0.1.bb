# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get chirpstack-concentratord-sx1302 could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/chirpstack-concentratord-sx1302/4.0.1"
SRC_URI += "git://git@github.com/chirpstack/chirpstack-concentratord.git;protocol=ssh;nobranch=1"
SRCREV = "1cf97500aa6b53e8f92bbfbe953df7570838dfe6"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = "chirpstack-concentratord-sx1302"


# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/aho-corasick/0.7.19 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/ansi_term/0.12.1 \
    crate://crates.io/anyhow/1.0.65 \
    crate://crates.io/async-stream-impl/0.3.3 \
    crate://crates.io/async-stream/0.3.3 \
    crate://crates.io/async-trait/0.1.57 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/base64/0.13.0 \
    crate://crates.io/bindgen/0.60.1 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/block-buffer/0.10.3 \
    crate://crates.io/bumpalo/3.11.0 \
    crate://crates.io/bytes/1.2.1 \
    crate://crates.io/cc/1.0.73 \
    crate://crates.io/cexpr/0.6.0 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chirpstack_api/4.0.2 \
    crate://crates.io/chrono/0.4.22 \
    crate://crates.io/clang-sys/1.4.0 \
    crate://crates.io/clap/2.34.0 \
    crate://crates.io/clap/3.2.22 \
    crate://crates.io/clap/4.0.4 \
    crate://crates.io/clap_derive/4.0.1 \
    crate://crates.io/clap_lex/0.2.4 \
    crate://crates.io/clap_lex/0.3.0 \
    crate://crates.io/cmake/0.1.48 \
    crate://crates.io/colored/2.0.0 \
    crate://crates.io/core-foundation-sys/0.8.3 \
    crate://crates.io/cpufeatures/0.2.5 \
    crate://crates.io/crypto-common/0.1.6 \
    crate://crates.io/digest/0.10.5 \
    crate://crates.io/either/1.8.0 \
    crate://crates.io/env_logger/0.9.1 \
    crate://crates.io/error-chain/0.10.0 \
    crate://crates.io/error-chain/0.12.4 \
    crate://crates.io/fastrand/1.8.0 \
    crate://crates.io/fixedbitset/0.4.2 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/futures-core/0.3.24 \
    crate://crates.io/futures-sink/0.3.24 \
    crate://crates.io/futures-task/0.3.24 \
    crate://crates.io/futures-util/0.3.24 \
    crate://crates.io/generic-array/0.14.6 \
    crate://crates.io/getrandom/0.2.7 \
    crate://crates.io/glob/0.3.0 \
    crate://crates.io/gpio-cdev/0.5.1 \
    crate://crates.io/handlebars/4.3.4 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/heck/0.4.0 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hex/0.4.3 \
    crate://crates.io/hostname/0.3.1 \
    crate://crates.io/http-body/0.4.5 \
    crate://crates.io/http/0.2.8 \
    crate://crates.io/humantime-serde/1.1.1 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/iana-time-zone/0.1.50 \
    crate://crates.io/indexmap/1.9.1 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/itertools/0.10.5 \
    crate://crates.io/itoa/1.0.3 \
    crate://crates.io/js-sys/0.3.60 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lazycell/1.3.0 \
    crate://crates.io/libc/0.2.134 \
    crate://crates.io/libloading/0.7.3 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/match_cfg/0.1.0 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/metadeps/1.1.2 \
    crate://crates.io/minimal-lexical/0.2.1 \
    crate://crates.io/multimap/0.8.3 \
    crate://crates.io/nix/0.23.1 \
    crate://crates.io/nom/7.1.1 \
    crate://crates.io/num-integer/0.1.45 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/num_threads/0.1.6 \
    crate://crates.io/once_cell/1.15.0 \
    crate://crates.io/os_str_bytes/6.3.0 \
    crate://crates.io/pbjson-build/0.5.0 \
    crate://crates.io/pbjson-types/0.5.0 \
    crate://crates.io/pbjson/0.5.0 \
    crate://crates.io/peeking_take_while/0.1.2 \
    crate://crates.io/percent-encoding/2.2.0 \
    crate://crates.io/pest/2.3.1 \
    crate://crates.io/pest_derive/2.3.1 \
    crate://crates.io/pest_generator/2.3.1 \
    crate://crates.io/pest_meta/2.3.1 \
    crate://crates.io/petgraph/0.6.2 \
    crate://crates.io/pin-project-internal/1.0.12 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-project/1.0.12 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.25 \
    crate://crates.io/ppv-lite86/0.2.16 \
    crate://crates.io/prettyplease/0.1.19 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.46 \
    crate://crates.io/prost-build/0.11.1 \
    crate://crates.io/prost-derive/0.11.0 \
    crate://crates.io/prost-types/0.11.1 \
    crate://crates.io/prost/0.11.0 \
    crate://crates.io/quote/1.0.21 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_chacha/0.3.1 \
    crate://crates.io/rand_core/0.6.4 \
    crate://crates.io/redox_syscall/0.2.16 \
    crate://crates.io/regex-syntax/0.6.27 \
    crate://crates.io/regex/1.6.0 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/ryu/1.0.11 \
    crate://crates.io/serde/1.0.145 \
    crate://crates.io/serde_derive/1.0.145 \
    crate://crates.io/serde_json/1.0.85 \
    crate://crates.io/sha1/0.10.5 \
    crate://crates.io/shlex/1.1.0 \
    crate://crates.io/signal-hook-registry/1.4.0 \
    crate://crates.io/signal-hook/0.3.14 \
    crate://crates.io/simple_logger/2.3.0 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/strsim/0.8.0 \
    crate://crates.io/syn/1.0.101 \
    crate://crates.io/syslog/6.0.1 \
    crate://crates.io/tempfile/3.3.0 \
    crate://crates.io/termcolor/1.1.3 \
    crate://crates.io/textwrap/0.11.0 \
    crate://crates.io/textwrap/0.15.1 \
    crate://crates.io/thiserror-impl/1.0.37 \
    crate://crates.io/thiserror/1.0.37 \
    crate://crates.io/time-macros/0.2.4 \
    crate://crates.io/time/0.1.44 \
    crate://crates.io/time/0.3.14 \
    crate://crates.io/tokio-stream/0.1.10 \
    crate://crates.io/tokio-util/0.7.4 \
    crate://crates.io/tokio/1.21.2 \
    crate://crates.io/toml/0.2.1 \
    crate://crates.io/toml/0.5.9 \
    crate://crates.io/tonic-build/0.8.2 \
    crate://crates.io/tonic/0.8.2 \
    crate://crates.io/tower-layer/0.3.1 \
    crate://crates.io/tower-service/0.3.2 \
    crate://crates.io/tracing-attributes/0.1.22 \
    crate://crates.io/tracing-core/0.1.29 \
    crate://crates.io/tracing/0.1.36 \
    crate://crates.io/typenum/1.15.0 \
    crate://crates.io/ucd-trie/0.1.5 \
    crate://crates.io/unicode-ident/1.0.4 \
    crate://crates.io/unicode-width/0.1.10 \
    crate://crates.io/vec_map/0.8.2 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.83 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.83 \
    crate://crates.io/wasm-bindgen-macro/0.2.83 \
    crate://crates.io/wasm-bindgen-shared/0.2.83 \
    crate://crates.io/wasm-bindgen/0.2.83 \
    crate://crates.io/which/4.3.0 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/zeromq-src/0.1.10+4.3.2 \
    crate://crates.io/zmq-sys/0.11.0 \
    crate://crates.io/zmq/0.9.2 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://MIT;md5=generateme \
"

SUMMARY = "LoRa concentrator HAL daemon for SX1302"
HOMEPAGE = "https://github.com/chirpstack/chirpstack-concentratord/"
LICENSE = "MIT"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include chirpstack-concentratord-sx1302-${PV}.inc
include chirpstack-concentratord-sx1302.inc
