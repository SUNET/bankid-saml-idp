#!/bin/bash
set -e
apt install -y openjdk-17-jdk-headless
apt install -y maven
mvn -version
mvn clean install

mvn -f bankid-idp/bankid-idp-backend jib:dockerBuild 
