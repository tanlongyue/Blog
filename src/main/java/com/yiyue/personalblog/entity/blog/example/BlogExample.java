package com.yiyue.personalblog.entity.blog.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
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

        public Criteria andBlogidIsNull() {
            addCriterion("blogId is null");
            return (Criteria) this;
        }

        public Criteria andBlogidIsNotNull() {
            addCriterion("blogId is not null");
            return (Criteria) this;
        }

        public Criteria andBlogidEqualTo(Integer value) {
            addCriterion("blogId =", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidNotEqualTo(Integer value) {
            addCriterion("blogId <>", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidGreaterThan(Integer value) {
            addCriterion("blogId >", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("blogId >=", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidLessThan(Integer value) {
            addCriterion("blogId <", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidLessThanOrEqualTo(Integer value) {
            addCriterion("blogId <=", value, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidIn(List<Integer> values) {
            addCriterion("blogId in", values, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidNotIn(List<Integer> values) {
            addCriterion("blogId not in", values, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidBetween(Integer value1, Integer value2) {
            addCriterion("blogId between", value1, value2, "blogid");
            return (Criteria) this;
        }

        public Criteria andBlogidNotBetween(Integer value1, Integer value2) {
            addCriterion("blogId not between", value1, value2, "blogid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andFirstpictureIsNull() {
            addCriterion("firstPicture is null");
            return (Criteria) this;
        }

        public Criteria andFirstpictureIsNotNull() {
            addCriterion("firstPicture is not null");
            return (Criteria) this;
        }

        public Criteria andFirstpictureEqualTo(String value) {
            addCriterion("firstPicture =", value, "firstpicture");
            return (Criteria) this;
        }

        public Criteria andFirstpictureNotEqualTo(String value) {
            addCriterion("firstPicture <>", value, "firstpicture");
            return (Criteria) this;
        }

        public Criteria andFirstpictureGreaterThan(String value) {
            addCriterion("firstPicture >", value, "firstpicture");
            return (Criteria) this;
        }

        public Criteria andFirstpictureGreaterThanOrEqualTo(String value) {
            addCriterion("firstPicture >=", value, "firstpicture");
            return (Criteria) this;
        }

        public Criteria andFirstpictureLessThan(String value) {
            addCriterion("firstPicture <", value, "firstpicture");
            return (Criteria) this;
        }

        public Criteria andFirstpictureLessThanOrEqualTo(String value) {
            addCriterion("firstPicture <=", value, "firstpicture");
            return (Criteria) this;
        }

        public Criteria andFirstpictureLike(String value) {
            addCriterion("firstPicture like", value, "firstpicture");
            return (Criteria) this;
        }

        public Criteria andFirstpictureNotLike(String value) {
            addCriterion("firstPicture not like", value, "firstpicture");
            return (Criteria) this;
        }

        public Criteria andFirstpictureIn(List<String> values) {
            addCriterion("firstPicture in", values, "firstpicture");
            return (Criteria) this;
        }

        public Criteria andFirstpictureNotIn(List<String> values) {
            addCriterion("firstPicture not in", values, "firstpicture");
            return (Criteria) this;
        }

        public Criteria andFirstpictureBetween(String value1, String value2) {
            addCriterion("firstPicture between", value1, value2, "firstpicture");
            return (Criteria) this;
        }

        public Criteria andFirstpictureNotBetween(String value1, String value2) {
            addCriterion("firstPicture not between", value1, value2, "firstpicture");
            return (Criteria) this;
        }

        public Criteria andTabIsNull() {
            addCriterion("tab is null");
            return (Criteria) this;
        }

        public Criteria andTabIsNotNull() {
            addCriterion("tab is not null");
            return (Criteria) this;
        }

        public Criteria andTabEqualTo(String value) {
            addCriterion("tab =", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabNotEqualTo(String value) {
            addCriterion("tab <>", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabGreaterThan(String value) {
            addCriterion("tab >", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabGreaterThanOrEqualTo(String value) {
            addCriterion("tab >=", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabLessThan(String value) {
            addCriterion("tab <", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabLessThanOrEqualTo(String value) {
            addCriterion("tab <=", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabLike(String value) {
            addCriterion("tab like", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabNotLike(String value) {
            addCriterion("tab not like", value, "tab");
            return (Criteria) this;
        }

        public Criteria andTabIn(List<String> values) {
            addCriterion("tab in", values, "tab");
            return (Criteria) this;
        }

        public Criteria andTabNotIn(List<String> values) {
            addCriterion("tab not in", values, "tab");
            return (Criteria) this;
        }

        public Criteria andTabBetween(String value1, String value2) {
            addCriterion("tab between", value1, value2, "tab");
            return (Criteria) this;
        }

        public Criteria andTabNotBetween(String value1, String value2) {
            addCriterion("tab not between", value1, value2, "tab");
            return (Criteria) this;
        }

        public Criteria andViewsIsNull() {
            addCriterion("views is null");
            return (Criteria) this;
        }

        public Criteria andViewsIsNotNull() {
            addCriterion("views is not null");
            return (Criteria) this;
        }

        public Criteria andViewsEqualTo(Integer value) {
            addCriterion("views =", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotEqualTo(Integer value) {
            addCriterion("views <>", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThan(Integer value) {
            addCriterion("views >", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("views >=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThan(Integer value) {
            addCriterion("views <", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThanOrEqualTo(Integer value) {
            addCriterion("views <=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsIn(List<Integer> values) {
            addCriterion("views in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotIn(List<Integer> values) {
            addCriterion("views not in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsBetween(Integer value1, Integer value2) {
            addCriterion("views between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotBetween(Integer value1, Integer value2) {
            addCriterion("views not between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andCommentcountIsNull() {
            addCriterion("commentCount is null");
            return (Criteria) this;
        }

        public Criteria andCommentcountIsNotNull() {
            addCriterion("commentCount is not null");
            return (Criteria) this;
        }

        public Criteria andCommentcountEqualTo(Integer value) {
            addCriterion("commentCount =", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotEqualTo(Integer value) {
            addCriterion("commentCount <>", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountGreaterThan(Integer value) {
            addCriterion("commentCount >", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentCount >=", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountLessThan(Integer value) {
            addCriterion("commentCount <", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountLessThanOrEqualTo(Integer value) {
            addCriterion("commentCount <=", value, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountIn(List<Integer> values) {
            addCriterion("commentCount in", values, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotIn(List<Integer> values) {
            addCriterion("commentCount not in", values, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountBetween(Integer value1, Integer value2) {
            addCriterion("commentCount between", value1, value2, "commentcount");
            return (Criteria) this;
        }

        public Criteria andCommentcountNotBetween(Integer value1, Integer value2) {
            addCriterion("commentCount not between", value1, value2, "commentcount");
            return (Criteria) this;
        }

        public Criteria andAppreciationIsNull() {
            addCriterion("appreCiation is null");
            return (Criteria) this;
        }

        public Criteria andAppreciationIsNotNull() {
            addCriterion("appreCiation is not null");
            return (Criteria) this;
        }

        public Criteria andAppreciationEqualTo(String value) {
            addCriterion("appreCiation =", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationNotEqualTo(String value) {
            addCriterion("appreCiation <>", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationGreaterThan(String value) {
            addCriterion("appreCiation >", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationGreaterThanOrEqualTo(String value) {
            addCriterion("appreCiation >=", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationLessThan(String value) {
            addCriterion("appreCiation <", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationLessThanOrEqualTo(String value) {
            addCriterion("appreCiation <=", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationLike(String value) {
            addCriterion("appreCiation like", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationNotLike(String value) {
            addCriterion("appreCiation not like", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationIn(List<String> values) {
            addCriterion("appreCiation in", values, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationNotIn(List<String> values) {
            addCriterion("appreCiation not in", values, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationBetween(String value1, String value2) {
            addCriterion("appreCiation between", value1, value2, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationNotBetween(String value1, String value2) {
            addCriterion("appreCiation not between", value1, value2, "appreciation");
            return (Criteria) this;
        }

        public Criteria andSharestatementIsNull() {
            addCriterion("shareStatement is null");
            return (Criteria) this;
        }

        public Criteria andSharestatementIsNotNull() {
            addCriterion("shareStatement is not null");
            return (Criteria) this;
        }

        public Criteria andSharestatementEqualTo(String value) {
            addCriterion("shareStatement =", value, "sharestatement");
            return (Criteria) this;
        }

        public Criteria andSharestatementNotEqualTo(String value) {
            addCriterion("shareStatement <>", value, "sharestatement");
            return (Criteria) this;
        }

        public Criteria andSharestatementGreaterThan(String value) {
            addCriterion("shareStatement >", value, "sharestatement");
            return (Criteria) this;
        }

        public Criteria andSharestatementGreaterThanOrEqualTo(String value) {
            addCriterion("shareStatement >=", value, "sharestatement");
            return (Criteria) this;
        }

        public Criteria andSharestatementLessThan(String value) {
            addCriterion("shareStatement <", value, "sharestatement");
            return (Criteria) this;
        }

        public Criteria andSharestatementLessThanOrEqualTo(String value) {
            addCriterion("shareStatement <=", value, "sharestatement");
            return (Criteria) this;
        }

        public Criteria andSharestatementLike(String value) {
            addCriterion("shareStatement like", value, "sharestatement");
            return (Criteria) this;
        }

        public Criteria andSharestatementNotLike(String value) {
            addCriterion("shareStatement not like", value, "sharestatement");
            return (Criteria) this;
        }

        public Criteria andSharestatementIn(List<String> values) {
            addCriterion("shareStatement in", values, "sharestatement");
            return (Criteria) this;
        }

        public Criteria andSharestatementNotIn(List<String> values) {
            addCriterion("shareStatement not in", values, "sharestatement");
            return (Criteria) this;
        }

        public Criteria andSharestatementBetween(String value1, String value2) {
            addCriterion("shareStatement between", value1, value2, "sharestatement");
            return (Criteria) this;
        }

        public Criteria andSharestatementNotBetween(String value1, String value2) {
            addCriterion("shareStatement not between", value1, value2, "sharestatement");
            return (Criteria) this;
        }

        public Criteria andCommentbledIsNull() {
            addCriterion("commentBled is null");
            return (Criteria) this;
        }

        public Criteria andCommentbledIsNotNull() {
            addCriterion("commentBled is not null");
            return (Criteria) this;
        }

        public Criteria andCommentbledEqualTo(String value) {
            addCriterion("commentBled =", value, "commentbled");
            return (Criteria) this;
        }

        public Criteria andCommentbledNotEqualTo(String value) {
            addCriterion("commentBled <>", value, "commentbled");
            return (Criteria) this;
        }

        public Criteria andCommentbledGreaterThan(String value) {
            addCriterion("commentBled >", value, "commentbled");
            return (Criteria) this;
        }

        public Criteria andCommentbledGreaterThanOrEqualTo(String value) {
            addCriterion("commentBled >=", value, "commentbled");
            return (Criteria) this;
        }

        public Criteria andCommentbledLessThan(String value) {
            addCriterion("commentBled <", value, "commentbled");
            return (Criteria) this;
        }

        public Criteria andCommentbledLessThanOrEqualTo(String value) {
            addCriterion("commentBled <=", value, "commentbled");
            return (Criteria) this;
        }

        public Criteria andCommentbledLike(String value) {
            addCriterion("commentBled like", value, "commentbled");
            return (Criteria) this;
        }

        public Criteria andCommentbledNotLike(String value) {
            addCriterion("commentBled not like", value, "commentbled");
            return (Criteria) this;
        }

        public Criteria andCommentbledIn(List<String> values) {
            addCriterion("commentBled in", values, "commentbled");
            return (Criteria) this;
        }

        public Criteria andCommentbledNotIn(List<String> values) {
            addCriterion("commentBled not in", values, "commentbled");
            return (Criteria) this;
        }

        public Criteria andCommentbledBetween(String value1, String value2) {
            addCriterion("commentBled between", value1, value2, "commentbled");
            return (Criteria) this;
        }

        public Criteria andCommentbledNotBetween(String value1, String value2) {
            addCriterion("commentBled not between", value1, value2, "commentbled");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNull() {
            addCriterion("published is null");
            return (Criteria) this;
        }

        public Criteria andPublishedIsNotNull() {
            addCriterion("published is not null");
            return (Criteria) this;
        }

        public Criteria andPublishedEqualTo(String value) {
            addCriterion("published =", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotEqualTo(String value) {
            addCriterion("published <>", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThan(String value) {
            addCriterion("published >", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedGreaterThanOrEqualTo(String value) {
            addCriterion("published >=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThan(String value) {
            addCriterion("published <", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLessThanOrEqualTo(String value) {
            addCriterion("published <=", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedLike(String value) {
            addCriterion("published like", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotLike(String value) {
            addCriterion("published not like", value, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedIn(List<String> values) {
            addCriterion("published in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotIn(List<String> values) {
            addCriterion("published not in", values, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedBetween(String value1, String value2) {
            addCriterion("published between", value1, value2, "published");
            return (Criteria) this;
        }

        public Criteria andPublishedNotBetween(String value1, String value2) {
            addCriterion("published not between", value1, value2, "published");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("recommend is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("recommend is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(String value) {
            addCriterion("recommend =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(String value) {
            addCriterion("recommend <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(String value) {
            addCriterion("recommend >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("recommend >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(String value) {
            addCriterion("recommend <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(String value) {
            addCriterion("recommend <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLike(String value) {
            addCriterion("recommend like", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotLike(String value) {
            addCriterion("recommend not like", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<String> values) {
            addCriterion("recommend in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<String> values) {
            addCriterion("recommend not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(String value1, String value2) {
            addCriterion("recommend between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(String value1, String value2) {
            addCriterion("recommend not between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNull() {
            addCriterion("typeId is null");
            return (Criteria) this;
        }

        public Criteria andTypeidIsNotNull() {
            addCriterion("typeId is not null");
            return (Criteria) this;
        }

        public Criteria andTypeidEqualTo(Integer value) {
            addCriterion("typeId =", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotEqualTo(Integer value) {
            addCriterion("typeId <>", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThan(Integer value) {
            addCriterion("typeId >", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeId >=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThan(Integer value) {
            addCriterion("typeId <", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidLessThanOrEqualTo(Integer value) {
            addCriterion("typeId <=", value, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidIn(List<Integer> values) {
            addCriterion("typeId in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotIn(List<Integer> values) {
            addCriterion("typeId not in", values, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidBetween(Integer value1, Integer value2) {
            addCriterion("typeId between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andTypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("typeId not between", value1, value2, "typeid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
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