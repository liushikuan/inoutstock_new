package cn.codingxiaxw.dao;

import cn.codingxiaxw.entity.Good;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
 * @author liushikuan
 * @date   2017年10月16日18:01:58
 * 
 * 商品接口
 */
public interface GoodDao {
	//插入
	public void insertGood(@Param("good") Good good);

	//查询
	public List<Good> queryGoods();

	//删除
	public void deleteGoodByid(@Param("goodnum") String goodnum);
}
