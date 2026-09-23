// Job DSL script to create a freestyle job with post build actions.
job("generated-job-04") {
  description("Jenkins job created with build trigger and build steps configuration.")

  parameters {
    stringParam('terraform_version', defaultValue = '0.13', description = 'enter the terraform version.')
  }

  steps {
    // multi-line shell command
    shell('''
        echo "***** executing shell commands *****"
        echo "terraform version: ${terraform_version}"
    '''
    )
  }
  
  publishers {
    mailer('abc@gmail.com ', false, true)
  }
}
