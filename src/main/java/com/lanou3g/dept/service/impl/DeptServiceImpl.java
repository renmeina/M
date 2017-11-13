package com.lanou3g.dept.service.impl;

import com.lanou3g.dept.dao.DeptDao;
import com.lanou3g.dept.domain.CrmDepartment;
import com.lanou3g.dept.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/11/12.
 */

public class DeptServiceImpl implements DeptService {
@Resource
    private DeptDao deptDao;

    @Override
    public List<CrmDepartment> query() {
        return deptDao.query();
    }

    @Override
    public void saveOrUpdate(CrmDepartment crmDepartment) {
         deptDao.saveOrUpdate(crmDepartment);
    }


    public void setDeptDao(DeptDao deptDao)   {
        this.deptDao = deptDao;
    }
}
