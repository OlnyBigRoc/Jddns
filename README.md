# J-DDNS
> Java 实现的动态域名解析，适用于有 `域名`、`非固定公网 IP` 的用户使用

## 服务商支持:
  1. :white_check_mark: [DNSPOD](https://www.dnspod.cn/) （腾讯）

## 使用

### ①源码
- 下载代码
```
git clone https://github.com/OlnyBigRoc/Jddns.git
```
- 修改配置文件 `resources/application.yml`
- maven 打包
```
mvn package -DskipTests
```
- 运行

```shell script
java -jar ddns-0.0.1.jar > ddns.log &
```
如果Linux存在时区问题 请使用这条命令
```shell script
java -jar -Duser.timezone=GMT+08  ddns-0.0.1.jar > ddns.log &
```