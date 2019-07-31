package cn.edmundSofti.pojo.wx;

/**
 * 微信token--伪单例
 * @Description
 * @Author wangguanbo
 * @Date 9:47 2019/7/12
 * @return
 **/
public class WxToken {

    private WxToken() {
    }

    private String access_token;

    /**
     * wxToken对象
     */
    private static volatile WxToken wxToken;

    /**
     * 初始化线程Thread
     */
    private static Thread thread;

    public static synchronized WxToken getInstance() throws Exception {
        if(null == wxToken){
            throw new Exception("程序初始化未获得token");
        }
        return wxToken;
    }

    public static void initTokenValue(String access_token, Thread sytemThread){
        if (thread == sytemThread) {
            wxToken = new WxToken();
            wxToken.setAccess_token(access_token);
        }
    }

    public static void initThread(Thread sytemThread){
        thread = sytemThread;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}
