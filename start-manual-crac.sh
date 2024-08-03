#!/bin/bash

# Enable checkpoint compression (will reduce restore time a bit)
#export CRAC_CRIU_OPTS=--compress

# -XX:+PrintCompilation

java -XX:CRaCCheckpointTo=./tmp_manual_checkpoint -jar target/spring-*.jar
