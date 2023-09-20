#!/bin/bash
set -e
apt install -y openjdk-17-jdk-headless
apt install -y maven
mvn -version
export DOCKER_REPO=local
mvn clean install

mvn -f bankid-idp/bankid-idp jib:dockerBuild 
