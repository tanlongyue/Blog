package com.yiyue.personalblog.entity.user.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserNickNameIsNull() {
            addCriterion("user_Nick_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNickNameIsNotNull() {
            addCriterion("user_Nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNickNameEqualTo(String value) {
            addCriterion("user_Nick_name =", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotEqualTo(String value) {
            addCriterion("user_Nick_name <>", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameGreaterThan(String value) {
            addCriterion("user_Nick_name >", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_Nick_name >=", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLessThan(String value) {
            addCriterion("user_Nick_name <", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLessThanOrEqualTo(String value) {
            addCriterion("user_Nick_name <=", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameLike(String value) {
            addCriterion("user_Nick_name like", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotLike(String value) {
            addCriterion("user_Nick_name not like", value, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameIn(List<String> values) {
            addCriterion("user_Nick_name in", values, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotIn(List<String> values) {
            addCriterion("user_Nick_name not in", values, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameBetween(String value1, String value2) {
            addCriterion("user_Nick_name between", value1, value2, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserNickNameNotBetween(String value1, String value2) {
            addCriterion("user_Nick_name not between", value1, value2, "userNickName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIsNull() {
            addCriterion("user_login_Name is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIsNotNull() {
            addCriterion("user_login_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameEqualTo(String value) {
            addCriterion("user_login_Name =", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotEqualTo(String value) {
            addCriterion("user_login_Name <>", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameGreaterThan(String value) {
            addCriterion("user_login_Name >", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_Name >=", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLessThan(String value) {
            addCriterion("user_login_Name <", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLessThanOrEqualTo(String value) {
            addCriterion("user_login_Name <=", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLike(String value) {
            addCriterion("user_login_Name like", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotLike(String value) {
            addCriterion("user_login_Name not like", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIn(List<String> values) {
            addCriterion("user_login_Name in", values, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotIn(List<String> values) {
            addCriterion("user_login_Name not in", values, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameBetween(String value1, String value2) {
            addCriterion("user_login_Name between", value1, value2, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotBetween(String value1, String value2) {
            addCriterion("user_login_Name not between", value1, value2, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_Password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_Password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_Password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_Password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_Password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_Password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_Password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_Password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_Password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_Password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_Password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_Password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_Password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_Password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_Phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_Phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_Phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_Phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_Phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_Phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_Phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_Phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_Phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_Phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_Phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_Phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_Phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(String value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(String value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(String value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(String value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(String value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(String value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLike(String value) {
            addCriterion("user_sex like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotLike(String value) {
            addCriterion("user_sex not like", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<String> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<String> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(String value1, String value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(String value1, String value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitIsNull() {
            addCriterion("user_Head_Portrait is null");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitIsNotNull() {
            addCriterion("user_Head_Portrait is not null");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitEqualTo(String value) {
            addCriterion("user_Head_Portrait =", value, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitNotEqualTo(String value) {
            addCriterion("user_Head_Portrait <>", value, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitGreaterThan(String value) {
            addCriterion("user_Head_Portrait >", value, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitGreaterThanOrEqualTo(String value) {
            addCriterion("user_Head_Portrait >=", value, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitLessThan(String value) {
            addCriterion("user_Head_Portrait <", value, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitLessThanOrEqualTo(String value) {
            addCriterion("user_Head_Portrait <=", value, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitLike(String value) {
            addCriterion("user_Head_Portrait like", value, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitNotLike(String value) {
            addCriterion("user_Head_Portrait not like", value, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitIn(List<String> values) {
            addCriterion("user_Head_Portrait in", values, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitNotIn(List<String> values) {
            addCriterion("user_Head_Portrait not in", values, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitBetween(String value1, String value2) {
            addCriterion("user_Head_Portrait between", value1, value2, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadPortraitNotBetween(String value1, String value2) {
            addCriterion("user_Head_Portrait not between", value1, value2, "userHeadPortrait");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdIsNull() {
            addCriterion("user_role_id is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdIsNotNull() {
            addCriterion("user_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdEqualTo(String value) {
            addCriterion("user_role_id =", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdNotEqualTo(String value) {
            addCriterion("user_role_id <>", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdGreaterThan(String value) {
            addCriterion("user_role_id >", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_role_id >=", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdLessThan(String value) {
            addCriterion("user_role_id <", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdLessThanOrEqualTo(String value) {
            addCriterion("user_role_id <=", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdLike(String value) {
            addCriterion("user_role_id like", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdNotLike(String value) {
            addCriterion("user_role_id not like", value, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdIn(List<String> values) {
            addCriterion("user_role_id in", values, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdNotIn(List<String> values) {
            addCriterion("user_role_id not in", values, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdBetween(String value1, String value2) {
            addCriterion("user_role_id between", value1, value2, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andUserRoleIdNotBetween(String value1, String value2) {
            addCriterion("user_role_id not between", value1, value2, "userRoleId");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("createBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("createBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(Long value) {
            addCriterion("createBy =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(Long value) {
            addCriterion("createBy <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(Long value) {
            addCriterion("createBy >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(Long value) {
            addCriterion("createBy >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(Long value) {
            addCriterion("createBy <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(Long value) {
            addCriterion("createBy <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<Long> values) {
            addCriterion("createBy in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<Long> values) {
            addCriterion("createBy not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(Long value1, Long value2) {
            addCriterion("createBy between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(Long value1, Long value2) {
            addCriterion("createBy not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andModifybyIsNull() {
            addCriterion("modifyBy is null");
            return (Criteria) this;
        }

        public Criteria andModifybyIsNotNull() {
            addCriterion("modifyBy is not null");
            return (Criteria) this;
        }

        public Criteria andModifybyEqualTo(Long value) {
            addCriterion("modifyBy =", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotEqualTo(Long value) {
            addCriterion("modifyBy <>", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyGreaterThan(Long value) {
            addCriterion("modifyBy >", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyGreaterThanOrEqualTo(Long value) {
            addCriterion("modifyBy >=", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyLessThan(Long value) {
            addCriterion("modifyBy <", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyLessThanOrEqualTo(Long value) {
            addCriterion("modifyBy <=", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyIn(List<Long> values) {
            addCriterion("modifyBy in", values, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotIn(List<Long> values) {
            addCriterion("modifyBy not in", values, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyBetween(Long value1, Long value2) {
            addCriterion("modifyBy between", value1, value2, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotBetween(Long value1, Long value2) {
            addCriterion("modifyBy not between", value1, value2, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("modifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("modifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("modifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("modifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("modifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("modifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("modifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("modifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("modifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("modifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("modifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("modifyDate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andSpareoneIsNull() {
            addCriterion("spareOne is null");
            return (Criteria) this;
        }

        public Criteria andSpareoneIsNotNull() {
            addCriterion("spareOne is not null");
            return (Criteria) this;
        }

        public Criteria andSpareoneEqualTo(String value) {
            addCriterion("spareOne =", value, "spareone");
            return (Criteria) this;
        }

        public Criteria andSpareoneNotEqualTo(String value) {
            addCriterion("spareOne <>", value, "spareone");
            return (Criteria) this;
        }

        public Criteria andSpareoneGreaterThan(String value) {
            addCriterion("spareOne >", value, "spareone");
            return (Criteria) this;
        }

        public Criteria andSpareoneGreaterThanOrEqualTo(String value) {
            addCriterion("spareOne >=", value, "spareone");
            return (Criteria) this;
        }

        public Criteria andSpareoneLessThan(String value) {
            addCriterion("spareOne <", value, "spareone");
            return (Criteria) this;
        }

        public Criteria andSpareoneLessThanOrEqualTo(String value) {
            addCriterion("spareOne <=", value, "spareone");
            return (Criteria) this;
        }

        public Criteria andSpareoneLike(String value) {
            addCriterion("spareOne like", value, "spareone");
            return (Criteria) this;
        }

        public Criteria andSpareoneNotLike(String value) {
            addCriterion("spareOne not like", value, "spareone");
            return (Criteria) this;
        }

        public Criteria andSpareoneIn(List<String> values) {
            addCriterion("spareOne in", values, "spareone");
            return (Criteria) this;
        }

        public Criteria andSpareoneNotIn(List<String> values) {
            addCriterion("spareOne not in", values, "spareone");
            return (Criteria) this;
        }

        public Criteria andSpareoneBetween(String value1, String value2) {
            addCriterion("spareOne between", value1, value2, "spareone");
            return (Criteria) this;
        }

        public Criteria andSpareoneNotBetween(String value1, String value2) {
            addCriterion("spareOne not between", value1, value2, "spareone");
            return (Criteria) this;
        }

        public Criteria andSparetwoIsNull() {
            addCriterion("spareTwo is null");
            return (Criteria) this;
        }

        public Criteria andSparetwoIsNotNull() {
            addCriterion("spareTwo is not null");
            return (Criteria) this;
        }

        public Criteria andSparetwoEqualTo(String value) {
            addCriterion("spareTwo =", value, "sparetwo");
            return (Criteria) this;
        }

        public Criteria andSparetwoNotEqualTo(String value) {
            addCriterion("spareTwo <>", value, "sparetwo");
            return (Criteria) this;
        }

        public Criteria andSparetwoGreaterThan(String value) {
            addCriterion("spareTwo >", value, "sparetwo");
            return (Criteria) this;
        }

        public Criteria andSparetwoGreaterThanOrEqualTo(String value) {
            addCriterion("spareTwo >=", value, "sparetwo");
            return (Criteria) this;
        }

        public Criteria andSparetwoLessThan(String value) {
            addCriterion("spareTwo <", value, "sparetwo");
            return (Criteria) this;
        }

        public Criteria andSparetwoLessThanOrEqualTo(String value) {
            addCriterion("spareTwo <=", value, "sparetwo");
            return (Criteria) this;
        }

        public Criteria andSparetwoLike(String value) {
            addCriterion("spareTwo like", value, "sparetwo");
            return (Criteria) this;
        }

        public Criteria andSparetwoNotLike(String value) {
            addCriterion("spareTwo not like", value, "sparetwo");
            return (Criteria) this;
        }

        public Criteria andSparetwoIn(List<String> values) {
            addCriterion("spareTwo in", values, "sparetwo");
            return (Criteria) this;
        }

        public Criteria andSparetwoNotIn(List<String> values) {
            addCriterion("spareTwo not in", values, "sparetwo");
            return (Criteria) this;
        }

        public Criteria andSparetwoBetween(String value1, String value2) {
            addCriterion("spareTwo between", value1, value2, "sparetwo");
            return (Criteria) this;
        }

        public Criteria andSparetwoNotBetween(String value1, String value2) {
            addCriterion("spareTwo not between", value1, value2, "sparetwo");
            return (Criteria) this;
        }

        public Criteria andSparethreeIsNull() {
            addCriterion("spareThree is null");
            return (Criteria) this;
        }

        public Criteria andSparethreeIsNotNull() {
            addCriterion("spareThree is not null");
            return (Criteria) this;
        }

        public Criteria andSparethreeEqualTo(String value) {
            addCriterion("spareThree =", value, "sparethree");
            return (Criteria) this;
        }

        public Criteria andSparethreeNotEqualTo(String value) {
            addCriterion("spareThree <>", value, "sparethree");
            return (Criteria) this;
        }

        public Criteria andSparethreeGreaterThan(String value) {
            addCriterion("spareThree >", value, "sparethree");
            return (Criteria) this;
        }

        public Criteria andSparethreeGreaterThanOrEqualTo(String value) {
            addCriterion("spareThree >=", value, "sparethree");
            return (Criteria) this;
        }

        public Criteria andSparethreeLessThan(String value) {
            addCriterion("spareThree <", value, "sparethree");
            return (Criteria) this;
        }

        public Criteria andSparethreeLessThanOrEqualTo(String value) {
            addCriterion("spareThree <=", value, "sparethree");
            return (Criteria) this;
        }

        public Criteria andSparethreeLike(String value) {
            addCriterion("spareThree like", value, "sparethree");
            return (Criteria) this;
        }

        public Criteria andSparethreeNotLike(String value) {
            addCriterion("spareThree not like", value, "sparethree");
            return (Criteria) this;
        }

        public Criteria andSparethreeIn(List<String> values) {
            addCriterion("spareThree in", values, "sparethree");
            return (Criteria) this;
        }

        public Criteria andSparethreeNotIn(List<String> values) {
            addCriterion("spareThree not in", values, "sparethree");
            return (Criteria) this;
        }

        public Criteria andSparethreeBetween(String value1, String value2) {
            addCriterion("spareThree between", value1, value2, "sparethree");
            return (Criteria) this;
        }

        public Criteria andSparethreeNotBetween(String value1, String value2) {
            addCriterion("spareThree not between", value1, value2, "sparethree");
            return (Criteria) this;
        }

        public Criteria andSparefourIsNull() {
            addCriterion("spareFour is null");
            return (Criteria) this;
        }

        public Criteria andSparefourIsNotNull() {
            addCriterion("spareFour is not null");
            return (Criteria) this;
        }

        public Criteria andSparefourEqualTo(String value) {
            addCriterion("spareFour =", value, "sparefour");
            return (Criteria) this;
        }

        public Criteria andSparefourNotEqualTo(String value) {
            addCriterion("spareFour <>", value, "sparefour");
            return (Criteria) this;
        }

        public Criteria andSparefourGreaterThan(String value) {
            addCriterion("spareFour >", value, "sparefour");
            return (Criteria) this;
        }

        public Criteria andSparefourGreaterThanOrEqualTo(String value) {
            addCriterion("spareFour >=", value, "sparefour");
            return (Criteria) this;
        }

        public Criteria andSparefourLessThan(String value) {
            addCriterion("spareFour <", value, "sparefour");
            return (Criteria) this;
        }

        public Criteria andSparefourLessThanOrEqualTo(String value) {
            addCriterion("spareFour <=", value, "sparefour");
            return (Criteria) this;
        }

        public Criteria andSparefourLike(String value) {
            addCriterion("spareFour like", value, "sparefour");
            return (Criteria) this;
        }

        public Criteria andSparefourNotLike(String value) {
            addCriterion("spareFour not like", value, "sparefour");
            return (Criteria) this;
        }

        public Criteria andSparefourIn(List<String> values) {
            addCriterion("spareFour in", values, "sparefour");
            return (Criteria) this;
        }

        public Criteria andSparefourNotIn(List<String> values) {
            addCriterion("spareFour not in", values, "sparefour");
            return (Criteria) this;
        }

        public Criteria andSparefourBetween(String value1, String value2) {
            addCriterion("spareFour between", value1, value2, "sparefour");
            return (Criteria) this;
        }

        public Criteria andSparefourNotBetween(String value1, String value2) {
            addCriterion("spareFour not between", value1, value2, "sparefour");
            return (Criteria) this;
        }
    }

    /**
     */
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