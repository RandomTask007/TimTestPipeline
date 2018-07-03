pipeline { 
    agent any
     tools { 
        maven 'Maven 3.3.9' 
        jdk 'jdk8' 
    }  
    stages { 
        stage('Declarative: Checkout SCM') { 
            steps {
                sh 'mvn install -P$Deployment -Dusername=${aeusername} -Dpassword=${aepassword} -Dorg=${aeorg} -D$proxyName'
                 
            }
        }
     }
   }

