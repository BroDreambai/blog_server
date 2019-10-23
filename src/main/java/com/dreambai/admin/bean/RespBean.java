package com.dreambai.admin.bean;

import lombok.Data;

/**
 * Created by dreambai on 2017/12/17.
 */
@Data
public class RespBean {
    private String status;
    private String msg;

    public RespBean() {
    }

    public RespBean(String status, String msg) {

        this.status = status;
        this.msg = msg;
    }

}
