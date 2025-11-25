def call(string dockerhubuser, string projectname, string imagetag){
  sh "sh "sudo docker build -t "${dockerhubuser}"/"${projectname}":"${imagetag}" ."
}
