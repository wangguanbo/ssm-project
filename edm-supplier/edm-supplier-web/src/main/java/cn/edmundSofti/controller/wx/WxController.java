package cn.edmundSofti.controller.wx;

import cn.edmundSofti.pojo.wx.WxCheckModel;
import jdk.nashorn.internal.parser.Token;
import org.springframework.http.HttpRequest;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

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

    @RequestMapping("/getWxMessage")
    public void getWxMessage(WxCheckModel wxCheckModel, HttpServletResponse httpServletResponse) throws IOException {
        System.out.println(wxCheckModel.toString());
        String shal = shal(sort(TOKEN, wxCheckModel.getTimestamp(), wxCheckModel.getNonce()));
        if(!StringUtils.isEmpty(wxCheckModel.getSignature())&&!StringUtils.isEmpty(shal)&&shal.equals(wxCheckModel.getSignature())){
            httpServletResponse.getWriter().write(wxCheckModel.getEchostr());
        }else {
            System.out.println("验证失败！");
        }
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
