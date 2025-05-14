#!/bin/bash
# Script de compilation et d'exécution des tests pour Linux/macOS

echo "Création du dossier build..."
mkdir -p build

echo "Compilation des classes Java..."
javac -d build -cp "lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar" src/*.java tests/*.java

if [ $? -ne 0 ]; then
    echo "Erreur de compilation!"
    exit 1
fi

echo "Exécution des tests JUnit..."
java -cp "build:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore CalculatorTest

if [ $? -ne 0 ]; then
    echo "Tests échoués!"
    exit 1
fi

echo "Exécution de l'application principale..."
java -cp build Calculator

echo "Terminé!" 