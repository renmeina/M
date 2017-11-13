package com.lanou3g.staff.dao;

import com.lanou3g.staff.domain.CrmStaff;

import java.util.List;

/**
 * Created by dllo on 17/11/10.
 */

public interface StaffDao {
    List<CrmStaff> find();

    void save(CrmStaff crmStaff);

    List<CrmStaff> findAll();

    CrmStaff findById(int staffId);

//    List<CrmDepartment> findAll();

}
