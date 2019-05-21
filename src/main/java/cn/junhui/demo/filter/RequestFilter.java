package cn.junhui.demo.filter;

import org.springframework.web.util.ContentCachingRequestWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * RequestFilter class
 *
 * @author junhui
 * @date 19-4-26
 */
public class RequestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig){

    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        chain.doFilter(new ContentCachingRequestWrapper((HttpServletRequest) request),response);
    }
    @Override
    public void destroy() {

    }
}
