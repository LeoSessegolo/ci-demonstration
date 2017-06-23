pipeline {
    agent any

    stages {
        stage('Build') {
			steps {
				echo 'Building..'
                bat 'make' 
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
				bat 'make check || true' 
                junit '**/target/*.xml' 
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
				when {
				  expression {
					currentBuild.result == null || currentBuild.result == 'SUCCESS' 
				  }
				}
				steps {
					bat 'make publish'
				}
            }
        }
    }
}
