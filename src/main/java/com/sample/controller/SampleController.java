package com.sample.controller;

import com.alibaba.fastjson.JSONObject;
import com.sample.vo.ResponseVo;
import com.sample.vo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gongkang on 2017/7/14.
 */
@Controller
@RequestMapping("/test")
public class SampleController {

    private static Logger logger = LoggerFactory.getLogger(SampleController.class);

    @RequestMapping("/json")
    @ResponseBody
    public ResponseVo json(UserVo user) {
        ResponseVo responseVo = new ResponseVo();
        responseVo.setData(user);

        String jsonObject = JSONObject.toJSONString(user);
        logger.debug(jsonObject);

        return responseVo;
    }

    @RequestMapping(value = "/string")
    @ResponseBody
    public ResponseVo string(String name) {
        ResponseVo responseVo = new ResponseVo();
        String st = "测试中文乱码";
        responseVo.setData(st);

        logger.debug(name);

        return responseVo;
    }

    @RequestMapping(value = "/error")
    public String error() {
        throw new RuntimeException();
    }
}
