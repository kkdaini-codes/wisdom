package com.kkdaini.wisdom.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.management.relation.Role;

/**
 * <p>
 * 
 * </p>
 *
 * @author kkdaini
 * @since 2021-10-04
 */
@Getter
@Setter
@TableName("sys_user")
@ApiModel(value = "SysUser对象", description = "")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("状态，如果是false表示禁用")
    private Boolean status;

    @TableField(exist = false)
    private List<SysRole> roles;
}
