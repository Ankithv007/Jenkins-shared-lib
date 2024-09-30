def call(String url, String branch){
  echo "this is for clone the code"
  git url: "${url}", branch: "${branch}"
  echo "clone code is sucess"
}
