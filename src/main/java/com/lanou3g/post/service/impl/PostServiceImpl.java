package com.lanou3g.post.service.impl;

import com.lanou3g.post.dao.PostDao;
import com.lanou3g.post.domain.CrmPost;
import com.lanou3g.post.service.PostService;

import java.util.List;

/**
 * Created by dllo on 17/11/12.
 */
public class PostServiceImpl implements PostService {
    
    private PostDao postDao;
    @Override
    public List<CrmPost> query() {
        return postDao.query();
    }

    @Override
    public void saveOrUpdate(CrmPost crmPost) {
        postDao.saveOrUpdate(crmPost);
        
    }
    public void setPostDao(PostDao postDao) {
        this.postDao = postDao;
    }

    public PostDao getPostDao() {
        return postDao;
    }
}
