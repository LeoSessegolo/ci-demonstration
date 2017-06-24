pipeline {
    agent any

    stages {
        stage('Build') {
	    steps {
		echo 'Building..'
		bat 'gradle build -x test --info'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
		bat 'gradle test --info'
		bat 'gradle cobertura'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
		echo 'DEPLOYED TO NASA! LAUCHING MISSON TO KOREA!'    
	    }
        }
    }
}
