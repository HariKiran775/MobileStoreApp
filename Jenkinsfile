pipeline{
     agent any
     tools{
     	maven '3.9.1'
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
        
