public class EnvInfo implements java.io.Serializable {
    private String jobName;
    private String buildNumber;

    public EnvInfo() {
        this.jobName = env.JOB_NAME;
        this.buildNumber = env.BUILD_NUMBER;
    }

    @Override
    public String getJobName() {
        return jobName;
    }

    @Override
    public String getBuildNumber() {
        return buildNumber;
    }
}