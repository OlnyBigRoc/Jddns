package cn.bigroc.jddns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author onlybigroc
 * See { @linktourl http://onlybigroc.cn}
 */
@SpringBootApplication
@EnableScheduling
public class DdnsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DdnsApplication.class, args);
    }

}
