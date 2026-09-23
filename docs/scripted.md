# Jenkins Pipeline / Pipeline
Jenkins Pipeline provides a way to write pipelines "as code". The definition of a Jenkins Pipeline is typically written into a text file (called a Jenkinsfile) which in turn is checked into a project’s source control repository.

This repository has collection of some Jenkinsfile written by following Scripted syntax of Pipeline writing.

## Scripted Pipeline
Scripted Pipeline, like Declarative Pipeline, is built on top of the underlying Pipeline sub-system. Unlike Declarative, Scripted Pipeline is effectively a general-purpose DSL built with Groovy. Most functionality provided by the Groovy language is made available to users of Scripted Pipeline, which means it can be a very expressive and flexible tool with which one can author continuous delivery pipelines.

## Plugin Requirements
- [Pipeline](https://plugins.jenkins.io/workflow-aggregator/)

## Getting Started
There are two ways to place and use Jenkinsfile:

1. We can use Jenkinsfile by placing it in the source-code root directory, but its name must be "Jenkinsfile".
2. You can also place the content of Jenkinsfile in the jenkins job itself, which is typically not used by the industries.

## Write your custom Pipeline DSL
To write the custom Pipeline DSL script, use the below mentioned wiki to get the required syntaxes.
- https://www.jenkins.io/doc/book/pipeline/syntax/#scripted-pipeline

## References
- https://www.jenkins.io/doc/book/pipeline/
- https://www.jenkins.io/doc/book/pipeline/syntax/
- https://www.jenkins.io/doc/book/pipeline/running-pipelines/