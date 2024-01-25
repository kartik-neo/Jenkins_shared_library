def call() {
    withSonarQubeEnv('sonar-token') {
        sh ''' $SCANNER_HOME/bin/sonar-token -Dsonar.projectName=youtube -Dsonar.projectKey=youtube '''
    }
}
