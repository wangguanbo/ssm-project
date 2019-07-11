package cn.edmundSofti.pojo.wx;

/**
 * @Description 微信accesstoken凭证
 * @Author wangguanbo
 * @Date 21:51 2019/7/11
 * @return
 **/
public class AccessToken {


    private String tokenName;

    private int expireSecond;

    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    public int getExpireSecond() {
        return expireSecond;
    }

    public void setExpireSecond(int expireSecond) {
        this.expireSecond = expireSecond;
    }

    @Override
    public String toString() {
        return "AccessToken{" +
                "tokenName='" + tokenName + '\'' +
                ", expireSecond=" + expireSecond +
                '}';
    }
}
