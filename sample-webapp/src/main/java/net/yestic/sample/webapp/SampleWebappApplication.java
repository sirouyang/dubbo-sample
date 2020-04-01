package net.yestic.sample.webapp;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleWebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleWebappApplication.class, args);
    }

}
