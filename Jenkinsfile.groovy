pipeline { 
    agent any
     tools { 
        maven 'Maven'  
    }  
    stages { 
        stage('Declarative: Checkout SCM') { 
            steps {
                sh 'mvn install -P$Deployment -Dusername=${aeusername} -Dpassword=${aepassword} -Dorg=${aeorg} -D$proxyName'
                 
            }
        }
     }
   }

