pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                bat 'mvn clean package -DskipTest=true'
            }
        }
         stage('Tests'){
            steps{
                bat 'mvn test'
            }
         }
    }
}