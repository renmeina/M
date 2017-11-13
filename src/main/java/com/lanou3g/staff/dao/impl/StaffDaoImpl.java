package com.lanou3g.staff.dao.impl;

import com.lanou3g.staff.dao.StaffDao;
import com.lanou3g.staff.domain.CrmStaff;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by dllo on 17/11/10.
 */

public class StaffDaoImpl extends HibernateDaoSupport implements StaffDao {


    @Override
    public List<CrmStaff> find() {
        List<CrmStaff> list = (List<CrmStaff>) getHibernateTemplate().find("from CrmStaff crm_staff");
        return list;
    }
    @Override
    public void save(CrmStaff crmStaff) {
        getHibernateTemplate().save(crmStaff);
    }

    @Override
    public List<CrmStaff> findAll() {
        String sql ="from CrmStaff";
        return (List<CrmStaff>) getHibernateTemplate().find(sql);
    }

    @Override
    public CrmStaff findById(int staffId) {
         return  getHibernateTemplate().get(CrmStaff.class,staffId);

    }



}
