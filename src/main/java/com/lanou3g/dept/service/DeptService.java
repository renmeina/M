package com.lanou3g.dept.service;

import com.lanou3g.dept.domain.CrmDepartment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dllo on 17/11/12.
 */

public interface DeptService {
    List<CrmDepartment> query();
    void saveOrUpdate(CrmDepartment crmDepartment);
}
