def call(String name, String age){
    def envInfo = new EnvInfo()
    echo "@@@@@ JobName= ${envInfo.getJobName()}\nBuildNumber= ${envInfo.getBuildNumber()}  @@@@@"
}
