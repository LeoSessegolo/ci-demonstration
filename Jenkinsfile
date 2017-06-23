pipeline {
    agent any

    stages {
        stage('Build') {
	    steps {
		echo 'Building..'
		bat 'mkdir'
		archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
	    }
        }
    }
}
