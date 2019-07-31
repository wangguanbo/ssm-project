package cn.edmundSofti.controller.factory;

import cn.edmundSofti.interfaces.wxmessage.WxMessageBuild;
import cn.edmundSofti.pojo.wx.enumPj.MessageType;
import cn.edmundSofti.service.wxmessage.WxTextMessageBuild;

/**
 * @Description //TODO
 * @Author wangguanbo
 * @Date 14:00 2019/7/14
 * @return
 **/
public class MessageBuildFactory {

    public static WxMessageBuild getMessageBuildForType(String messageType){
        WxMessageBuild resultMessageBuild = null;
        if (messageType.equals(MessageType.TEXT.name())) {
            resultMessageBuild =  new WxTextMessageBuild();
        }
        return resultMessageBuild;
    }
}
