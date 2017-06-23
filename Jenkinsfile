pipeline {
    agent any

    stages {
        stage('Build') {
	    node {
		echo 'Building..'
		bat 'gradle build --info'
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
