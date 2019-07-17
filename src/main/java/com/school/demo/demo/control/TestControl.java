package com.school.demo.demo.control;

import com.school.demo.demo.entity.ReturnVO;
import com.school.demo.demo.service.TestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bg384513 on 2019/7/4
 * declaration **
 */

@RestController
public class TestControl {
    @Autowired
    private TestService testService;
    @ApiOperation(value = "测试接口", notes = "查看是否运行")
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ReturnVO test(){
        return testService.get_test();
    }
    @RequestMapping(value = "/w",method = RequestMethod.GET)
    public String word(){
        return "world 你睡";
    }
}
