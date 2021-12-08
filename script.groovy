def buildApp() {
	echo "Building.."
	echo "Hello world"
}

def testApp() {
	echo "Testing.."

	//Call and test specific job
	build job: 'DemoProject'
}

def deployApp() {
	echo "Deploying.."
	echo "deploying version ${params.VERSION} to the server"
}

return this