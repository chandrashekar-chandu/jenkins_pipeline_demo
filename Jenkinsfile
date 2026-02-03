pipeline {
    agent any

    stages {

        stage('Build & Test') {
            steps {
                echo 'Running Maven clean test on Windows'
                bat 'mvn clean test'
            }
        }

        stage('Package JAR') {
            steps {
                echo 'Packaging JAR'
                bat 'mvn package'
            }
        }

        stage('Install to Local Repo') {
            steps {
                echo 'Installing JAR to local Maven repository'
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
