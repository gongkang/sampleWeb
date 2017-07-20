package com.sample.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常简单处理
 * Created by gongkang on 2017/7/14.
 */
@Component
public class ExceptionResolver implements HandlerExceptionResolver{

    private static Logger logger = LoggerFactory.getLogger(ExceptionResolver.class);

    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse,Object o, Exception e) {
        logger.error(e.getMessage(), e);
        return new ModelAndView("500");// 通过model跳转的页面只能是动态页面，html不行
    }
}
