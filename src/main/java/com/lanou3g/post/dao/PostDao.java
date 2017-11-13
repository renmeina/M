package com.lanou3g.post.dao;

import com.lanou3g.post.domain.CrmPost;

import java.util.List;

/**
 * Created by dllo on 17/11/12.
 */
public interface PostDao {

    List<CrmPost> query();
    void saveOrUpdate(CrmPost crmPost);
}
