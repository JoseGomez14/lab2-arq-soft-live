# Lab 2 - Spring Boot App with CI/CD

[![CI/CD Pipeline](https://github.com/diegobotia/laboratorio2024/actions/workflows/build.yml/badge.svg)](https://github.com/diegobotia/laboratorio2024/actions/workflows/build.yml)

[![Quality gate](https://sonarcloud.io/api/project_badges/quality_gate?project=JoseGomez14_lab2-arq-soft-live)](https://sonarcloud.io/summary/new_code?id=JoseGomez14_lab2-arq-soft-live)

[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=JoseGomez14_lab2-arq-soft-live&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=JoseGomez14_lab2-arq-soft-live)

[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=JoseGomez14_lab2-arq-soft-live&metric=coverage)](https://sonarcloud.io/summary/new_code?id=JoseGomez14_lab2-arq-soft-live)

[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=JoseGomez14_lab2-arq-soft-live&metric=bugs)](https://sonarcloud.io/summary/new_code?id=JoseGomez14_lab2-arq-soft-live)

[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=JoseGomez14_lab2-arq-soft-live&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=JoseGomez14_lab2-arq-soft-live)

Implementation of a Simple App with the next operations:

- Get random nations
- Get random currencies
- Get random aviation
- Get application version
- health check

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

### Folders Structure

In the folder `src` is located the main code of the app

In the folder `test` is located the unit tests

### How to install it

Execute:

```shell
$ mvnw spring-boot:run
```

to download the node dependencies

### How to test it

Execute:

```shell
$ mvnw clean install
```

### How to get coverage test

Execute:

```shell
$ mvwn -B package -DskipTests --file pom.xml
```
