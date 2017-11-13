package com.lanou3g.post.domain;

import com.lanou3g.dept.domain.CrmDepartment;
import com.lanou3g.staff.domain.CrmStaff;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dllo on 17/11/2.
 */
public class CrmPost {
    private String  postId;
    private String postName;

    private CrmDepartment departments;

    private Set<CrmStaff> staffs = new HashSet<CrmStaff>();

    public CrmPost() {
    }

    public CrmPost(String postName) {

        this.postName = postName;
    }

    public CrmPost(String postName, CrmDepartment departments, Set<CrmStaff> staffs) {
        this.postName = postName;
        this.departments = departments;
        this.staffs = staffs;
    }

    @Override
    public String toString() {
        return "CrmPost{" +
                "postId=" + postId +
                ", postName='" + postName + '\'' +
                '}';
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public CrmDepartment getDepartments() {
        return departments;
    }

    public CrmPost setDepartments(CrmDepartment departments) {
        this.departments = departments;
        return this;
    }

    public Set<CrmStaff> getStaffs() {
        return staffs;
    }

    public void setStaffs(Set<CrmStaff> staffs) {
        this.staffs = staffs;
    }
}