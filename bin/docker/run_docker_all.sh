#!/usr/bin/env bash

docker run -p 8300:8300 -p 8400:8400 -p 8500:8500 -p 8600:8600 \
    -v /data -v /config -d progrium/consul -server -bootstrap -data-dir /data

sleep 10s

docker run -e SERVER_PORT=10101 --net=host -d carlvanschie/calculator-add
docker run -e SERVER_PORT=10201 --net=host -d carlvanschie/calculator-batch
docker run -e SERVER_PORT=10301 --net=host -d carlvanschie/calculator-divide
docker run -e SERVER_PORT=10401 --net=host -d carlvanschie/calculator-mod
docker run -e SERVER_PORT=10501 --net=host -d carlvanschie/calculator-multiply
docker run -e SERVER_PORT=10601 --net=host -d carlvanschie/calculator-power
docker run -e SERVER_PORT=10701 --net=host -d carlvanschie/calculator-square
docker run -e SERVER_PORT=10801 --net=host -d carlvanschie/calculator-subtract


