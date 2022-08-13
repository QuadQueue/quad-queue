package lk.quadrate.quadqueue.components;

import lk.quadrate.quadqueue.configurations.ExecutorConfigurationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
public class AsyncConfig {

    @Autowired
    private ExecutorConfigurationProvider configurationProvider;

    @Bean
    public Executor quadExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(configurationProvider.corePoolSize());
        executor.setMaxPoolSize(configurationProvider.maxPoolSize());
        executor.setQueueCapacity(configurationProvider.queueCapacity());
        executor.setThreadNamePrefix("quad-queue-pool-");
        executor.initialize();
        return executor;
    }
}
