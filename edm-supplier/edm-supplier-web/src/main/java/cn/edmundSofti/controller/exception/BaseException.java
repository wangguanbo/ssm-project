package cn.edmundSofti.controller.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @Description //TODO
 * @Author wangguanbo
 * @Date 22:40 2019/7/11
 * @return
 **/
@Service
public class BaseException implements HandlerExceptionResolver {

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(ex.getMessage());
        System.out.println(ex.getMessage());
        System.out.println(ex.getLocalizedMessage());
        return modelAndView;
    }


}
