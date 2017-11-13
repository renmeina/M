package com.lanou3g.dept.action;

import com.lanou3g.dept.domain.CrmDepartment;
import com.lanou3g.dept.service.DeptService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.interceptor.validation.SkipValidation;


import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/11/9.
 */
public class DeptAction extends ActionSupport implements ModelDriven<CrmDepartment> {

    private CrmDepartment department = new CrmDepartment();
    @Resource
    private DeptService deptService;
    private List<CrmDepartment> departments;

    @SkipValidation
    public String query() {
        departments = deptService.query();
        ActionContext.getContext().getApplication().put("departments", departments);
        return SUCCESS;
    }

    public String saveOrUpdate() {
        deptService.saveOrUpdate(department);
        return SUCCESS;
    }


    @Override
    public CrmDepartment getModel() {
        return department;
    }

    public List<CrmDepartment> getDepartments() {
        return departments;
    }

    public void setDepartments(List<CrmDepartment> departments) {
        this.departments = departments;
    }


}
