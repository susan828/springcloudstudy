package cn.springcloud.provider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProvideraApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ProvideraApplication.class).web(true).run(args);
    }
}
