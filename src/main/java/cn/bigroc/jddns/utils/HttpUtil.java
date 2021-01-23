package cn.bigroc.jddns.utils;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author onlybigroc
 * See { @linktourl http://onlybigroc.cn}
 * @date 2020/10/29 20:37
 */
public class HttpUtil {
    /**
     * HTTP GET请求
     *
     * @param url 请求地址
     * @return 返回ip
     * @throws IOException 异常
     */
    public static String sendGet(String url) throws IOException {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        //默认值GET con.setRequestMethod("GET");可以不设置
        con.setConnectTimeout(1000 * 10);
        con.setReadTimeout(1000 * 10);
        return getString(con);
    }



    /**
     * HTTP POST请求
     *
     * @param url           地址
     * @param urlParameters 参数
     * @throws IOException 异常
     */
    public static String sendPost(String url, String urlParameters) throws IOException {
        URL obj = new URL(url);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
        con.setConnectTimeout(1000 * 10);
        con.setReadTimeout(1000 * 10);
        //添加请求头
        con.setRequestMethod("POST");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        //发送Post请求
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();
        return getString(con);
    }

    private static String getString(HttpURLConnection con) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }
}
