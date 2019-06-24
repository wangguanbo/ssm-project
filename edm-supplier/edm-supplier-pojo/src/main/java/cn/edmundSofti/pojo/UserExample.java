package cn.edmundSofti.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserUsernameIsNull() {
            addCriterion("user_username is null");
            return (Criteria) this;
        }

        public Criteria andUserUsernameIsNotNull() {
            addCriterion("user_username is not null");
            return (Criteria) this;
        }

        public Criteria andUserUsernameEqualTo(String value) {
            addCriterion("user_username =", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameNotEqualTo(String value) {
            addCriterion("user_username <>", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameGreaterThan(String value) {
            addCriterion("user_username >", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("user_username >=", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameLessThan(String value) {
            addCriterion("user_username <", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameLessThanOrEqualTo(String value) {
            addCriterion("user_username <=", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameLike(String value) {
            addCriterion("user_username like", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameNotLike(String value) {
            addCriterion("user_username not like", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameIn(List<String> values) {
            addCriterion("user_username in", values, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameNotIn(List<String> values) {
            addCriterion("user_username not in", values, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameBetween(String value1, String value2) {
            addCriterion("user_username between", value1, value2, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameNotBetween(String value1, String value2) {
            addCriterion("user_username not between", value1, value2, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserStoreIsNull() {
            addCriterion("user_store is null");
            return (Criteria) this;
        }

        public Criteria andUserStoreIsNotNull() {
            addCriterion("user_store is not null");
            return (Criteria) this;
        }

        public Criteria andUserStoreEqualTo(String value) {
            addCriterion("user_store =", value, "userStore");
            return (Criteria) this;
        }

        public Criteria andUserStoreNotEqualTo(String value) {
            addCriterion("user_store <>", value, "userStore");
            return (Criteria) this;
        }

        public Criteria andUserStoreGreaterThan(String value) {
            addCriterion("user_store >", value, "userStore");
            return (Criteria) this;
        }

        public Criteria andUserStoreGreaterThanOrEqualTo(String value) {
            addCriterion("user_store >=", value, "userStore");
            return (Criteria) this;
        }

        public Criteria andUserStoreLessThan(String value) {
            addCriterion("user_store <", value, "userStore");
            return (Criteria) this;
        }

        public Criteria andUserStoreLessThanOrEqualTo(String value) {
            addCriterion("user_store <=", value, "userStore");
            return (Criteria) this;
        }

        public Criteria andUserStoreLike(String value) {
            addCriterion("user_store like", value, "userStore");
            return (Criteria) this;
        }

        public Criteria andUserStoreNotLike(String value) {
            addCriterion("user_store not like", value, "userStore");
            return (Criteria) this;
        }

        public Criteria andUserStoreIn(List<String> values) {
            addCriterion("user_store in", values, "userStore");
            return (Criteria) this;
        }

        public Criteria andUserStoreNotIn(List<String> values) {
            addCriterion("user_store not in", values, "userStore");
            return (Criteria) this;
        }

        public Criteria andUserStoreBetween(String value1, String value2) {
            addCriterion("user_store between", value1, value2, "userStore");
            return (Criteria) this;
        }

        public Criteria andUserStoreNotBetween(String value1, String value2) {
            addCriterion("user_store not between", value1, value2, "userStore");
            return (Criteria) this;
        }

        public Criteria andUserAppIsfirstIsNull() {
            addCriterion("user_app_isfirst is null");
            return (Criteria) this;
        }

        public Criteria andUserAppIsfirstIsNotNull() {
            addCriterion("user_app_isfirst is not null");
            return (Criteria) this;
        }

        public Criteria andUserAppIsfirstEqualTo(Boolean value) {
            addCriterion("user_app_isfirst =", value, "userAppIsfirst");
            return (Criteria) this;
        }

        public Criteria andUserAppIsfirstNotEqualTo(Boolean value) {
            addCriterion("user_app_isfirst <>", value, "userAppIsfirst");
            return (Criteria) this;
        }

        public Criteria andUserAppIsfirstGreaterThan(Boolean value) {
            addCriterion("user_app_isfirst >", value, "userAppIsfirst");
            return (Criteria) this;
        }

        public Criteria andUserAppIsfirstGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_app_isfirst >=", value, "userAppIsfirst");
            return (Criteria) this;
        }

        public Criteria andUserAppIsfirstLessThan(Boolean value) {
            addCriterion("user_app_isfirst <", value, "userAppIsfirst");
            return (Criteria) this;
        }

        public Criteria andUserAppIsfirstLessThanOrEqualTo(Boolean value) {
            addCriterion("user_app_isfirst <=", value, "userAppIsfirst");
            return (Criteria) this;
        }

        public Criteria andUserAppIsfirstIn(List<Boolean> values) {
            addCriterion("user_app_isfirst in", values, "userAppIsfirst");
            return (Criteria) this;
        }

        public Criteria andUserAppIsfirstNotIn(List<Boolean> values) {
            addCriterion("user_app_isfirst not in", values, "userAppIsfirst");
            return (Criteria) this;
        }

        public Criteria andUserAppIsfirstBetween(Boolean value1, Boolean value2) {
            addCriterion("user_app_isfirst between", value1, value2, "userAppIsfirst");
            return (Criteria) this;
        }

        public Criteria andUserAppIsfirstNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_app_isfirst not between", value1, value2, "userAppIsfirst");
            return (Criteria) this;
        }

        public Criteria andUserAppAuthIsNull() {
            addCriterion("user_app_auth is null");
            return (Criteria) this;
        }

        public Criteria andUserAppAuthIsNotNull() {
            addCriterion("user_app_auth is not null");
            return (Criteria) this;
        }

        public Criteria andUserAppAuthEqualTo(Boolean value) {
            addCriterion("user_app_auth =", value, "userAppAuth");
            return (Criteria) this;
        }

        public Criteria andUserAppAuthNotEqualTo(Boolean value) {
            addCriterion("user_app_auth <>", value, "userAppAuth");
            return (Criteria) this;
        }

        public Criteria andUserAppAuthGreaterThan(Boolean value) {
            addCriterion("user_app_auth >", value, "userAppAuth");
            return (Criteria) this;
        }

        public Criteria andUserAppAuthGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_app_auth >=", value, "userAppAuth");
            return (Criteria) this;
        }

        public Criteria andUserAppAuthLessThan(Boolean value) {
            addCriterion("user_app_auth <", value, "userAppAuth");
            return (Criteria) this;
        }

        public Criteria andUserAppAuthLessThanOrEqualTo(Boolean value) {
            addCriterion("user_app_auth <=", value, "userAppAuth");
            return (Criteria) this;
        }

        public Criteria andUserAppAuthIn(List<Boolean> values) {
            addCriterion("user_app_auth in", values, "userAppAuth");
            return (Criteria) this;
        }

        public Criteria andUserAppAuthNotIn(List<Boolean> values) {
            addCriterion("user_app_auth not in", values, "userAppAuth");
            return (Criteria) this;
        }

        public Criteria andUserAppAuthBetween(Boolean value1, Boolean value2) {
            addCriterion("user_app_auth between", value1, value2, "userAppAuth");
            return (Criteria) this;
        }

        public Criteria andUserAppAuthNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_app_auth not between", value1, value2, "userAppAuth");
            return (Criteria) this;
        }

        public Criteria andUserAppDueDateIsNull() {
            addCriterion("user_app_due_date is null");
            return (Criteria) this;
        }

        public Criteria andUserAppDueDateIsNotNull() {
            addCriterion("user_app_due_date is not null");
            return (Criteria) this;
        }

        public Criteria andUserAppDueDateEqualTo(String value) {
            addCriterion("user_app_due_date =", value, "userAppDueDate");
            return (Criteria) this;
        }

        public Criteria andUserAppDueDateNotEqualTo(String value) {
            addCriterion("user_app_due_date <>", value, "userAppDueDate");
            return (Criteria) this;
        }

        public Criteria andUserAppDueDateGreaterThan(String value) {
            addCriterion("user_app_due_date >", value, "userAppDueDate");
            return (Criteria) this;
        }

        public Criteria andUserAppDueDateGreaterThanOrEqualTo(String value) {
            addCriterion("user_app_due_date >=", value, "userAppDueDate");
            return (Criteria) this;
        }

        public Criteria andUserAppDueDateLessThan(String value) {
            addCriterion("user_app_due_date <", value, "userAppDueDate");
            return (Criteria) this;
        }

        public Criteria andUserAppDueDateLessThanOrEqualTo(String value) {
            addCriterion("user_app_due_date <=", value, "userAppDueDate");
            return (Criteria) this;
        }

        public Criteria andUserAppDueDateLike(String value) {
            addCriterion("user_app_due_date like", value, "userAppDueDate");
            return (Criteria) this;
        }

        public Criteria andUserAppDueDateNotLike(String value) {
            addCriterion("user_app_due_date not like", value, "userAppDueDate");
            return (Criteria) this;
        }

        public Criteria andUserAppDueDateIn(List<String> values) {
            addCriterion("user_app_due_date in", values, "userAppDueDate");
            return (Criteria) this;
        }

        public Criteria andUserAppDueDateNotIn(List<String> values) {
            addCriterion("user_app_due_date not in", values, "userAppDueDate");
            return (Criteria) this;
        }

        public Criteria andUserAppDueDateBetween(String value1, String value2) {
            addCriterion("user_app_due_date between", value1, value2, "userAppDueDate");
            return (Criteria) this;
        }

        public Criteria andUserAppDueDateNotBetween(String value1, String value2) {
            addCriterion("user_app_due_date not between", value1, value2, "userAppDueDate");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIsNull() {
            addCriterion("user_remark is null");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIsNotNull() {
            addCriterion("user_remark is not null");
            return (Criteria) this;
        }

        public Criteria andUserRemarkEqualTo(String value) {
            addCriterion("user_remark =", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotEqualTo(String value) {
            addCriterion("user_remark <>", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkGreaterThan(String value) {
            addCriterion("user_remark >", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("user_remark >=", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkLessThan(String value) {
            addCriterion("user_remark <", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkLessThanOrEqualTo(String value) {
            addCriterion("user_remark <=", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkLike(String value) {
            addCriterion("user_remark like", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotLike(String value) {
            addCriterion("user_remark not like", value, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkIn(List<String> values) {
            addCriterion("user_remark in", values, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotIn(List<String> values) {
            addCriterion("user_remark not in", values, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkBetween(String value1, String value2) {
            addCriterion("user_remark between", value1, value2, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserRemarkNotBetween(String value1, String value2) {
            addCriterion("user_remark not between", value1, value2, "userRemark");
            return (Criteria) this;
        }

        public Criteria andUserDataPermissionIsNull() {
            addCriterion("user_data_permission is null");
            return (Criteria) this;
        }

        public Criteria andUserDataPermissionIsNotNull() {
            addCriterion("user_data_permission is not null");
            return (Criteria) this;
        }

        public Criteria andUserDataPermissionEqualTo(Boolean value) {
            addCriterion("user_data_permission =", value, "userDataPermission");
            return (Criteria) this;
        }

        public Criteria andUserDataPermissionNotEqualTo(Boolean value) {
            addCriterion("user_data_permission <>", value, "userDataPermission");
            return (Criteria) this;
        }

        public Criteria andUserDataPermissionGreaterThan(Boolean value) {
            addCriterion("user_data_permission >", value, "userDataPermission");
            return (Criteria) this;
        }

        public Criteria andUserDataPermissionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_data_permission >=", value, "userDataPermission");
            return (Criteria) this;
        }

        public Criteria andUserDataPermissionLessThan(Boolean value) {
            addCriterion("user_data_permission <", value, "userDataPermission");
            return (Criteria) this;
        }

        public Criteria andUserDataPermissionLessThanOrEqualTo(Boolean value) {
            addCriterion("user_data_permission <=", value, "userDataPermission");
            return (Criteria) this;
        }

        public Criteria andUserDataPermissionIn(List<Boolean> values) {
            addCriterion("user_data_permission in", values, "userDataPermission");
            return (Criteria) this;
        }

        public Criteria andUserDataPermissionNotIn(List<Boolean> values) {
            addCriterion("user_data_permission not in", values, "userDataPermission");
            return (Criteria) this;
        }

        public Criteria andUserDataPermissionBetween(Boolean value1, Boolean value2) {
            addCriterion("user_data_permission between", value1, value2, "userDataPermission");
            return (Criteria) this;
        }

        public Criteria andUserDataPermissionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_data_permission not between", value1, value2, "userDataPermission");
            return (Criteria) this;
        }

        public Criteria andUserLogoIsNull() {
            addCriterion("user_logo is null");
            return (Criteria) this;
        }

        public Criteria andUserLogoIsNotNull() {
            addCriterion("user_logo is not null");
            return (Criteria) this;
        }

        public Criteria andUserLogoEqualTo(String value) {
            addCriterion("user_logo =", value, "userLogo");
            return (Criteria) this;
        }

        public Criteria andUserLogoNotEqualTo(String value) {
            addCriterion("user_logo <>", value, "userLogo");
            return (Criteria) this;
        }

        public Criteria andUserLogoGreaterThan(String value) {
            addCriterion("user_logo >", value, "userLogo");
            return (Criteria) this;
        }

        public Criteria andUserLogoGreaterThanOrEqualTo(String value) {
            addCriterion("user_logo >=", value, "userLogo");
            return (Criteria) this;
        }

        public Criteria andUserLogoLessThan(String value) {
            addCriterion("user_logo <", value, "userLogo");
            return (Criteria) this;
        }

        public Criteria andUserLogoLessThanOrEqualTo(String value) {
            addCriterion("user_logo <=", value, "userLogo");
            return (Criteria) this;
        }

        public Criteria andUserLogoLike(String value) {
            addCriterion("user_logo like", value, "userLogo");
            return (Criteria) this;
        }

        public Criteria andUserLogoNotLike(String value) {
            addCriterion("user_logo not like", value, "userLogo");
            return (Criteria) this;
        }

        public Criteria andUserLogoIn(List<String> values) {
            addCriterion("user_logo in", values, "userLogo");
            return (Criteria) this;
        }

        public Criteria andUserLogoNotIn(List<String> values) {
            addCriterion("user_logo not in", values, "userLogo");
            return (Criteria) this;
        }

        public Criteria andUserLogoBetween(String value1, String value2) {
            addCriterion("user_logo between", value1, value2, "userLogo");
            return (Criteria) this;
        }

        public Criteria andUserLogoNotBetween(String value1, String value2) {
            addCriterion("user_logo not between", value1, value2, "userLogo");
            return (Criteria) this;
        }

        public Criteria andUserDistributionIsNull() {
            addCriterion("user_distribution is null");
            return (Criteria) this;
        }

        public Criteria andUserDistributionIsNotNull() {
            addCriterion("user_distribution is not null");
            return (Criteria) this;
        }

        public Criteria andUserDistributionEqualTo(Integer value) {
            addCriterion("user_distribution =", value, "userDistribution");
            return (Criteria) this;
        }

        public Criteria andUserDistributionNotEqualTo(Integer value) {
            addCriterion("user_distribution <>", value, "userDistribution");
            return (Criteria) this;
        }

        public Criteria andUserDistributionGreaterThan(Integer value) {
            addCriterion("user_distribution >", value, "userDistribution");
            return (Criteria) this;
        }

        public Criteria andUserDistributionGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_distribution >=", value, "userDistribution");
            return (Criteria) this;
        }

        public Criteria andUserDistributionLessThan(Integer value) {
            addCriterion("user_distribution <", value, "userDistribution");
            return (Criteria) this;
        }

        public Criteria andUserDistributionLessThanOrEqualTo(Integer value) {
            addCriterion("user_distribution <=", value, "userDistribution");
            return (Criteria) this;
        }

        public Criteria andUserDistributionIn(List<Integer> values) {
            addCriterion("user_distribution in", values, "userDistribution");
            return (Criteria) this;
        }

        public Criteria andUserDistributionNotIn(List<Integer> values) {
            addCriterion("user_distribution not in", values, "userDistribution");
            return (Criteria) this;
        }

        public Criteria andUserDistributionBetween(Integer value1, Integer value2) {
            addCriterion("user_distribution between", value1, value2, "userDistribution");
            return (Criteria) this;
        }

        public Criteria andUserDistributionNotBetween(Integer value1, Integer value2) {
            addCriterion("user_distribution not between", value1, value2, "userDistribution");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}