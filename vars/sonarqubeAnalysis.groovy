def call() {
    withSonarQubeEnv('sonar-scanner') {
        sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=youtube -Dsonar.projectKey=youtube '''
    }
}
