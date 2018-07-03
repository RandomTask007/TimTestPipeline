<<<<<<< HEAD
pipeline { 
    agent any
     tools { 
        maven 'Maven 3.3.9' 
        jdk 'jdk8' 
    }  
    stages { 
        stage('Declarative: Checkout SCM') { 
            steps {
                sh 'mvn install -Pprofile -Dusername=${aeusername} -Dpassword=${aepassword} -Dorg=${aeorg}'
                 
            }
        }
         stage ('Declarative: Tool Install') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
         stage ('Build') {
            steps {
                echo 'This is a minimal pipeline.'
            }
        }
    }
=======
pipeline {
           agent any
           tools {
                 maven 'Maven'
              }
           stages{
               stage('Initialise'){
                   steps {
                       sh'''
                          echo "PATH = ${PATH}"
                          echo "M_HOME = ${M2_HOME}"
                       '''
                           }
               }

               stage('Build'){
                    steps {
                          sh 'mvn install -Pprod -Dusername=${aeusername} -Dpassword=${aepassword} -Dorg=${aeorg}'
                          }

                     }
                 }

>>>>>>> 27096cde06c38f7bbcea013d50cf51d682eafaab
}
