package cn.edmundSofti.controller.init;

import cn.edmundSofti.pojo.wx.WxToken;
import cn.edmundSofti.pojo.wx.WxTokenRequestModel;
import cn.edmundSofti.pojo.wx.WxTokenResponseModel;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import java.util.HashMap;

/**
 * ssm 项目启动监听器，
 *  --- wx 调用使用获取token
 * @Description //TODO
 * @Author wangguanbo
 * @Date 21:39 2019/7/11
 * @return
 @Service
 **/
@Component
public class SystemInitMethodForWx implements InitializingBean, ServletContextAware {

    @Override
    public void setServletContext(ServletContext servletContext) {
        new Thread(()->{
            try {
                while (true){
                    RestTemplate restTemplate = new RestTemplate();
                    ResponseEntity<WxTokenResponseModel> wxTokenResponseModelResponseEntity =
                            restTemplate.getForEntity("https://api.weixin.qq.com/cgi-bin/token?grant_type={grant_type}&appid={appid}&secret={secret}",
                                    WxTokenResponseModel.class,
                                    new HashMap<String,String>(){{
                                this.put("grant_type", WxTokenRequestModel.WxToken.grant_type.getValue());
                                this.put("appid", WxTokenRequestModel.WxToken.appid.getValue());
                                this.put("secret", WxTokenRequestModel.WxToken.secret.getValue());
                            }});
                    WxTokenResponseModel body = wxTokenResponseModelResponseEntity.getBody();
                    if(!StringUtils.isEmpty(body.getAccess_token())){
                        WxToken.initThread(Thread.currentThread());
                        WxToken.initTokenValue(body.getAccess_token(),Thread.currentThread());
                        Thread.currentThread().sleep(1000 * 7200);
                        System.out.println("===========微信小程序获取Access_token成功！===========");
                    }else if(!StringUtils.isEmpty(body.getErrmsg())){
                        System.out.println(body.getErrcode());
                        System.out.println(body.getErrmsg());
                        throw new RuntimeException("调用微信授权服务失败。");
                    }
                    Thread.currentThread().sleep(3000);
                    System.out.println(body);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

}
