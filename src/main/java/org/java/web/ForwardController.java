package org.java.web;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradePagePayModel;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.java.alipay.AlipayConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ForwardController {

//    @Autowired
//    private ServiceImpl service;



    @RequestMapping("/pay")
    public void    alipayIumpSum(HttpServletRequest request, HttpServletResponse response) throws  Exception{

//        PrintWriter out = response.getWriter();
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.URL, AlipayConfig.APPID, AlipayConfig.RSA_PRIVATE_KEY, AlipayConfig.FORMAT, AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.SIGNTYPE);
        //设置请求参数
        AlipayTradePagePayRequest pagePayRequest = new AlipayTradePagePayRequest();

        pagePayRequest.setReturnUrl(AlipayConfig.return_url);
        pagePayRequest.setNotifyUrl(AlipayConfig.notify_url);

        AlipayTradePagePayModel model = new AlipayTradePagePayModel();
        model.setProductCode("FAST_INSTANT_TRADE_PAY"); // 设置销售产品码
        model.setOutTradeNo("20135422010101051"); // 设置订单号
        model.setSubject("华为12"); // 订单名称
        model.setTotalAmount("12"); // 支付总金额
        model.setBody("华为12"); // 设置商品描述
        pagePayRequest.setBizModel(model);

        String form = alipayClient.pageExecute(pagePayRequest).getBody(); // 生成表单

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write(form); // 直接将完整的表单html输出到页面
        response.getWriter().flush();
        response.getWriter().close();
    }

    @RequestMapping("returnUrl")
    public String returnUrl() throws InterruptedException {
        return "show";
    }
//    @RequestMapping("returnUrl")
//    public void returnUrl(){
//
//        System.out.println("########");
//    }
//    /**
//     * 同步跳转
//     *
//     * @param request
//     * @throws Exception
//     */
//    @RequestMapping("returnUrl")
//    public ModelAndView returnUrl(HttpServletRequest request) throws Exception {
//
//        ModelAndView mav = new ModelAndView();
//
//        // 获取支付宝GET过来反馈信息（官方固定代码）
//        Map<String, String> params = new HashMap<String, String>();
//        Map<String, String[]> requestParams = request.getParameterMap();
//        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
//            String name = (String) iter.next();
//            String[] values = (String[]) requestParams.get(name);
//            String valueStr = "";
//            for (int i = 0; i < values.length; i++) {
//                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
//            }
//            params.put(name, valueStr);
//        }
//        boolean signVerified = AlipaySignature.rsaCheckV1(params,AlipayConfig.ALIPAY_PUBLIC_KEY,AlipayConfig.CHARSET,AlipayConfig.SIGNTYPE); // 调用SDK验证签名
//
//        // 返回界面
//        if (signVerified) {
//            System.out.println("前往支付成功页面");
//            mav.setViewName("successReturn");
//        } else {
//            System.out.println("前往支付失败页面");
//            mav.setViewName("failReturn");
//        }
//       return mav;
//    }
//
//    /**
//     * 支付宝服务器异步通知
//     *
//     * @param request
//     * @throws Exception
//     */
//    @RequestMapping("/notifyUrl")
//    public void notifyUrl(HttpServletRequest request) throws Exception {
//        // 获取支付宝GET过来反馈信息
//        Map<String, String> params = new HashMap<String, String>();
//        Map<String, String[]> requestParams = request.getParameterMap();
//        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
//            String name = (String) iter.next();
//            String[] values = (String[]) requestParams.get(name);
//            String valueStr = "";
//            for (int i = 0; i < values.length; i++) {
//                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
//            }
//            params.put(name, valueStr);
//        }
//
//        boolean signVerified = AlipaySignature.rsaCheckV1(params,AlipayConfig.ALIPAY_PUBLIC_KEY,AlipayConfig.CHARSET,AlipayConfig.SIGNTYPE); // 调用SDK验证签名
//
//        if (signVerified) { // 验证成功 更新订单信息
//            System.out.println("异步通知成功");
//            // 商户订单号
//            String out_trade_no = request.getParameter("out_trade_no");
//            // 交易状态
//            String trade_status = request.getParameter("trade_status");
//            // 修改数据库
//        } else {
//            System.out.println("异步通知失败");
//        }
//    }
}
