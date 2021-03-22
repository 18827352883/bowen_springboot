package com.huayu.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commodity {
    @TableId(value = "cid",type = IdType.AUTO)
    private Integer cid;
    private String name;
    private String commodityInfo;//备注
    private String img;
    private Integer userId;
    private Integer supplierId;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private String createTime;
    private Supplier supplier;
    private User user;
}
