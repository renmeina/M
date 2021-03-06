package com.lanou3g.staff.domain;

//import com.lanou3g.ssh.util.MD5;

import com.lanou3g.post.domain.CrmPost;

/**
 * Created by dllo on 17/11/2.
 */
public class CrmStaff {

    private int staffId;
    private String loginName;
    private String loginPwd;
    private String staffName;
    private String gender;
    private String onDutyDate;

    private CrmPost posts;

    public CrmStaff() {
    }

    public CrmStaff(String loginName, String loginPwd, String staffName, String gender, String onDutyDate) {
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.staffName = staffName;
        this.gender = gender;
        this.onDutyDate = onDutyDate;
    }

    @Override
    public String toString() {
        return "CrmStaff{" +
                "staffId='" + staffId + '\'' +
                ", loginName='" + loginName + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", staffName='" + staffName + '\'' +
                ", gender='" + gender + '\'' +
                ", onDutyDate='" + onDutyDate + '\'' +
                '}';
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {

        this.loginPwd = loginPwd;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setOnDutyDate(String onDutyDate) {
        this.onDutyDate = onDutyDate;
    }

    public String getOnDutyDate() {
        return onDutyDate;
    }

    public CrmPost getPosts() {
        return posts;
    }

    public CrmStaff setPosts(CrmPost posts) {
        this.posts = posts;
        return this;
    }
}