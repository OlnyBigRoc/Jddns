package cn.bigroc.jddns.model.dnspod;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

/**
 * @author lipeng
 * @date 2020/11/2 15:34
 */
@SpringBootTest
class DnspodTest {

    @Autowired
    private Dnspod dnspod;
    @Test
    void run() throws IOException {
       dnspod.run("36.44.152.139");
    }
}