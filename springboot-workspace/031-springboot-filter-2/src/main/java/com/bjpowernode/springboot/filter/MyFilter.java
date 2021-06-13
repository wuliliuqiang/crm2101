package com.bjpowernode.springboot.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("----------您已经进入过滤器2222-------------");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
