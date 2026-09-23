// Job DSL script to create a freestyle job with post build actions.
job("generated-job-05") {
  description("Jenkins job created with build trigger and build steps configuration.")
  steps {
   shell("echo 'hello world!'")
  }
  publishers {
    extendedEmail {
      recipientList('xyz@gmail.com')
      defaultSubject('$DEFAULT_SUBJECT')
      defaultContent('$DEFAULT_CONTENT')
      contentType('text/html')
      triggers {
        beforeBuild()
        stillUnstable {
          subject('Subject')
          content('Body')
          sendTo {
            developers()
            requester()
            culprits()
          }
        }
      }
    }
  }
}
