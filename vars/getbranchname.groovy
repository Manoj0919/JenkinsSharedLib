// vars/getBranchName.groovy
def call(def branchname) {
    sh(script: "git name-rev --name-only HEAD", returnStdout: true).trim()
}
