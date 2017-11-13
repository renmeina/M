package com.lanou3g.post.action;

import com.lanou3g.dept.domain.CrmDepartment;
import com.lanou3g.post.domain.CrmPost;
import com.lanou3g.post.service.PostService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/11/12.
 */
@Controller("postAction")
@Scope("prototype")
public class PostAction extends ActionSupport implements ModelDriven<CrmPost> {
    public CrmPost post = new CrmPost();
@Resource
    private PostService postService;
    private List<CrmPost> query;

    private  String depId1;

    private CrmDepartment depId = new CrmDepartment();
    private CrmDepartment depName = new CrmDepartment();

    public PostAction() {
    }

    public String query(){

        query = postService.query();
        return SUCCESS;
    }
    public String saveOrUpdate(){
        depId.setDepId(depId1);
        post.setDepartments(depId);
        postService.saveOrUpdate(post);
        return SUCCESS;
    }

    public PostAction(CrmPost post, PostService postService, List<CrmPost> query) {
        this.post = post;
        this.postService = postService;
        this.query = query;
    }

    public CrmPost getPost() {
        return post;
    }

    public void setPost(CrmPost post) {
        this.post = post;
    }

    public PostService getPostService() {
        return postService;
    }

    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    public List<CrmPost> getQuery() {
        return query;
    }

    public void setQuery(List<CrmPost> query) {
        this.query = query;
    }

    //    public PostAction(CrmPost post) {
//        this.post = post;
//    }
//
    @Override
    public CrmPost getModel() {
        return post;
    }

    public CrmDepartment getDepId() {
        return depId;
    }

    public void setDepId(CrmDepartment depId) {
        this.depId = depId;
    }

    public CrmDepartment getDepName() {
        return depName;
    }

    public void setDepName(CrmDepartment depName) {
        this.depName = depName;
    }

    public String getDepId1() {
        return depId1;
    }

    public void setDepId1(String depId1) {
        this.depId1 = depId1;
    }
}
