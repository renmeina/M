package com.lanou3g.post.service.impl;

import com.lanou3g.post.dao.PostDao;
import com.lanou3g.post.domain.CrmPost;

import java.util.List;

/**
 * Created by dllo on 17/11/12.
 */
public class PostServiceImpl implements PostDao {
    private PostDao postDao;
    @Override
    public List<CrmPost> query() {
        return postDao.query();
    }

    public void setPostDao(PostDao postDao) {
        this.postDao = postDao;
    }
}
