package com.pyx.community.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.account_id
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.name
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.token
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.gmt_create
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.gmt_modified
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.bio
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    private String bio;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.avatar_url
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    private String avatarUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.account_id
     *
     * @return the value of t_user.account_id
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.account_id
     *
     * @param accountId the value for t_user.account_id
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.name
     *
     * @return the value of t_user.name
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.name
     *
     * @param name the value for t_user.name
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.token
     *
     * @return the value of t_user.token
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.token
     *
     * @param token the value for t_user.token
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.gmt_create
     *
     * @return the value of t_user.gmt_create
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.gmt_create
     *
     * @param gmtCreate the value for t_user.gmt_create
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.gmt_modified
     *
     * @return the value of t_user.gmt_modified
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.gmt_modified
     *
     * @param gmtModified the value for t_user.gmt_modified
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.bio
     *
     * @return the value of t_user.bio
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    public String getBio() {
        return bio;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.bio
     *
     * @param bio the value for t_user.bio
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    public void setBio(String bio) {
        this.bio = bio == null ? null : bio.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.avatar_url
     *
     * @return the value of t_user.avatar_url
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.avatar_url
     *
     * @param avatarUrl the value for t_user.avatar_url
     *
     * @mbg.generated Sat Jul 04 23:07:34 CST 2020
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }
}