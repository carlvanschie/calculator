#!/usr/bin/env bash

echo "Installing Clients"
cd feign_clients/
mvn clean install

echo "Packaging Add"
cd ../add/
mvn clean package docker:build

echo "Packaging Subtract"
cd ../subtract/
mvn clean package docker:build

echo "Packaging Divide"
cd ../divide/
mvn clean package docker:build

echo "Packaging Multiply"
cd ../multiply/
mvn clean package docker:build

echo "Packaging Mod"
cd ../mod/
mvn clean package docker:build

echo "Packaging Power"
cd ../power/
mvn clean package docker:build

echo "Packaging Square"
cd ../square/
mvn clean package docker:build

echo "Packaging Square"
cd ../batchcalc/
mvn clean package docker:build

echo "Eureka Server"
cd ../euerka/
mvn clean package docker:build