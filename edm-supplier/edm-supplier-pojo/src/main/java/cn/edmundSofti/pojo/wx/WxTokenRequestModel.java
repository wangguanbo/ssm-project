package cn.edmundSofti.pojo.wx;

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
        return this.grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = "client_credential";
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

}
