package cn.codingxiaxw.dao;

import org.apache.ibatis.annotations.Param;

public interface TestDao {
	//测试更新
	public void testUpdate(@Param("name") String name, @Param("id") String id);
}
