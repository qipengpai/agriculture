package com.qpp.admin.entity.system;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@ToString
public class SysLog implements Serializable {
    private Integer id;

    private String userName;

    private String ip;

    private String type;

    private String text;

    private String param;

    private Date createTime;

    private static final long serialVersionUID = 1L;
}