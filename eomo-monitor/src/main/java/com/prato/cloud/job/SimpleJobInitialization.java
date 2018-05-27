package com.prato.cloud.job;

import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.JobTypeConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.prato.cloud.config.ElasticJobProperties.SimpleConfiguration;

import java.util.Map;

/**
 * ElasticJob简单任务初始化
 */
public class SimpleJobInitialization extends AbstractJobInitialization {
    private Map<String, SimpleConfiguration> simpleConfigurationMap;

    public SimpleJobInitialization(final Map<String, SimpleConfiguration> simpleConfigurationMap) {
        this.simpleConfigurationMap = simpleConfigurationMap;
    }

    public void init() {
        for (String jobName : simpleConfigurationMap.keySet()) {
            SimpleConfiguration configuration = simpleConfigurationMap.get(jobName);
            initJob(jobName, configuration.getJobType(), configuration);
        }
    }

    @Override
    public JobTypeConfiguration getJobTypeConfiguration(String jobName, JobCoreConfiguration jobCoreConfiguration) {
        SimpleConfiguration configuration = simpleConfigurationMap.get(jobName);
        return new SimpleJobConfiguration(jobCoreConfiguration, configuration.getJobClass());
    }
}
