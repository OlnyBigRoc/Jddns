# J-DDNS
>   Java 实现的动态域名解析，适用于有 `域名`、`非固定公网 IP` 的用户使用。  
>   原理为程序启动时查询一次公网 IP ，如果当前IP与记录值不匹配就会更新记录的记录值（IP）；之后每隔 5 分钟跑一次上述逻辑。  
>   如需更改定时任务时间，修改 [DdnsTask](https://github.com/OlnyBigRoc/Jddns/blob/main/src/main/java/cn/bigroc/jddns/task/DdnsTask.java) cron值即可。 

## 服务商支持:
  1. :white_check_mark: [DNSPOD](https://www.dnspod.cn/) （腾讯）

## 使用

### ①源码
- 下载代码
```shell script
git clone https://github.com/OlnyBigRoc/Jddns.git
```
- 修改配置文件 `resources/application.yml`
- maven 打包
```shell script
mvn package -DskipTests
```
- 运行

```shell script
java -jar jddns-0.0.1.jar > jddns.log &
```
如果Linux存在时区问题 请使用
```shell script
java -jar -Duser.timezone=GMT+08  jddns-0.0.1.jar > jddns.log &
```
### 配置
- DNSPOD token 使用示例 [DNSPOD_DOC](https://docs.dnspod.cn/account/5f2d466de8320f1a740d9ff3/)  