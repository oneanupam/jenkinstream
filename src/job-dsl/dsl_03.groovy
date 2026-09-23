// Job DSL script to create a freestyle job with build trigger and build steps configuration.
job("generated-job-03") {
  description("Jenkins job created with build trigger and build steps configuration.")
  parameters {
    stringParam('terraform_version', defaultValue = '0.13', description = 'enter the terraform version.')
  }
  
  triggers {
    cron('* * * * *') // build periodically every 1 minute. Use crontab.guru to generate cron expression.
  }

  steps {
    // single line shell command
    shell("echo 'hello world!'")

    // multi-line shell command
    shell('''
        echo "***** executing shell commands *****"
        echo "terraform version: ${terraform_version}"
    '''
    )
    // Use batchFile() function when running Jenkins on windows.
    // batchFile("echo 'Hello World!'")
  }
}
