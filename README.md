# J-DDNS
>   Java 实现的动态域名解析，适用于有 `域名`、`非固定公网 IP` 的用户使用。  
>   如需更改定时任务时间，修改 [DdnsTask](https://github.com/OlnyBigRoc/Jddns/blob/main/src/main/java/cn/bigroc/jddns/task/DdnsTask.java) cron值即可。 
## 原理
> `启动`>`查询公网 IP`>`与记录值比对`>`相同：不进行任何操作 不同：更新记录值`；之后每隔 5 分钟执行一次上述逻辑。  
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