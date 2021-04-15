package ru.itis.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecurityInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Boolean authorization = (Boolean) request.getSession().getAttribute("authenticated");
        if (authorization != null && authorization) {
            return true;
        }
        response.sendRedirect("/signIn");
        return false;
    }
}
