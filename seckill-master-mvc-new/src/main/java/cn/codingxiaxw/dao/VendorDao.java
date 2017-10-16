package cn.codingxiaxw.dao;

import cn.codingxiaxw.entity.Vendor;
import org.apache.ibatis.annotations.Param;

/*
 * @author liushikuan
 * @date   2017年10月16日18:03:11
 * 
 * 供应商
 */
public interface VendorDao {
	
	//插入
	public void insertVendor(@Param("vendor") Vendor vendor);
}
