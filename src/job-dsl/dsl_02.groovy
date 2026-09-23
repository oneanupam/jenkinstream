// Job DSL script to create a freestyle job with source code management configuration.
job("generated-job-02") {
  description("Jenkins job created with scm configuration.")
  scm {
    git{
      remote {
        url("https://github.com/anupam-sy/sample-foundation.git")
        credentials("github-user-authentication") // ID of the saved credential.
      }
      branch("*/main")
    }
  }
}
