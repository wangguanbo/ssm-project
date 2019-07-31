package cn.edmundSofti.service.wxmessage;

import cn.edmundSofti.interfaces.wxmessage.WxMessageBuild;

import java.util.Date;
import java.util.Map;

/**
 * 构建微信文本信息
 * @Description //TODO
 * @Author wangguanbo
 * @Date 14:12 2019/7/14
 * @return
 **/
public class WxTextMessageBuild implements WxMessageBuild {

    @Override
    public String buildMessage(Map<String, String> msg) {
        //发送方帐号
        String fromUserName = msg.get("FromUserName");
        // 开发者微信号
        String toUserName = msg.get("ToUserName");
        /**
         * 文本消息XML数据格式
         */
        return String.format(
                "<xml>" +
                        "<ToUserName><![CDATA[%s]]></ToUserName>" +
                        "<FromUserName><![CDATA[%s]]></FromUserName>" +
                        "<CreateTime>%s</CreateTime>" +
                        "<MsgType><![CDATA[text]]></MsgType>" +
                        "<Content><![CDATA[%s]]></Content>" + "</xml>",
                fromUserName, toUserName, new Date(), "欢迎来到冠博小金库，想要点什么？(是的，目前只做了消息回复。)");
    }

}
