package cn.edmundSofti.pojo;

public class User {
    private Integer userId;

    private String userPhone;

    private String userUsername;

    private String userPassword;

    private String userName;

    private String userStore;

    private Boolean userAppIsfirst;

    private Boolean userAppAuth;

    private String userAppDueDate;

    private String userRemark;

    private Boolean userDataPermission;

    private String userLogo;

    private Integer userDistribution;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername == null ? null : userUsername.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserStore() {
        return userStore;
    }

    public void setUserStore(String userStore) {
        this.userStore = userStore == null ? null : userStore.trim();
    }

    public Boolean getUserAppIsfirst() {
        return userAppIsfirst;
    }

    public void setUserAppIsfirst(Boolean userAppIsfirst) {
        this.userAppIsfirst = userAppIsfirst;
    }

    public Boolean getUserAppAuth() {
        return userAppAuth;
    }

    public void setUserAppAuth(Boolean userAppAuth) {
        this.userAppAuth = userAppAuth;
    }

    public String getUserAppDueDate() {
        return userAppDueDate;
    }

    public void setUserAppDueDate(String userAppDueDate) {
        this.userAppDueDate = userAppDueDate == null ? null : userAppDueDate.trim();
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark == null ? null : userRemark.trim();
    }

    public Boolean getUserDataPermission() {
        return userDataPermission;
    }

    public void setUserDataPermission(Boolean userDataPermission) {
        this.userDataPermission = userDataPermission;
    }

    public String getUserLogo() {
        return userLogo;
    }

    public void setUserLogo(String userLogo) {
        this.userLogo = userLogo == null ? null : userLogo.trim();
    }

    public Integer getUserDistribution() {
        return userDistribution;
    }

    public void setUserDistribution(Integer userDistribution) {
        this.userDistribution = userDistribution;
    }
}