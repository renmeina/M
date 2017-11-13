package com.lanou3g.staff.service.impl;

import com.lanou3g.staff.dao.StaffDao;
import com.lanou3g.staff.domain.CrmStaff;
import com.lanou3g.staff.service.StaffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/11/10.
 */
@Service("staffService")
public class StaffServiceImpl implements StaffService {

    private StaffDao staffDao;

    @Override
    public List<CrmStaff> findAll() {
        return  staffDao.find();

    }

    @Override
    public List<CrmStaff> findAllStaff() {
        return staffDao.findAll();
    }

    @Override
    public CrmStaff findById(int staffId) {
        if(staffId<0){
            return (CrmStaff) staffDao.findAll();
        }

        return staffDao.findById(staffId);
    }

    public void setStaffDao(StaffDao staffDao) {
        this.staffDao = staffDao;
    }
}
