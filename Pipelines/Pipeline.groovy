@Library("shared-library") _
pipeline {
    agent {
        kubernetes {
            yaml '''
        apiVersion: v1
        kind: Pod
        spec:
          containers:
          - name: maven
            image: maven:alpine
            command:
            - cat
            tty: true
          - name: node
            image: node:16-alpine3.12
            command:
            - cat
            tty: true
        '''
        }
    }
    stages {
        stage('Run maven') {
            steps {
                container('maven') {
                    printMessage(env.JOB_NAME, env.BUILD_NUMBER)
                    sh 'mvn -version'
                    sh ' echo Hello World > hello.txt'
                    sh 'ls -last'
                }
                container('node') {
                    sh 'npm version'
                    sh 'cat hello.txt'
                    sh 'ls -last'
                }
            }
        }
        stage('execute script') {
            steps {
                script {
                    def jenkinsEnv = new jenkinsenv.EnvInfo(this)
                    printMessage(jenkinsEnv.getJobName(), jenkinsEnv.getBuildNumber())
                }
            }
        }
    }
}
