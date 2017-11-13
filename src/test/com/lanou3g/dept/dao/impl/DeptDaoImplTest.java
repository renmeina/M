package com.lanou3g.dept.dao.impl;

import com.lanou3g.dept.dao.DeptDao;
import com.lanou3g.dept.domain.CrmDepartment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by dllo on 17/11/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/*.xml")
public class DeptDaoImplTest {

    @Resource
    private DeptDao deptDao;

    @Test
    public void test(){
        CrmDepartment dept = new CrmDepartment("舞蹈部");
       deptDao.saveOrUpdate(dept);
    }


}