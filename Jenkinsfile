def groovy

pipeline {
	agent any

	/*tools {
		//either in this 3, depends on the project
		maven 'Maven-3.8.4'
		//jdk
		//gradle
	}*/

	parameters {
		choice(name: 'VERSION', choices: ['1.1.0','1.2.0','1.3.0'], description: '')
		booleanParam(name: 'executeTest', defaultValue: true, description: '')
	}
	stages {
		//Initialization of imports ex.(groovy script)
		stage("Initialize") {
			steps {
				script {
					groovy = load "script.groovy"
				}	
			}
		}

		//Build Stage
		stage("Build") {
			steps {
				script {
					groovy.buildApp()
				}
				//sh 'mvn install'
			}
		}
		//Testing Stage
		stage("Test") {
			when {
				expression {
					params.executeTest
				}
			}
			steps {
				script {
					build job: 'DemoProject'
					groovy.testApp()
				}	
			}
		}
		//Deployment Stage
		stage("Deploy") {
			steps {
				script {
					groovy.deployApp()
				}	
			}
		}
	}
}
