def call(String projectname, String imagetag){
  sh """docker buildx build -t "${projectname}:${imagetag}" ."""
}
