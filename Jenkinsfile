pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Build & Test') {
            steps {
                echo 'Running Maven clean test on Windows'
                bat 'mvn clean test'
            }
        }

        stage('Package JAR') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Install to Local Repo') {
            steps {
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
