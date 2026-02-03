pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                echo "Build stage running..."
                // javac FPMCalculator.java
            }
        }

        stage('Test') {
            steps {
                echo "Test stage running..."
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploy stage running..."
            }
        }
    }

    post {
        success {
            echo "✅ Pipeline executed successfully!"
        }
        failure {
            echo "❌ Pipeline failed!"
        }
    }
}
