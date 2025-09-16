#!/usr/bin/env sh

##############################################################################
##
##  Gradle start up script for UN*X
##
##############################################################################

APP_NAME="Gradle"
APP_BASE_NAME=`basename "$0"`

DEFAULT_JVM_OPTS=""

WRAPPER_DIR="$(cd "$(dirname "$0")" && pwd)/gradle/wrapper"
WRAPPER_JAR="$WRAPPER_DIR/gradle-wrapper.jar"

exec java $DEFAULT_JVM_OPTS -jar "$WRAPPER_JAR" "$@"
