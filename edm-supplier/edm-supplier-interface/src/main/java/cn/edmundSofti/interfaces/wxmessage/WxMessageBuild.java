package cn.edmundSofti.interfaces.wxmessage;

import java.util.Map;

/**
 * 微信消息构建接口
 * @Description //TODO
 * @Author wangguanbo
 * @Date 14:05 2019/7/14
 * @return
 **/
public interface WxMessageBuild {


    String buildMessage(Map<String,String> msg);


}
