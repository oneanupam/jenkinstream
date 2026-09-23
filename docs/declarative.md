# Jenkins Pipeline / Pipeline
Jenkins Pipeline provides a way to write pipelines "as code". The definition of a Jenkins Pipeline is typically written into a text file (called a Jenkinsfile) which in turn is checked into a project’s source control repository. 

This repository has collection of some Jenkinsfile written by following Declarative syntax of Pipeline writing.

## Declarative Pipeline
Declarative Pipeline is a relatively recent addition to Jenkins Pipeline which presents a more simplified and opinionated syntax on top of the Pipeline sub-systems.

## Plugin Requirements
- [Pipeline](https://plugins.jenkins.io/workflow-aggregator/)

## Getting Started
There are two ways to place and use Jenkinsfile:

1. We can use Jenkinsfile by placing it in the source-code root directory, but its name must be "Jenkinsfile".
2. You can also place the content of Jenkinsfile in the jenkins job itself, which is typically not used by the industries.

## Write your custom Pipeline DSL
To write the custom Pipeline DSL script, use the below mentioned wiki to get the required syntaxes.
- https://www.jenkins.io/doc/book/pipeline/syntax/#declarative-pipeline

Note: You can also get help from snippet generator link provided below the pipeline section in a pipeline job to automatically generate the required snipptes.

## Multibranch Pipeline
The Multibranch Pipeline project type enables you to implement different Jenkinsfiles for different branches of the same project. In a Multibranch Pipeline project, Jenkins automatically discovers, manages and executes Pipelines for branches which contain a Jenkinsfile in source control.

This eliminates the need for manual Pipeline creation and management.

## References
- https://www.jenkins.io/doc/book/pipeline/
- https://www.jenkins.io/doc/book/pipeline/syntax/
- https://www.jenkins.io/doc/book/pipeline/running-pipelines/
- https://www.jenkins.io/doc/book/pipeline/multibranch/