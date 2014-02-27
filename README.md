# Dropwizard Freemarker

Sample application showing how to build a [dropwizard](http://dropwizard.codahale.com/) service returning html views using the [freemarker templating engine](http://freemarker.org/).

This is a simple dropwizard implementation for returning HTML, using Freemarker as the templating engine. It's based on the Dropwizard example [here](http://dropwizard.codahale.com/manual/views/). Uses SBT for build.

## Setup

To compile:

```
./sbt assembly
```

To run:

```
java -jar target/scala-2.10/dropwizard-freemarker-assembly-0.1.jar server config.yml
```
