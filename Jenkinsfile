def git_auth = "1b5b4137-6ec6-4c19-a72c-dfccb92af91b"
def git_url = "https://gitee.com/johuer/jenkins-demo.git"

node {
   def mvnHome
   stage('拉取代吗') { // for display purposes
      // Get some code from a GitHub repository
       checkout([$class: 'GitSCM', branches: [[name: "*/${branch}"]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: "${git_auth}", url: "https://gitee.com/johuer/jenkins-demo.git"${git_url}]]])
   }

}
