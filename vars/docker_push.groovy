def call(String projectname,String imagename){
  withCredentials([usernamePassword('credentialsId':"dockerHubCred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")])
  {
    sh """docker login -u "${dockerHubUser}" -p "${dockerHubPass}" """
    sh "docker image tag ${projectname}:${imagename} ${dockerHubUser}/${projectname}:${imagename} "
    sh "docker push ${dockerHubUser}/${projectname}:${imagename} "
  }
}
