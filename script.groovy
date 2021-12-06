def buildApp() {
	echo "Building.."
	echo "Hello world"
}

def testApp() {
	echo "Testing.."
}

def deployApp() {
	echo "Deploying.."
	echo "deploying version ${params.VERSION}"
}

return this