# Jenkins Lab
Jenkins is an open-source automation tool, written in Java with plugins built for continuous integration/continuous delivery and deployment (CI/CD). This lab contains jenkins related stuffs.

## Prerequisites
Jenkins requires Java in order to run. Please note, some Java versions are incompatible with Jenkins. Check official jenkins documentation for compatible version.

To install the Java on Ubuntu, Please follow below commands:

```bash
sudo apt update
sudo apt install -y openjdk-11-jre
java –version
```

Follow [Java-Installation](./docs/install_java.md) guide to install the Open JRE.

## Installation
The version of Jenkins included with the default Ubuntu packages is often behind the latest available version from the project itself.
To ensure the latest fixes and features, use the project-maintained packages to install Jenkins.

```bash
# Add the repository key to your system
wget -q -O - https://pkg.jenkins.io/debian-stable/jenkins.io.key | sudo apt-key add

# Append the Debian package repository address to the server’s sources.list
sudo sh -c 'echo deb http://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'

# Update the apt repository and install Jenkins
sudo apt-get update
sudo apt-get install jenkins

sudo systemctl start jenkins # Enable the Jenkins service to start at boot
sudo systemctl start jenkins # Start the Jenkins service
sudo systemctl status jenkins # Check the status of Jenkins service
```

**Note:** Jenkins is typically run as a standalone application in its own process. The Jenkins WAR file bundles Winstone, a Jetty servlet container wrapper, and can be started on any operating system or platform with a version of Java supported by Jenkins.

## Run pre-commit
This repository already includes a `.pre-commit-config.yaml`. Run the following commands to install the hooks locally:

```bash
python -m pip install pre-commit
pre-commit install
pre-commit validate-config
```

This installs the hook into `.git/hooks/pre-commit`. Once installed, pre-commit runs automatically when you commit changes. By default, it checks only the files included in the commit.

To run all hooks manually, use:

```bash
pre-commit run --all-files
pre-commit run <hook_id>
```

## Contributing

Contributions are welcome! Please open issues or submit pull requests for improvements or new scripts.

## License

This project is licensed under the [MIT License](LICENSE).

## References
- https://www.jenkins.io/doc/book/installing/
- https://www.digitalocean.com/community/tutorials/how-to-install-jenkins-on-ubuntu-22-04
