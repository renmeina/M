package com.lanou3g.dept.domain;
import com.lanou3g.post.domain.CrmPost;
import com.lanou3g.staff.domain.CrmStaff;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dllo on 17/11/2.
 */
public class CrmDepartment {
    private String depId;
    private String depName;

    private Set<CrmPost> posts = new HashSet<CrmPost>();

    private Set<CrmStaff> staffs = new HashSet<CrmStaff>();

    public CrmDepartment() {
    }


    public CrmDepartment(String depName) {

        this.depName = depName;
    }

    public CrmDepartment(String depId, String depName) {
        this.depId = depId;
        this.depName = depName;
    }

    @Override
    public String toString() {
        return "CrmDepartment{" +
                "depId='" + depId + '\'' +
                ", depName='" + depName + '\'' +
                '}';
    }

    public String getDepId() {
        return depId;
    }

    public CrmDepartment setDepId(String depId) {
        this.depId = depId;
        return this;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Set<CrmPost> getPosts() {
        return posts;
    }

    public void setPosts(Set<CrmPost> posts) {
        this.posts = posts;
    }

    public Set<CrmStaff> getStaffs() {
        return staffs;
    }

    public void setStaffs(Set<CrmStaff> staffs) {
        this.staffs = staffs;
    }
}
