package cn.edmundSofti.controller.wx;

import cn.edmundSofti.controller.util.MessageUtil;
import cn.edmundSofti.pojo.wx.WxCheckModel;
import org.dom4j.DocumentException;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description 微信开发后台控制层
 * @Author wangguanbo
 * @Date 20:49 2019/7/11
 * @return
 **/
@RestController
@RequestMapping("/wx")
public class WxController {

    private final String TOKEN = "guanboToken";

    /**
     * 微信验证身份使用get方法调用该方法
    * @param wxCheckModel
     * @param httpServletResponse
     * @throws IOException
     */
    @RequestMapping(value = "/getWxMessage",method = RequestMethod.GET)
    public void getWxMessage(WxCheckModel wxCheckModel, HttpServletResponse httpServletResponse) throws IOException {
        System.out.println(wxCheckModel.toString());
        String shal = shal(sort(TOKEN, wxCheckModel.getTimestamp(), wxCheckModel.getNonce()));
        if(!StringUtils.isEmpty(wxCheckModel.getSignature())&&!StringUtils.isEmpty(shal)&&shal.equals(wxCheckModel.getSignature())){
            System.out.println("===========微信小程序验证身份成功！===========");
            httpServletResponse.getWriter().write(wxCheckModel.getEchostr());
        }else {
            System.out.println("验证失败！");
        }
    }

    /**
     * 微信消息发送系统处理回调。
     * @param req
     * @param resp
     * @return
     */
    @RequestMapping(value = "/getWxMessage",method = RequestMethod.POST)
    public String getWxMessage(HttpServletRequest req, HttpServletResponse resp){

        String result = "服务器未能正确响应。。";
        String defaultMessage = "服务器未能正确响应。。";
        try {
            Map map = MessageUtil.parseXmlToMap(req);
            result = MessageUtil.buildXml(map);
            if (StringUtils.isEmpty(result)) {
                result = defaultMessage;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return result;
    }



    private String sort(String... arg) {
        StringBuffer stringBuffer = new StringBuffer("");
        Arrays.stream(arg).sorted().forEach(s1 -> stringBuffer.append(s1));
        return stringBuffer.toString();
    }

    /**
     * 字符串进行shal加密
     *
     * @param str
     * @return
     */
    public String shal(String str) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.update(str.getBytes());
            byte messageDigest[] = digest.digest();
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < messageDigest.length; i++) {
                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

}
