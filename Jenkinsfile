pipeline {
    agent any

    stages {

        stage('Clone Repo') {
            steps {
                echo "Cloning repository..."
                git branch: 'main',
                    url: 'https://github.com/username/repo-name.git'
            }
        }

        stage('Build') {
            steps {
                echo "Build stage running..."
                // example:
                // sh 'npm install'
                // sh 'npm run build'
            }
        }

        stage('Test') {
            steps {
                echo "Test stage running..."
                // sh 'npm test'
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploy stage running..."
                // sh 'docker build -t myapp .'
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
