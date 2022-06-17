package env

public class EnvInfo implements java.io.Serializable {
    def script

    public EnvInfo(script) {
        this.script = script
    }

    public String getJobName() {
        return script.env.JOB_NAME;
    }

    public String getBuildNumber() {
        return script.env.BUILD_NUMBER;
    }
}