---
layout: default
title: Documentation API
---

# Documentation API

Cette page fournit des informations détaillées sur l'API de la calculatrice pour les développeurs.

## Classe Calculator

La classe principale `Calculator` fournit toutes les méthodes de calcul comme méthodes statiques.

### Signature des méthodes

```java
public static int add(int a, int b)
public static int subtract(int a, int b)
public static int multiply(int a, int b)
public static int divide(int a, int b)
public static int modulus(int a, int b)
public static int power(int a, int b)
public static int square(int a)
public static int cube(int a)
```

### Exemples d'utilisation

```java
// Importation
import com.calculator.Calculator;

// Utilisation
int result = Calculator.add(10, 5);
System.out.println(result); // Affiche 15
```

## Tests

La classe `CalculatorTest` démontre comment utiliser JUnit pour tester les fonctionnalités de la calculatrice.

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(3, Calculator.add(1, 2));
    }

    // Autres tests...
}
```

## Intégration

Pour intégrer cette calculatrice dans votre projet Java:

1. Importez les fichiers source dans votre projet
2. Ou compilez et utilisez le JAR résultant
3. Référencez la classe `Calculator` dans votre code

[Retour à l'accueil](index.html)
