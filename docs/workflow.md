---
layout: default
title: Workflow CI/CD
---

# Workflow CI/CD

Ce projet utilise GitHub Actions pour automatiser l'intégration continue et le déploiement continu.

## Processus automatisé

Chaque fois qu'un commit est poussé sur la branche principale (`main` ou `master`), le workflow suivant est exécuté:

1. **Compilation du code Java**

   - Le code source est compilé avec JDK 11
   - Les classes sont générées dans le dossier `build`

2. **Exécution des tests**

   - Les tests JUnit sont exécutés
   - Si les tests échouent, le workflow s'arrête

3. **Déploiement sur GitHub Pages**
   - La documentation (dossier `docs`) est automatiquement déployée
   - La page d'accueil est mise à jour
   - Le site est accessible à l'URL: `https://[username].github.io/[repo-name]/`

## Configuration

Le workflow est défini dans le fichier `.github/workflows/ci.yml` et utilise les actions GitHub suivantes:

- `actions/checkout@v3` - Pour récupérer le code source
- `actions/setup-java@v3` - Pour configurer l'environnement Java
- `actions/configure-pages@v3` - Pour configurer GitHub Pages
- `JamesIves/github-pages-deploy-action@v4` - Pour déployer sur GitHub Pages
- `actions/upload-pages-artifact@v2` - Pour télécharger les artefacts
- `actions/deploy-pages@v2` - Pour déployer le site

## Visualisation

Vous pouvez voir l'état des exécutions du workflow dans l'onglet "Actions" du dépôt GitHub.

[![Statut CI](https://github.com/Reeflex-M/CItest/actions/workflows/ci.yml/badge.svg)](https://github.com/Reeflex-M/CItest/actions/workflows/ci.yml)
