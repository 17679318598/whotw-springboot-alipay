package com.whotw.config;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    public static String AREA_NAME = "http://pbz5de.natappfree.cc";
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016091400510510";
    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDJyh+YknI8znpr8TNqVoUtAhuvXZFkeFN5P0pzsFJOTyz9eqJHqEcUkxg7QBgQFozlWbZktRG/ue/SYflznvN/NFRLqDmZ+GWVEkxp/SMOVCRV0FX3TDY5NQlZZmk9etcIGiKUrkLw0j3CGZTHdCV4yZXc2wmRKPN3pFgpJNSBaLQinyYkPY361pKDdOEaTSVho24fS4FTFAdbRqeSuMkhXqW6jQ/z1fLvhdkWRF7hZ8uZhsj2roB4+mUVRE92LgBkUaR4shNtfl3gxGwKKeihnxvPm07ZPtFujpP+G5VKXViIJ5AtI1A9K/XTkC8mpKE2JxR75gEFfE1aCZXDfG/ZAgMBAAECggEAMiRMl6AETQHNv9bOvOTE8PsuH/RzNXEE5QMKIBc3TIg2GMKJYp75Eq6+fbKeiBjiZ/dT8FBiGa89XZzE3KspvHknXSlvLshfjZxfapLhTCUyZjR/uBSzAKIiMZnWGtXUawn7f9CRh7/mYr3yj2FYElydJaU0CmMPpLIsygSB3anS7In6osjEA0/xMjn+tCN1FJ0GmxmlD8gEbNdh+Arr2KCLIGZrs+dVubkrO5YjyTB7j3GoolyZManWePDTXW+Yy2igJdQrnsvO30VpoJqB1xSBNwwK9WREdkJ71zu1sXiFcjEcNIywrdROQlXnCM8KMGU4wVNkWev8RHiVKJyGAQKBgQDjqFDRL7imSjtpn0uan9GSQkxoRvNfTHrFfsbRGUN3i39uqFMVS4DDI47aFYaIAGAYAHBtby2Rr8zH9fMpCf+EHewX3PIc66UsgSP4d9UzYnDBM3rnzj7VjnqHZSgUCnLYwVgCjAu0fbty7Q+zDNP3iS1jum9EuS46E6YB0IShQQKBgQDi6V6FTD8AXnhI6QQFINxL3NO12Ba8N2hxhswJGhI0twTuZglvJz1YZoqHZLL4k9c5nK8LZ3p2jiYtEuC3RzVyHqpo5rKgFEoBNM0Q/cZfS+CdLONMgDRhgzCUVAq1b+vmRoLdad6ap6vORIVGB1PEfLVifjYdoZywHy+I7SQQmQKBgQDT53XiYPMVBf+rXvT2plBiPYf1gCVEzWFxt4HEXCmqepRRIijDp5XhDZYIdQTWTtMjRDViB5x5ARQyBEMkLgRCq794rtZGCSmj9UjQHGq8+6JMk2iRoC5ohciTgpr9nIQuMjmDlWvHw0jZvsNgPE6JGIzBSWYMp/nZYTSid78cgQKBgQCE22cAXRg2OxnqdqRn7EmQEYfT3OXS5g49ClPEsIMgYlh8zTmQ30TH0aIijA9OBCHsFZVX9Ap8B9bKZVc1eHgOjW3xZcIIgFikRCodXLkdauvkmzeqvxXsUkfLUTnD6fgRKA/PXAF+Q9YQO4Zc7kVZsjrxpDxDNTDs3hWS8mY/YQKBgQCl3DTvwheY9VleNAX/9JWOelgTbIJPi0wDur0vzXWYTGBCdxvhaxsO/SXzZyYFSR7GZMWHY/7OPdHZdGfZmr2hooMvT6FhCYRpuUxc/IxUByNj2hu9G6PZlSThwS6TyoGTDYsXigKcrWZkTARGCben4f1fZwYQoBhZM5JAyEbPJA==";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxQqSDo5zZWi/qq57eXjlrfdKIpq5E9BBW1bYjBBtBSmzsXYQU9Q4/SMeT+fzOpKDJv6ma7erjymvJ6M/a8RLT3qbP37b1Z7TyV9J33C0rtGedSZlcxRdJ2CQwr/Sk+B/LQ9pQq3K6XX5ZPEEyH5+eWiNO4nL8rBJW1hf4Z28zxG0UtI08HslBCZz25+cviXYd2foMkUwvnEwdgNDONccv3h/s9MggkZnGxbERPAa2pWNMZkob5RaXENCG59oHCe1G+qkWq+bwMauXM5hrgmirR/gfTXBb90pdNn2tTlk9zRsG1gMPbwAUlHZyfPD2aAR9H1TiYJDgjlXE6NpPRt7DQIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = AREA_NAME + "/notify_url";
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = AREA_NAME + "/return_url";
    // 签名方式
    public static String sign_type = "RSA2";
    // 字符编码格式
    public static String charset = "utf-8";
    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
    // 支付宝网关
    public static String log_path = "F:\\";

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

