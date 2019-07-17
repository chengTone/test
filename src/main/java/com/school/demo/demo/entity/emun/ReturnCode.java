package com.school.demo.demo.entity.emun;

/**
 * Created by bg384513 on 2019/7/4
 * declaration 返回值枚举处理
 */
public enum  ReturnCode {

    /** 操作成功 */
    SUCCESS("SUCCESS_CODE", "SUCCESS_MSG"),

    /** 操作失败 */
    FAIL("FAIL_CODE", "FAIL_MSG"),

    /** 空指针异常 */
    UNKNOWN("UNKNOWN_CODE", "UNKNOWN_MSG"),

    /** 自定义异常之返回值为空 */
    IS_NULL("NULL_CODE", "NULL_MSG");


    private ReturnCode(String value, String msg){
        this.val = value;
        this.msg = msg;
    }

    public String val() {
        return val;
    }

    public String msg() {
        return msg;
    }

    private String val;
    private String msg;
}

