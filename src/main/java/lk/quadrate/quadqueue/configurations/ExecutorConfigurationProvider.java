package lk.quadrate.quadqueue.configurations;

public interface ExecutorConfigurationProvider {

    Integer corePoolSize();
    Integer maxPoolSize();
    Integer queueCapacity();

}
