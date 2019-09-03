package com.lrw.zuuldemo.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.http.protocol.RequestContent;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description  springCloud网关过滤器
 * @author:awei
 * @date:2019/9/3
 * @ver:1.0
 **/
@Component
public class AccessFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        if (token==null || "".equals(token)){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(404);
            context.setResponseBody("token不存在");
        }else {
            System.out.println("成功");
        }
        return null;
    }
}
