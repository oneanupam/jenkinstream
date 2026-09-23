// Job DSL script to create a maven job that builds a Java project according to selected tag.
job("maven-job-02") {
  description("Jenkins job created through Job DSL Script.")
  parameters {
    gitParam('Minor_Tag') {
      type('TAG')
      tagFilter("Minor*")
  	}
  }
  scm {
    git {
      remote {
        url("https://github.com/anupam-sy/MavenProject_01.git")
      }
      branch('${Minor_Tag}')
    }
  }
  triggers {
    cron('H/1 * * * *') // Run job in every two minutes
  }
  steps {
    maven { 
      goals('clean')
      goals('compile')
      mavenInstallation('apache-maven-3.5.2')
    }
  }
}
