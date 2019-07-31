package cn.edmundSofti.controller.util;

import cn.edmundSofti.controller.factory.MessageBuildFactory;
import cn.edmundSofti.interfaces.wxmessage.WxMessageBuild;
import cn.edmundSofti.pojo.wx.enumPj.MessageType;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.util.Assert;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 消息xml解析、发送工具类
 * @Description
 * @Author wangguanbo
 * @Date 14:55 2019/7/12
 * @return
 **/
public class MessageUtil {


    /**
     * 解析xml为XML
     * @param httpServletRequest
     * @return
     * @throws IOException
     */
    public static Map parseXmlToMap(HttpServletRequest httpServletRequest) throws IOException, DocumentException {

        Assert.notNull(httpServletRequest);
        Map<String,String> resultMap = new HashMap<>();
        ServletInputStream inputStream = httpServletRequest.getInputStream();
        List<Element> elements = new SAXReader().read(inputStream).getDocument().getRootElement().elements();
        elements.stream().forEach(s1->resultMap.put(s1.getName(),s1.getText()));
        inputStream.close();
        return resultMap;
    }


    public static String buildXml(Map<String,String> msgMap){

        String result = "";
        String msgType = msgMap.get("MsgType");
        if (MessageType.TEXT.name().equals(msgType.toUpperCase())) {
            WxMessageBuild messageBuildForType = MessageBuildFactory.getMessageBuildForType(MessageType.TEXT.name());
            result = messageBuildForType.buildMessage(msgMap);
        }

        return result;
    }

}
