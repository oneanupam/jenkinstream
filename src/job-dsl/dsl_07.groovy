// Job DSL script to build a maven type Java project.
job("maven-job-01") {
  description("Jenkins job created through Job DSL Script.")
  scm {
    git{
      remote {
        url("https://github.com/anupam-sy/MavenProject_01.git")
        credentials("github-user-authentication")
      }
      branch("*/main")
    }
  }
  steps {
    maven { 
      goals('clean')
      goals('compile')
      mavenInstallation('apache-maven-3.5.2')
    }
  }
}