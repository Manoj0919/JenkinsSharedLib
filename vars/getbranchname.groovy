// vars/getBranchName.groovy
def call(def branchname) {
   ${branchname} = sh(script: "git name-rev --name-only HEAD", returnStdout: true).trim()
}
