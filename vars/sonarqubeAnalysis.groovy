def call() {
    withSonarQubeEnv('sonar-token') {
        sh ''' $SCANNER_HOME/bin/sonar-token-Dsonar.projectName=Youtube -Dsonar.projectKey=Youtube '''
    }
}
