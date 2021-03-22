package com.huayu.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

/**
 * 供应商
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "supplier")
public class Supplier {
    @TableId(value = "sid",type = IdType.AUTO)
    private Integer sid;
    private String name;
    private String phone;   //电话
    private String wechat;  //微信或者QQ
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
//    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    private String remarks;
}
