package com.huayu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
    private Date createTime;
    private String remarks;
}
