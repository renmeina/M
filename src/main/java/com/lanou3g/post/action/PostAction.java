package com.lanou3g.post.action;

import com.lanou3g.post.domain.CrmPost;
import com.lanou3g.post.service.PostService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by dllo on 17/11/12.
 */
@Controller("postAction")
@Scope("prototype")
public class PostAction extends ActionSupport implements ModelDriven<CrmPost> {
    public CrmPost post = new CrmPost();
    private PostService postService;
    private List<CrmPost> query;

    public String query(){
        query = postService.query();
        return SUCCESS;
    }
    @Override
    public CrmPost getModel() {
        return post;
    }

    public void setPost(CrmPost post) {
        this.post = post;
    }

    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    public void setQuery(List<CrmPost> query) {
        this.query = query;
    }
}
