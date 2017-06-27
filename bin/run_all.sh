#!/usr/bin/env bash


# Eureka Server: 8761
java -jar euerka/target/euerka-1.0-SNAPSHOT.jar &

# Pause...
sleep 20s

java -jar -Dserver.port=10001 add/target/add-1.0-SNAPSHOT.jar &
java -jar -Dserver.port=10002 divide/target/divide-1.0-SNAPSHOT.jar &
java -jar -Dserver.port=10003 multiply/target/multiply-1.0-SNAPSHOT.jar &
java -jar -Dserver.port=10004 subtract/target/subtract-1.0-SNAPSHOT.jar &
java -jar -Dserver.port=10005 mod/target/mod-1.0-SNAPSHOT.jar &
java -jar -Dserver.port=10006 square/target/square-1.0-SNAPSHOT.jar &
java -jar -Dserver.port=10007 power/target/power-1.0-SNAPSHOT.jar &
java -jar -Dserver.port=10008 batchcalc/target/batch-calc-1.0-SNAPSHOT.jar &
