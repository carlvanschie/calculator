#!/usr/bin/env bash

echo "Installing Clients"
cd feign_clients/
mvn clean install

echo "Packaging Add"
cd ../add/
mvn clean package

echo "Packaging Subtract"
cd ../subtract/
mvn clean package

echo "Packaging Divide"
cd ../divide/
mvn clean package

echo "Packaging Multiply"
cd ../multiply/
mvn clean package

echo "Packaging Mod"
cd ../mod/
mvn clean package

echo "Packaging Power"
cd ../power/
mvn clean package

echo "Packaging Square"
cd ../square/
mvn clean package

echo "Packaging Square"
cd ../batchcalc/
mvn clean package


cd ..
