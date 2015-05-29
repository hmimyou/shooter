#!/bin/bash
# This is a sample deployment script for Tomcat, assuming you have already started the tomcat server.

if [ ! "$CATALINA_HOME" ]; then
   echo "ERROR: CATALINA_HOME is not defined, deploy aborted" >&2;
   exit 1;
fi

if [ -z "$1" ]; then
	echo "Please provide version number, usage: script/deploy.sh 0.1" >&2;
	exit 1;
else
	VERSION="$1"
fi

deployed=1;

gradle assemble && cp dist/shooter-${VERSION}.war ${CATALINA_HOME}/webapps/shooter.war && deployed=0

if [ $deployed -eq 1 ]; then
	echo "ERROR: deploy failed." >&2;
	unset deployed;
	exit 1;
fi

echo "Deployment done"
unset started