pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/laxmi916/calculator-app.git'
            }
        }

        stage('Build & Test') {
            steps {
                echo 'Running Maven clean test on Windows'
                bat 'mvn clean test'
            }
        }

        stage('Package JAR') {
            steps {
                echo 'Packaging JAR on Windows'
                bat 'mvn package'
            }
        }

        stage('Install to Local Repo') {
            steps {
                echo 'Installing JAR to local Maven repo'
                bat 'mvn install'
            }
        }
    }

    post {
        success {
            echo '✅ Library JAR packaged and installed successfully'
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
        failure {
            echo '❌ Build failed'
        }
    }
}
