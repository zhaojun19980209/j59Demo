package org.java.service;

import com.alipay.api.AlipayApiException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class ServiceImpl {

    public void ali(HttpServletResponse response, HttpServletRequest request) throws AlipayApiException, IOException {

//        PrintWriter out = response.getWriter();
//        //获得初始化的AlipayClient
//        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.URL, AlipayConfig.APPID, AlipayConfig.RSA_PRIVATE_KEY, AlipayConfig.FORMAT, AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.SIGNTYPE);
//        //设置请求参数
//        AlipayTradeRefundRequest alipayRequest = new AlipayTradeRefundRequest();
//
//        alipayRequest.setReturnUrl(AlipayConfig.return_url);
//        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
//
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
//        // 商户订单号，商户网站订单系统中唯一订单号，必填
//        String out_trade_no = sdf.format(new Date());
//
//        // 付款金额，必填
//        String total_amount = "50";
//
//        //订单名称，必填
//        String subject ="alipay";
//        alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\","
//                + "\"total_amount\":\"" + total_amount + "\","
//                + "\"subject\":\"" + subject + "\","
//                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
//
//        // 请求
//        String result = alipayClient.pageExecute(alipayRequest).getBody();
////        //输出
////     //   out.println(result);//以下写自己的订单代码
////
////        AlipayConfig.logResult(result);// 记录支付日志
////
////
////       // String form = alipayClient.pageExecute(alipayRequest).getBody(); //调用SDK生成表单
////        response.setContentType("text/html;charset=utf-8");
////        response.getWriter().write(result);//直接将完整的表单html输出到页面
////        response.getWriter().flush();
//
//        return result;
    }
}
