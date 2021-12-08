def buildApp() {
	echo "Building.."
	echo "Hello world"
	// Build tools code here
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