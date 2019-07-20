# FP Basics

This repository contains examples and theory for fundamental concepts of Functional Programming.
In my opinion this basics of FP are applicable quite independent of the programming language being used.
I have been a professional Java Programmer for more than 20 years. In the last few years I had a growing interest in Scala and modern Javascripts. Therefore I will try to provide the examples in those three languages. Apart from that I want to provide some theory and resources independent of a specific programming language.

## Getting Started
The projects were setup with common build tools for the respective languages:
- Javascript version uses npm
- Java version uses maven
- Scala version uses sbt

The examples are implemented by using common Unit-Testing-Frameworks:
- Javascript version uses mocha
- Java version uses Junit 4
- Scala version uses ScalaTest

Apart from that I don't use any language dependent libraries and frameworks, because I want to concentrate on the language capabilities for FP itself. Some of the interesting libraries would be:
- Javascript: ramda, Lodash
- Java: vavr
- Scala: Cats, ScalaZ

### Prerequisites

- Javascript examples require node / npm installed to run
- Java examples require Java 11
- Scala examples require Scala (and Java 8)

I used IntelliJ/Webstorm for as IDE for all languages, but other IDE's / Editors should work fine. 

## Running the tests

Explain how to run the automated tests for this system.

JS
```
npm run test
```

Java
```
mvn test
```

Scala
```
sbt test
```
