def call(string projectname, string imagetag){
  sh "sudo docker build -t "${projectname}":"${imagetag}" .
}
