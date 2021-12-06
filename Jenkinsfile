pipeline {
	agent any

/*	tools {
		//either in this 3, depends on the project
		maven
		jdk
		gradle
	}*/

	parameters {
		choice(name: 'VERSION', choices: ['1.1.0','1.2.0','1.3.0'], description: '')
		booleanParam(name: 'executeTest', defaultValue: true, description: '')
	}
	stages {
		stage("Build") {
			steps {
				echo "Building.."
				echo "Hello world"
			}
		}

		stage("Test") {
			when {
				expression {
					params.executeTests
				}
			}
			steps {
				echo "Testing.."
			}
		}

		stage("Deploy") {
			steps {
				echo "Deploying.."
				echo "deploying version ${params.VERSION}"
			}
		}
	}
}
