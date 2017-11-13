package com.lanou3g.dept.dao.impl;

import com.lanou3g.dept.dao.DeptDao;
import com.lanou3g.dept.domain.CrmDepartment;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dllo on 17/11/12.
 */

public class DeptDaoImpl extends HibernateDaoSupport implements DeptDao {
    @Override
    public List<CrmDepartment> query() {
        List<CrmDepartment> list = (List<CrmDepartment>) getHibernateTemplate().find("from CrmDepartment crm_department");
        return list;
    }

    @Override
    public void saveOrUpdate(CrmDepartment crmDepartment) {
        if (crmDepartment.getDepId()==null){
            getHibernateTemplate().save(crmDepartment);
        }else {
            getHibernateTemplate().saveOrUpdate(crmDepartment);
        }

    }

}
