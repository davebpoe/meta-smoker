#Angstrom bootstrap image
require console-base-image.bb

DEPENDS += "packagegroup-base-extended \
	   "

IMAGE_INSTALL += "packagegroup-base-extended \
                  mt7601 \
                  libstdc++ \
                  libpcre \
                  lighttpd \
                  lighttpd-module-fastcgi \
                  lighttpd-module-scgi \
                  lighttpd-module-expire \
	    "

export IMAGE_BASENAME = "smoker-image"
