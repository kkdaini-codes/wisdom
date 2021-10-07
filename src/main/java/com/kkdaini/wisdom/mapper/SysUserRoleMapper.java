package com.kkdaini.wisdom.mapper;

import com.kkdaini.wisdom.bean.SysRole;
import com.kkdaini.wisdom.bean.SysUserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author kkdaini
 * @since 2021-10-04
 */
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {
    List<SysRole> selectRole(SysUserRole sysUserRole);
}
