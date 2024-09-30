def call(String ProjectName, String ImageTag, String DockerHubUser){
  echo "this is for docker build"
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
