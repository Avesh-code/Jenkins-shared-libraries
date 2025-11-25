def call(string projectname, string imagetag){
  withCredentials([usernamePassword('credentialsId':"dockerHubCred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")])
      {  
        sh "sh "sudo docker build -t "${env.dockerHubUser}"/"${projectname}":"${imagetag}" ."
      }
}
