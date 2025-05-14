@echo off
REM Script de compilation et d'exécution des tests pour Windows

echo Création du dossier build...
if not exist build mkdir build

echo Compilation des classes Java...
javac -d build -cp "lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" src\*.java tests\*.java

if %ERRORLEVEL% NEQ 0 (
    echo Erreur de compilation!
    exit /b %ERRORLEVEL%
)

echo Exécution des tests JUnit...
java -cp "build;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" org.junit.runner.JUnitCore CalculatorTest

if %ERRORLEVEL% NEQ 0 (
    echo Tests échoués!
    exit /b %ERRORLEVEL%
)

echo Exécution de l'application principale...
java -cp build Calculator

echo Terminé! 