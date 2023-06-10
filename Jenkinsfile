pipeline{
     agent any
     tools{
     	maven 'maven_3.9'
     }
     stages{
         stage('Build the project'){
           steps{
               echo 'building the project'
               sh 'mvn clean install -DskipTests'
             }
         }
       stage('Run the maven'){
          steps{
             echo 'run the project'
              sh 'mvn spring-boot:run'
       }
      }
    }
  }
        
