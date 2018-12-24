package com.example.user.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPermissionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    public UserPermissionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
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

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNull() {
            addCriterion("function is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIsNotNull() {
            addCriterion("function is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionEqualTo(String value) {
            addCriterion("function =", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotEqualTo(String value) {
            addCriterion("function <>", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThan(String value) {
            addCriterion("function >", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("function >=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThan(String value) {
            addCriterion("function <", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLessThanOrEqualTo(String value) {
            addCriterion("function <=", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionLike(String value) {
            addCriterion("function like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotLike(String value) {
            addCriterion("function not like", value, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionIn(List<String> values) {
            addCriterion("function in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotIn(List<String> values) {
            addCriterion("function not in", values, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionBetween(String value1, String value2) {
            addCriterion("function between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andFunctionNotBetween(String value1, String value2) {
            addCriterion("function not between", value1, value2, "function");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(String value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(String value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(String value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(String value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(String value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLike(String value) {
            addCriterion("service_id like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotLike(String value) {
            addCriterion("service_id not like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<String> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<String> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(String value1, String value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(String value1, String value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andVisibleFunctionIsNull() {
            addCriterion("visible_function is null");
            return (Criteria) this;
        }

        public Criteria andVisibleFunctionIsNotNull() {
            addCriterion("visible_function is not null");
            return (Criteria) this;
        }

        public Criteria andVisibleFunctionEqualTo(Boolean value) {
            addCriterion("visible_function =", value, "visibleFunction");
            return (Criteria) this;
        }

        public Criteria andVisibleFunctionNotEqualTo(Boolean value) {
            addCriterion("visible_function <>", value, "visibleFunction");
            return (Criteria) this;
        }

        public Criteria andVisibleFunctionGreaterThan(Boolean value) {
            addCriterion("visible_function >", value, "visibleFunction");
            return (Criteria) this;
        }

        public Criteria andVisibleFunctionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("visible_function >=", value, "visibleFunction");
            return (Criteria) this;
        }

        public Criteria andVisibleFunctionLessThan(Boolean value) {
            addCriterion("visible_function <", value, "visibleFunction");
            return (Criteria) this;
        }

        public Criteria andVisibleFunctionLessThanOrEqualTo(Boolean value) {
            addCriterion("visible_function <=", value, "visibleFunction");
            return (Criteria) this;
        }

        public Criteria andVisibleFunctionIn(List<Boolean> values) {
            addCriterion("visible_function in", values, "visibleFunction");
            return (Criteria) this;
        }

        public Criteria andVisibleFunctionNotIn(List<Boolean> values) {
            addCriterion("visible_function not in", values, "visibleFunction");
            return (Criteria) this;
        }

        public Criteria andVisibleFunctionBetween(Boolean value1, Boolean value2) {
            addCriterion("visible_function between", value1, value2, "visibleFunction");
            return (Criteria) this;
        }

        public Criteria andVisibleFunctionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("visible_function not between", value1, value2, "visibleFunction");
            return (Criteria) this;
        }

        public Criteria andAddFunctionIsNull() {
            addCriterion("add_function is null");
            return (Criteria) this;
        }

        public Criteria andAddFunctionIsNotNull() {
            addCriterion("add_function is not null");
            return (Criteria) this;
        }

        public Criteria andAddFunctionEqualTo(Boolean value) {
            addCriterion("add_function =", value, "addFunction");
            return (Criteria) this;
        }

        public Criteria andAddFunctionNotEqualTo(Boolean value) {
            addCriterion("add_function <>", value, "addFunction");
            return (Criteria) this;
        }

        public Criteria andAddFunctionGreaterThan(Boolean value) {
            addCriterion("add_function >", value, "addFunction");
            return (Criteria) this;
        }

        public Criteria andAddFunctionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("add_function >=", value, "addFunction");
            return (Criteria) this;
        }

        public Criteria andAddFunctionLessThan(Boolean value) {
            addCriterion("add_function <", value, "addFunction");
            return (Criteria) this;
        }

        public Criteria andAddFunctionLessThanOrEqualTo(Boolean value) {
            addCriterion("add_function <=", value, "addFunction");
            return (Criteria) this;
        }

        public Criteria andAddFunctionIn(List<Boolean> values) {
            addCriterion("add_function in", values, "addFunction");
            return (Criteria) this;
        }

        public Criteria andAddFunctionNotIn(List<Boolean> values) {
            addCriterion("add_function not in", values, "addFunction");
            return (Criteria) this;
        }

        public Criteria andAddFunctionBetween(Boolean value1, Boolean value2) {
            addCriterion("add_function between", value1, value2, "addFunction");
            return (Criteria) this;
        }

        public Criteria andAddFunctionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("add_function not between", value1, value2, "addFunction");
            return (Criteria) this;
        }

        public Criteria andUpdateFunctionIsNull() {
            addCriterion("update_function is null");
            return (Criteria) this;
        }

        public Criteria andUpdateFunctionIsNotNull() {
            addCriterion("update_function is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateFunctionEqualTo(Boolean value) {
            addCriterion("update_function =", value, "updateFunction");
            return (Criteria) this;
        }

        public Criteria andUpdateFunctionNotEqualTo(Boolean value) {
            addCriterion("update_function <>", value, "updateFunction");
            return (Criteria) this;
        }

        public Criteria andUpdateFunctionGreaterThan(Boolean value) {
            addCriterion("update_function >", value, "updateFunction");
            return (Criteria) this;
        }

        public Criteria andUpdateFunctionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("update_function >=", value, "updateFunction");
            return (Criteria) this;
        }

        public Criteria andUpdateFunctionLessThan(Boolean value) {
            addCriterion("update_function <", value, "updateFunction");
            return (Criteria) this;
        }

        public Criteria andUpdateFunctionLessThanOrEqualTo(Boolean value) {
            addCriterion("update_function <=", value, "updateFunction");
            return (Criteria) this;
        }

        public Criteria andUpdateFunctionIn(List<Boolean> values) {
            addCriterion("update_function in", values, "updateFunction");
            return (Criteria) this;
        }

        public Criteria andUpdateFunctionNotIn(List<Boolean> values) {
            addCriterion("update_function not in", values, "updateFunction");
            return (Criteria) this;
        }

        public Criteria andUpdateFunctionBetween(Boolean value1, Boolean value2) {
            addCriterion("update_function between", value1, value2, "updateFunction");
            return (Criteria) this;
        }

        public Criteria andUpdateFunctionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("update_function not between", value1, value2, "updateFunction");
            return (Criteria) this;
        }

        public Criteria andDeleteFunctionIsNull() {
            addCriterion("delete_function is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFunctionIsNotNull() {
            addCriterion("delete_function is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFunctionEqualTo(Boolean value) {
            addCriterion("delete_function =", value, "deleteFunction");
            return (Criteria) this;
        }

        public Criteria andDeleteFunctionNotEqualTo(Boolean value) {
            addCriterion("delete_function <>", value, "deleteFunction");
            return (Criteria) this;
        }

        public Criteria andDeleteFunctionGreaterThan(Boolean value) {
            addCriterion("delete_function >", value, "deleteFunction");
            return (Criteria) this;
        }

        public Criteria andDeleteFunctionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delete_function >=", value, "deleteFunction");
            return (Criteria) this;
        }

        public Criteria andDeleteFunctionLessThan(Boolean value) {
            addCriterion("delete_function <", value, "deleteFunction");
            return (Criteria) this;
        }

        public Criteria andDeleteFunctionLessThanOrEqualTo(Boolean value) {
            addCriterion("delete_function <=", value, "deleteFunction");
            return (Criteria) this;
        }

        public Criteria andDeleteFunctionIn(List<Boolean> values) {
            addCriterion("delete_function in", values, "deleteFunction");
            return (Criteria) this;
        }

        public Criteria andDeleteFunctionNotIn(List<Boolean> values) {
            addCriterion("delete_function not in", values, "deleteFunction");
            return (Criteria) this;
        }

        public Criteria andDeleteFunctionBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_function between", value1, value2, "deleteFunction");
            return (Criteria) this;
        }

        public Criteria andDeleteFunctionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_function not between", value1, value2, "deleteFunction");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNull() {
            addCriterion("utime is null");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNotNull() {
            addCriterion("utime is not null");
            return (Criteria) this;
        }

        public Criteria andUtimeEqualTo(Date value) {
            addCriterion("utime =", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotEqualTo(Date value) {
            addCriterion("utime <>", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThan(Date value) {
            addCriterion("utime >", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("utime >=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThan(Date value) {
            addCriterion("utime <", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThanOrEqualTo(Date value) {
            addCriterion("utime <=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeIn(List<Date> values) {
            addCriterion("utime in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotIn(List<Date> values) {
            addCriterion("utime not in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeBetween(Date value1, Date value2) {
            addCriterion("utime between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotBetween(Date value1, Date value2) {
            addCriterion("utime not between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_permission
     *
     * @mbggenerated do_not_delete_during_merge Mon Aug 13 13:12:31 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_permission
     *
     * @mbggenerated Mon Aug 13 13:12:31 CST 2018
     */
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