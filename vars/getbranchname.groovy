// vars/getBranchName.groovy
def call() {
    return sh(script: "git rev-parse --abbrev-ref HEAD", returnStdout: true).trim()
}
