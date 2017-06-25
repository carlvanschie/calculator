#!/usr/bin/env bash

# ADD: 10001
# DIV: 10004
# MOD: 10007
# SQU: 10005
# POW: 10006
# MUL: 10003
# SUB: 10002

# Batch 20001

java -jar add/target/add-1.0-SNAPSHOT.jar &
java -jar divide/target/divide-1.0-SNAPSHOT.jar &
java -jar multiply/target/multiply-1.0-SNAPSHOT.jar &
java -jar subtract/target/subtract-1.0-SNAPSHOT.jar &
java -jar mod/target/mod-1.0-SNAPSHOT.jar &
java -jar square/target/square-1.0-SNAPSHOT.jar &
java -jar power/target/power-1.0-SNAPSHOT.jar &