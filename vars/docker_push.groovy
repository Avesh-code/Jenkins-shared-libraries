def call(String projectname,String imagename){
  withCredentials([usernamePassword('credentialsId':"dockerHubCred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")])
  {
    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass} "
    sh "docker image tag "${projectname}":"${imagename}" ${env.dockerHubUser}/"${projectname}":"${imagename}""
    sh "docker push ${env.dockerHubUser}/"${projectname}":"${imagename}""          
  }
}
