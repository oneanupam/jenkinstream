// Job DSL script to create a freestyle job with general configurations.
job("generated-job-01") {
  description("This is the first job created using Job DSL's seed job.")
  parameters {
    stringParam('operating_system', defaultValue = 'linux', description = 'enter the os name.')
    booleanParam('flag', true)
    choiceParam('terraform_version', ['0.13 (default)', '1.0.0', '1.3.0'])
  }
}
