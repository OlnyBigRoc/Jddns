package cn.bigroc.jddns.utils;

import java.io.IOException;

/**
 * @author lipeng
 * @date 2020/10/29 21:43
 */
public class IpUtil {
    private static final String IP_URL = "https://api.ipify.org/";

    /**
     * 获取公网ip
     * private  static final List<String> IP_URL_LIST = Arrays.asList("http://whatismyip.akamai.com/", "http://members.3322.org/dyndns/getip", "http://icanhazip.com/", "http://v4.ident.me/","https://api.ipify.org/");
     * Random rand = new Random();
     * int i = rand.nextInt(IP_URL_LIST.size());
     * String url = IP_URL_LIST.get(i);
     *
     * @return 公网ip
     */
    public static String getPublicIp() throws IOException {
        return HttpUtil.sendGet(IP_URL);
    }
}
