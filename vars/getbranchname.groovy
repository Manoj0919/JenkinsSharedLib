// vars/getBranchName.groovy
def call(branchName) {
    sh(script: "git name-rev --name-only HEAD", returnStdout: true).trim()
    echo "Branch name is: ${branchName}"
}
