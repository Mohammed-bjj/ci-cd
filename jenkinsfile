pipeline {
    agent any
    tools {
        maven "maven"
    }
    stages {
        stage('Build') {
            steps {
                git 'https://github.com/Mohammed-bjj/ci-cd.git'
                sh "mvn clean package"
            }
        }
    }
}
