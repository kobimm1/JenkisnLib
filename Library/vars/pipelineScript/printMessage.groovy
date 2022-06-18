def call(String name, String age ){
    def jenkinsEnv = new jenkinsenv.EnvInfo(this)
    echo "@@@@@ JobName= ${name}\nBuildNumber= ${age}  @@@@@"
    echo "########## ${jenkinsEnv.getJobName()}  ---  ${jenkinsEnv.getBuildNumber()}        ###############"
}
