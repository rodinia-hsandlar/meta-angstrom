DESCRIPTION = "Task for images with perl"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PR = "r13"

inherit packagegroup

# for backwards compatibility
RPROVIDES_${PN} += "packagegroup-gnome3-perl"

RDEPENDS_${PN} = " \
  perl \
  libxml-parser-perl \
"
