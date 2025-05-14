# Calculator Java Project

[![Java CI with JUnit and GitHub Pages Deployment](https://github.com/Reeflex-M/CItest/actions/workflows/ci.yml/badge.svg)](https://github.com/Reeflex-M/CItest/actions/workflows/ci.yml)

Un projet Java simple avec une calculatrice et des tests JUnit.

## Structure du projet

- `src/` : Code source Java
- `tests/` : Tests JUnit
- `lib/` : Dépendances externes (JUnit)
- `.github/workflows/` : Configuration de GitHub Actions pour CI/CD

## Intégration Continue

Ce projet utilise GitHub Actions pour l'intégration continue et le déploiement continu. Le workflow est configuré pour:

1. Compiler le code Java
2. Exécuter les tests JUnit
3. Générer la documentation
4. Déployer automatiquement sur GitHub Pages après chaque push sur la branche principale

### Configuration du workflow

Le workflow est défini dans le fichier `.github/workflows/ci.yml`. Il s'exécute à chaque push sur les branches `main` ou `master` et pour les pull requests.

## GitHub Pages

La documentation du projet est automatiquement générée et déployée sur GitHub Pages. Vous pouvez y accéder à:

```
https://[votre-nom-utilisateur].github.io/[nom-du-repo]/
```

## Comment utiliser

1. Clonez le repository
2. Compilez le code: `javac -d build -cp lib/junit-4.13.2.jar src/*.java tests/*.java`
3. Exécutez les tests: `java -cp build:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest`
4. Exécutez l'application: `java -cp build Calculator`
   "# CItest"
