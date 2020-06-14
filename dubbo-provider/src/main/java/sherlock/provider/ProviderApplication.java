package sherlock.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: sherlock
 * @description:
 * @date: 2020/5/21 6:19
 */
@SpringBootApplication
@EnableDubbo //启用dubbo 扫描那些类具有@Service
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}

