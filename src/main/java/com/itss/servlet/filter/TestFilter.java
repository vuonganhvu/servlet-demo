package com.itss.servlet.filter;

import javax.servlet.*;
import java.io.IOException;

//@WebFilter(urlPatterns = {"/*"}, filterName = "testFilter")
public class TestFilter implements Filter{

//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter running...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

//    @Override
//    public void destroy() {
//
//    }
}
