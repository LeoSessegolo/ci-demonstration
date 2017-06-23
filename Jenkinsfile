pipeline {
    agent any

    stages {
        stage('Build') {
	    steps {
		echo 'Building..'
		gradle 'build -x test'
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
