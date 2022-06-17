public class EnvInfo implements java.io.Serializable {
    private String jobName;
    private String buildNumber;

    public EnvInfo() {
        this.jobName = env.JOB_NAME;
        this.buildNumber = env.BUILD_NUMBER;
    }

    public String getJobName() {
        return jobName;
    }

    public String getBuildNumber() {
        return buildNumber;
    }
}