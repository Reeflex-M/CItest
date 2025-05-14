---
layout: default
title: Tutoriel
---

# Tutoriel d'utilisation

Ce tutoriel vous guide pas à pas pour commencer à utiliser la calculatrice Java.

## Installation

### Prérequis

- Java JDK 8 ou supérieur
- JUnit (pour exécuter les tests)

### Téléchargement

```bash
# Cloner le repository
git clone https://github.com/Reeflex-M/CItest.git
cd CItest
```

## Compilation

### Sous Linux/macOS

```bash
mkdir -p build
javac -d build -cp "lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar" src/*.java tests/*.java
```

### Sous Windows

```batch
mkdir build
javac -d build -cp "lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" src\*.java tests\*.java
```

## Exécution des tests

### Sous Linux/macOS

```bash
java -cp "build:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore CalculatorTest
```

### Sous Windows

```batch
java -cp "build;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" org.junit.runner.JUnitCore CalculatorTest
```

## Exécution de l'application

```bash
java -cp build Calculator
```

## Exemple d'intégration dans votre code

```java
public class MonApplication {
    public static void main(String[] args) {
        // Utilisation de la calculatrice
        int somme = Calculator.add(10, 5);
        System.out.println("10 + 5 = " + somme);

        int produit = Calculator.multiply(4, 3);
        System.out.println("4 × 3 = " + produit);

        // Calcul plus complexe
        int resultat = Calculator.power(Calculator.add(2, 1), 2);
        System.out.println("(2 + 1)² = " + resultat);
    }
}
```

[Retour à l'accueil](index.html)
