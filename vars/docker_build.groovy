def call(String projectname, String imagetag){
  sh """docker buildx build --tag "${projectname}:${imagetag}"  ."""
}
