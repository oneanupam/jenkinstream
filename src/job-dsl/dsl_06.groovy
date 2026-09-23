// Job DSL script to create a pipeline job.
pipelineJob("maven-pipeline-job") {
    displayName("Pipeline job created with scm configuration.")
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url("https://github.com/anupam-sy/MavenProject_02.git")
                        branch("*/master")
                    }
                    extensions {
                        localBranch("master")
                    }
                }
            }
            scriptPath("Jenkinsfile")
        }
    }
}
