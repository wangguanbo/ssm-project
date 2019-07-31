package cn.edmundSofti.pojo.wx;

import java.util.HashMap;

/**
 * @Description 微信请求access_token
 * @Author wangguanbo
 * @Date 22:12 2019/7/11
 * @return
 **/
public class WxTokenRequestModel {

    private String grant_type;
    private String appid;
    private String secret;

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public enum WxToken{
        grant_type("client_credential"),
        appid("wxaaf51aafa9ea84f0"),
        secret("85598ee1ad78a68fa58c9f3212b67941")
        ;

        private String value;

        WxToken(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


}
