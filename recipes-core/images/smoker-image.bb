#Angstrom bootstrap image
require console-base-image.bb

DEPENDS += "packagegroup-base-extended \
	   "

IMAGE_INSTALL += "packagegroup-base-extended \
                  lighttpd \
	    "

export IMAGE_BASENAME = "smoker-image"
