package com.lanou3g.staff.action;

import com.lanou3g.base.BaseAction;
import com.lanou3g.staff.domain.CrmStaff;
import com.lanou3g.staff.service.StaffService;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/11/10.
 */
@Controller("staffAction")
@Scope("prototype")
public class StaffAction extends BaseAction<CrmStaff, StaffService> {
    @Resource
    private StaffService staffService;
    private CrmStaff staff = getModel();

    public String login() {
        List<CrmStaff> staff1 = staffService.findAll();
        for (CrmStaff crmStaff : staff1) {
            if (crmStaff.getLoginName().equals(staff.getLoginName()) && crmStaff.getLoginPwd().equals(staff.getLoginPwd())) {
                sessionPut("login", staff.getLoginName());
                return SUCCESS;
            }
        }
        return INPUT;
    }

    public String home() {
        return "home";
    }

    @SkipValidation
    public String findAll()    {
        List<CrmStaff> allStaff = staffService.findAllStaff();
        context("allStaff", allStaff);
        return "findAll";
    }

    public String staffEdit() {
        CrmStaff findStaff = staffService.findById(staff.getStaffId());
        getValueStack(findStaff);
        return "edit";
    }

    public CrmStaff getStaff() {
        return staff;
    }

    public StaffAction setStaff(CrmStaff staff) {
        this.staff = staff;
        return this;
    }
}







