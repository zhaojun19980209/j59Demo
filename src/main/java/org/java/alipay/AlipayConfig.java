package org.java.alipay;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
	// 商户appid
	public static String APPID = "2016101100661584";
	// 私钥 pkcs8格式的
	public static String RSA_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDOsA5VQvxSeWrVbCJ76hweGHqHxQ6Qjiqkh9EbvR8ylAnrRqo7si+wy1jzouZS4cj7y04LMXlVOvI8NjNRCTDUoP11nuI4xwnNbyfmAi+8pqhVjwEq2O0yhV0OOZUgcTr49Raj2TKz/RQ680EsKQjPxdJe8TcNscmpnXWW7d2pHDqxsnZvpDzEoStdaQzoMFOX5r8Mn3aHRkRUo7sWLkVEBO2HluD2gca39ezSFA0ElGL/352Kys57jLgntCijIAP49x8LE8jxYWY89nUWBguR8wUIUylLBvhU3k5nfJNorhoE4/lN0CCvLJc1+k7EHsv7+q3Q7OIBBebErMjNFdzLAgMBAAECggEAO8n1+3gLIZh57Q8A0rOgOpx+JXQ9iFd3wmx/cvS8Z5cnX2XrrKUY4p2QN7oxwlwKFbxz8Qz4ukz48a4EHjb4ZynC6Blz+1SoY0L6WbDcOkhDfayGe+yQgQLPLmQ93Uqj8oyDZhZYcnSNO5hOjAW6xM/G0SwZ7t41JdmkwGpCqr43/qR62EBj6O1GfwBVcNMtmqlC+lOTZFbJRNeeytVxO1/L12yZm1KUxl9hkmWw6w4vQmz51EQnPXgJGcwzqHNocpMsTVRDwFF+wMCTVBiX9ql3XrX0fHhzlDMdTb7T7PacCsm4tLDA+eZxvDK25xDrM6eg53yZMMwTk4/BDIEu4QKBgQD+rPXWF/ZH+R2NrEUJXbDLS+OCUiBL9gNt4j1jDIxs9DVgCjq/Yw51mN6SvDxFdF8yRLT/t1AHRURCtFmhiXsJ/fjbgDe+ggOwssqJQdg6BE/fojZgETYYOUQnjZ9fofHG6tK3hvDIAjKwF7Ngwy/BuLcKUuvLdAlOm0np6Lvo8wKBgQDPwzYVhCulGzkVkpWgaM/fZZqJIxZvyaZBiPBNCiRlcI5zAZuHowEFivSRSm+DtiNHyXM1Q9RJSH7ezrNxPh3ZFghMcq444RpdtZul+r8B/KvJtR4DH41pPaz7fjoxKNFuOZ1nSLrPcaZET5znxJo1D6tkamdhuDU5IPEppOGyyQKBgQCsg6k7z5uLAZsdXvac85RRAiUpIEy0Z//GrZx7vgJZw8tsNUG6Z3Vh/521tED3o27g9F3PYvOZGTi2HskgfaqVCC9NMTuRlyy8w0AjXjEEi+s3SAChbsc//XrHeE3fUCohXuxCWew88BA57LQb9dwh0+hZ2/XSKdYsI1EcXAT+NQKBgBb6L/ERPQJ1kEqie4nSDatXQVAJYWHbm1eEHY9nn77YQ+jUNK87h9FlHMc0xEB81EoMLYGmjsPMELvzgET16bcoiKJrzHjd7FyQyTYCFT3TA+y66ybNRoZtG8R0oVrueLsIBDB4CrEGkKzdYS0AwU08/meMnQJhrQE0c3d3lL6BAoGBAIc/mJmp1M1gb+9+FF5UMSTNzFgvXyqqb5f2AphoIWEmc5nqixeykChEKn8iVqE22y/D73zfSpVb3wDy/3Nln9pBbrBTfnFYKKj+kNMQLs/vkEmqvKjHuadWN6qHTNuIshDVzRV1DcYDifa+6nyD22AlokX6GNdBORRIT/tS77mC";
	// 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:9999/springboot_j59_alipay/notifyUrl";
	// 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
	public static String return_url = "http://localhost:9999/springboot_j59_alipay/returnUrl";
	// 请求网关地址
	public static String URL = "https://openapi.alipaydev.com/gateway.do";
	// 编码
	public static String CHARSET = "UTF-8";
	// 返回格式
	public static String FORMAT = "json";
	// 支付宝公钥
	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAzrAOVUL8Unlq1Wwie+ocHhh6h8UOkI4qpIfRG70fMpQJ60aqO7IvsMtY86LmUuHI+8tOCzF5VTryPDYzUQkw1KD9dZ7iOMcJzW8n5gIvvKaoVY8BKtjtMoVdDjmVIHE6+PUWo9kys/0UOvNBLCkIz8XSXvE3DbHJqZ11lu3dqRw6sbJ2b6Q8xKErXWkM6DBTl+a/DJ92h0ZEVKO7Fi5FRATth5bg9oHGt/Xs0hQNBJRi/9+disrOe4y4J7QooyAD+PcfCxPI8WFmPPZ1FgYLkfMFCFMpSwb4VN5OZ3yTaK4aBOP5TdAgryyXNfpOxB7L+/qt0OziAQXmxKzIzRXcywIDAQAB";
	// 日志记录目录
	public static String log_path = "F://";
	// RSA2
	public static String SIGNTYPE = "RSA2";


	/**
	 * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	 * @param sWord 要写入日志里的文本内容
	 */
	public static void logResult(String sWord) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(AlipayConfig.log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
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
