def sendEmail(String subject, String body, String recipient) {
    emailext(
        subject: subject,
        body: body,
        to: recipient,
        mimeType: 'text/html'
    )
}
post{
    success {
             sendEmail(
                "${env.JOB_NAME} - ${env.BUILD_NUMBER} - Build success.",
                "Build sucess. Please check the console output at ${env.BUILD_URL}", 'devopsmaonj1909@gmail.com'
                 )
    }
    
        failure{
            sendEmail(
                "${env.JOB_NAME} - ${env.BUILD_NUMBER} - Build FAILED to copy the files",
                "Build FAILED. Files are copied to nignix. Please check the console output at ${env.BUILD_URL}",'devopsmanu1909@gmail.com'
                 )
    }
}