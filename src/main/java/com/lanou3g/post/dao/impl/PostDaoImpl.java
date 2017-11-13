package com.lanou3g.post.dao.impl;

import com.lanou3g.post.dao.PostDao;
import com.lanou3g.post.domain.CrmPost;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dllo on 17/11/12.
 */

public class PostDaoImpl  extends HibernateDaoSupport implements PostDao {
    @Override
    public List<CrmPost> query() {
       return (List<CrmPost>) getHibernateTemplate().find("from CrmPost crm_post");
    }

    @Override
    public void saveOrUpdate(CrmPost crmPost) {
        if (crmPost.getPostId()==null){
            getHibernateTemplate().save(crmPost);
        }else {
            getHibernateTemplate().saveOrUpdate(crmPost);
        }
    }
}
