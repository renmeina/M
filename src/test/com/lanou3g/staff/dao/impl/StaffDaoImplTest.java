package com.lanou3g.staff.dao.impl;

import com.lanou3g.dept.domain.CrmDepartment;
import com.lanou3g.staff.dao.StaffDao;
import com.lanou3g.post.domain.CrmPost;
import com.lanou3g.staff.domain.CrmStaff;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by dllo on 17/11/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-config.xml")
public class StaffDaoImplTest {

    @Resource
    private StaffDao staffDao;
    @Test
    public void test(){
        CrmDepartment cd1 = new CrmDepartment("教学部");
        CrmDepartment cd2 = new CrmDepartment("职规部");

        CrmPost cp1 = new CrmPost("教学主管");
        CrmPost cp2 = new CrmPost("讲师");
        cp1.setDepartments(cd1);
        cp2.setDepartments(cd2);

        CrmStaff cs1 = new CrmStaff("美美","123","山哥","1999-10-10","男");
        CrmStaff cs2 = new CrmStaff("美美","123","胖哥","1899-2-1","男");
        cs1.setPosts(cp1);
        cs2.setPosts(cp2);

        staffDao.save(cs1);
        staffDao.save(cs2);

    }

}