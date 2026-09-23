// Job DSL script to create a maven job that performs war deployment.
mavenJob("mavenjob-codedeploy") {
  description("Jenkins job created through Job DSL Script.")
  parameters {
    gitParam('Minor_Tag') {
      type('TAG')
      tagFilter("Minor*")
  	}
  }
  logRotator {
    numToKeep(5)
    daysToKeep(5)
    artifactNumToKeep(1)
    artifactDaysToKeep(1)
  }
  scm {
    git {
      remote {
        url("https://github.com/anupam-sy/MavenProject_01.git")
      }
      branch('${Minor_Tag}')
    }
  }
  mavenInstallation('default') // Select which installation of Maven to uses
  rootPOM('pom.xml')
  goals('clean package')
  postBuildSteps('SUCCESS') {
	batchFile('copy "C:\Program Files (x86)\Jenkins\workspace\MVNJOB-CodeDeploy\target\*.jar" "D:\"')
	// batchFile('copy "$WORKSPACE/target/*.jar" "D:\"')
  }
}
