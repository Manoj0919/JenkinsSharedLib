def call() {
    def fullRef = sh(script: "git name-rev --name-only HEAD", returnStdout: true).trim()
    if (fullRef == 'HEAD') {
        return 'unknown-branch'
    }
    return fullRef.split('/')[-1]
}