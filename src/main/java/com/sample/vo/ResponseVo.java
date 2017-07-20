package com.sample.vo;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gongkang on 2017/7/20.
 */
@Data
public class ResponseVo {

    private Object data;

    private boolean success = true;

    private List<String> errorMsgs = new ArrayList<String>();

    private String statusCode;

    public void addErrorMsg(String error) {
        this.errorMsgs.add(error);
    }

    public boolean isSuccess() {
        return success;
    }
}
