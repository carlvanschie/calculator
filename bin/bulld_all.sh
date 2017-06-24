#!/usr/bin/env bash

echo "Packaging Add"
cd add/
mvn package

echo "Packaging Subtract"
cd ../subtract/
mvn package

echo "Packaging Divide"
cd ../divide/
mvn package

echo "Packaging Multiply"
cd ../multiply/
mvn package

echo "Packaging Square"
cd ../square/
mvn package

cd ..
