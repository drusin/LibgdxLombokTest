# How to use [Project Lombok](https://projectlombok.org/) with libGDX
This repository has a barebones libGDX project created with the setup-tool. Only Desktop and Android projects are created, no add-ons are selected. It aims to provide the minimal delta needed to use lombok for the android and desktop builds of a libGDX application.

Instructions
------------

1. Install the lombok plugin in Android Studio / IntelliJ
2. Enable annotation processing (Settings -> Build, Execution, Deployment -> Compiler -> Annotation Processors)
3. Add the dependencies like I did in [this commit](https://github.com/drusin/LibgdxLombokTest/commit/de7db193a5fe2ce786fcfb67108eca25ff1ac82d?diff=unified)
