package cn.bigroc.jddns.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 系统启动完成后执行
 * @author lipeng
 * @date 2020/10/29 8:52
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Autowired
    private DdnsTask ddnsTask;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        ddnsTask.run();
    }
}
