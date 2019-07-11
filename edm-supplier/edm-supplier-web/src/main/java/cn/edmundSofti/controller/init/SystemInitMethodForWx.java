package cn.edmundSofti.controller.init;

import cn.edmundSofti.pojo.wx.WxTokenRequestModel;
import cn.edmundSofti.pojo.wx.WxTokenResponseModel;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import java.net.URISyntaxException;

/**
 * ssm 项目启动监听器，
 *  --- wx 调用使用获取token
 * @Description //TODO
 * @Author wangguanbo
 * @Date 21:39 2019/7/11
 * @return
 **/
@Service
public class SystemInitMethodForWx implements InitializingBean, ServletContextAware {

    @Override
    public void setServletContext(ServletContext servletContext) {
        new Thread(()->{
            try {
                while (true){
                    WxTokenRequestModel wxTokenRequestModel = new WxTokenRequestModel();
                    RestTemplate restTemplate = new RestTemplate();
                    ResponseEntity<WxTokenResponseModel> wxTokenResponseModelResponseEntity = restTemplate.postForEntity("https://api.weixin.qq.com/cgi-bin/token", wxTokenRequestModel, WxTokenResponseModel.class);
                    WxTokenResponseModel body = wxTokenResponseModelResponseEntity.getBody();
                    if(!StringUtils.isEmpty(body.getAccess_token())){
                        Thread.currentThread().sleep(1000 * 7000);
                    }else{
                        Thread.currentThread().sleep(3000);
                    }
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
