package net.chenlin.dp.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;
import net.chenlin.dp.modules.sys.entity.SysOrgEntity;

/**
 * 组织架构
 *
 * @author ZhouChenglin
 * @email yczclcn@163.com
 * @url www.chenlintech.com
 * @date 2017年8月17日 上午11:26:05
 */
@Mapper
public interface SysOrgMapper extends BaseMapper<SysOrgEntity> {

	int countOrgChildren(Long parentId);
	
}
