pipeline {
    agent any
    stages{
        stage('Checkout') {
            steps {    
                sh 'echo \' Checkout... \''
                // git credentialsId: '8fef339b-a745-43b5-a8b1-5aa27b3be4a3', url: 'ssh://git-codecommit.ap-northeast-1.amazonaws.com/v1/repos/eyesmedia-corpus-service'
            }
        }
        stage('Build') {
            steps {
                sh 'echo \' build... \''
                //sh 'cd ${WORKSPACE}'
                sh 'pwd'
                //sh 'ls'
                //sh 'bin/packaging.sh ${PROJECT_NAME}'
                //sh 'ls'
                //sh 'pwd'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo \' Deploy... \''
                //sh '''
                //    ls
                //    pwd
                //    '''
                //sh 'echo 12345678 | sudo -S cp ${WORKSPACE}/dist/${PROJECT_NAME}.deploy.tar.gz /home/mingchun/deploy/'
                
                /*
                sshagent(credentials: ['0b9bfec8-84cf-4779-a03f-dc953a7d7e43']) {
                    sh 'scp -o StrictHostKeyChecking=no ./dist/eyesmedia-corpus-service-0.9.0.tar.gz ubuntu@52.197.42.188:/home/ubuntu/deploy'
                    sh 'ssh -o StrictHostKeyChecking=no ubuntu@52.197.42.188 tar zxvf /home/ubuntu/deploy/eyesmedia-corpus-service-0.9.0.tar.gz -C /home/ubuntu/deploy'
                }
                */
                
                //cleanWs()
            }
        }
    }
}
