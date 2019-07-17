package com.school.demo.demo.service;

import com.school.demo.demo.entity.ReturnVO;
import org.springframework.stereotype.Service;

/**
 * Created by bg384513 on 2019/7/4
 * declaration **
 */
@Service
public class TestService {

    public ReturnVO get_test(){
        return new ReturnVO();
    }
}
