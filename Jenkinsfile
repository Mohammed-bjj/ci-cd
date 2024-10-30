pipeline {
    agent any
    tools {
        maven "maven"
    }
    parameters {
            string(name: 'BRANCH', defaultValue: 'master', description: 'Branche Git à utiliser')
            booleanParam(name: 'DEPLOY_TO_NEXUS', defaultValue: false, description: 'Déployer l\'artefact sur Nexus')
        }
    stages {

      stage('Clone Repository') {
                steps {
                    git branch: "${params.BRANCH}", url: 'https://github.com/Mohammed-bjj/ci-cd.git'
                }
      }
      stage('Build') {
            steps {
                sh "mvn clean package"
            }
      }
      stage('Deploy to Nexus') {
           when {
               expression { return params.DEPLOY_TO_NEXUS }
           }
           steps {
                      sh 'mvn deploy'
          }
      }
    }
}
