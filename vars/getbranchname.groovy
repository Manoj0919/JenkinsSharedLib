// vars/getBranchName.groovy
def call() { 
    def fullRef = sh(script: "git name-rev --name-only HEAD", returnStdout: true).trim() return fullRef.split('/')[-1]
     }