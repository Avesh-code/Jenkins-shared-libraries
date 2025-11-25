def call(string url, string branch){
  echo "This is Cloning the Code"
  git url: url, branch: branch
  echo "Code Cloning is Successfull"
}
