package com.lanou3g.staff.service;

import com.lanou3g.staff.domain.CrmStaff;

import java.util.List;

/**
 * Created by dllo on 17/11/10.
 */
public interface StaffService {
    List<CrmStaff> findAll();

    List<CrmStaff> findAllStaff();

//    CrmStaff findById(String staffId);


}
