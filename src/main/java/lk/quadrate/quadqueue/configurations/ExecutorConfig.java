package lk.quadrate.quadqueue.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExecutorConfig implements ExecutorConfigurationProvider {

    @Value("${quad-queue.configuration.executor.core-pool-size}")
    private Integer corePoolSize;
    @Value("${quad-queue.configuration.executor.max-pool-size}")
    private Integer maxPoolSize;
    @Value("${quad-queue.configuration.executor.queue-capacity}")
    private Integer queueCapacity;

    @Override
    public Integer corePoolSize() {
        return corePoolSize;
    }

    @Override
    public Integer maxPoolSize() {
        return maxPoolSize;
    }

    @Override
    public Integer queueCapacity() {
        return queueCapacity;
    }
}
