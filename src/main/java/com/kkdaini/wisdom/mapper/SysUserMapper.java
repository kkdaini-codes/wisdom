package com.kkdaini.wisdom.mapper;

import com.kkdaini.wisdom.bean.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author kkdaini
 * @since 2021-10-04
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    SysUser selectByUsername(String name);
}
