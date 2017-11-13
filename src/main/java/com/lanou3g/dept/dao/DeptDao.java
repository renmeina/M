package com.lanou3g.dept.dao;

import com.lanou3g.dept.domain.CrmDepartment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dllo on 17/11/12.
 */

public interface DeptDao {
    List<CrmDepartment> query();
}
