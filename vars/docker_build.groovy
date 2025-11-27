def call(String projectname, String imagetag){
  sh """docker build -t "${projectname}:${imagetag}" ."""
}
