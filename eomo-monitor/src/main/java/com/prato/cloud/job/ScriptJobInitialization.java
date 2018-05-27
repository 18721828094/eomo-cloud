package com.prato.cloud.job;

import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.JobTypeConfiguration;
import com.dangdang.ddframe.job.config.script.ScriptJobConfiguration;
import com.prato.cloud.config.ElasticJobProperties.ScriptConfiguration;

import java.util.Map;

/**
 * 脚本任务初始
 */
public class ScriptJobInitialization extends AbstractJobInitialization {
    private Map<String, ScriptConfiguration> scriptConfigurationMap;

    public ScriptJobInitialization(final Map<String, ScriptConfiguration> scriptConfigurationMap) {
        this.scriptConfigurationMap = scriptConfigurationMap;
    }

    public void init() {
        for (String jobName : scriptConfigurationMap.keySet()) {
            ScriptConfiguration configuration = scriptConfigurationMap.get(jobName);
            initJob(jobName, configuration.getJobType(), configuration);
        }
    }

    @Override
    public JobTypeConfiguration getJobTypeConfiguration(String jobName, JobCoreConfiguration jobCoreConfiguration) {
        ScriptConfiguration configuration = scriptConfigurationMap.get(jobName);
        return new ScriptJobConfiguration(jobCoreConfiguration, configuration.getScriptCommandLine());
    }
}
