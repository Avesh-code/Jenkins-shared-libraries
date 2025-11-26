def call(String projectname, String imagetag){
  sh """sudo docker build -t "${projectname}:${imagetag}" ."""
}
