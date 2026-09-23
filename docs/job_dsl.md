# Job DSL Samples
This repository has collection of some Job DSL samples that can be used as seed job for the creation of jenkins jobs having different configurations.

## What is DSL
A Domain Specific Language is a specialized computer language designed for a specific task. General-purpose programming languages like C, Python and Java are designed to let you write any sort of program with any sort of logic you need.

Some popular example of DSL languages are SQL (which is used for querying databases), CSS (which is used for styling HTML).

## Job DSL
Jenkins is a wonderful system for managing builds, and people love using its UI to configure jobs. Unfortunately, as the number of jobs grows, maintaining them becomes tedious. The Job DSL plugin attempts to solve this problem by allowing jobs to be defined in a programmatic form in a human readable file. Writing such a file is feasible without being a Jenkins expert.

Job DSL is based on based on the Apache's Groovy programming language. This plugin was one of the first popular plugins for Jenkins which allows managing configuration as code. Since then, many other plugins dealing with this aspect have been created, most notably the [Jenkins Pipeline](https://www.jenkins.io/doc/book/pipeline/) plugin.

## Plugin Requirements
Below plugins are required to use Job DSL.
* [Job DSL](https://plugins.jenkins.io/job-dsl/)

## Getting Started
First, start a Jenkins instance with the Job DSL plugin installed. Then create a freestyle project named "seed". Then, Add a "Process Job DSLs" build step and paste the on of the script into the "DSL Script" field. Save the configuration, build the seed job. The seed job will generate the respective jenkins job mentioned in the script.

Note: Job DSL version 1.60 introduced Script Security. Execute seed jobs after disabling script security for Job DSL scripts under Configure Global Security settings.

## Write your custom Job DSL
To write the custom Job DSL script, use the below mentioned wiki to get the required syntaxes.
- https://jenkinsci.github.io/job-dsl-plugin/

## References
Below are the few articles used in writing and collecting information about this ReadMe.
- https://plugins.jenkins.io/job-dsl/
- https://www.jetbrains.com/mps/concepts/domain-specific-languages/