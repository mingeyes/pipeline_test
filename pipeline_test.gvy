pipeline {
    agent any
    stages{
        stage('Checkout') {
            steps {    
                sh 'echo \' Checkout... \''
            }
        }
        stage('Build') {
            steps {
                sh 'echo \' build... \''
                sh 'pwd'
                sh 'ls'                
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo \' Deploy... \''    
            }
        }
    }
}
