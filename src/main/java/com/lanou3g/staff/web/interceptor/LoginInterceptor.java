package com.lanou3g.staff.web.interceptor;
import com.lanou3g.staff.domain.CrmStaff;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * Created by dllo on 17/11/13.
 */
public class LoginInterceptor extends MethodFilterInterceptor {
    @Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {

        CrmStaff login = (CrmStaff) ActionContext.getContext().getSession().get("login");
        if (login == null){
            return "input";
        }
        return invocation.invoke();
    }
}
