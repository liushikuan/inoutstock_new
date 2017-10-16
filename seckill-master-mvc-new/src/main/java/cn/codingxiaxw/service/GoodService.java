package cn.codingxiaxw.service;


import cn.codingxiaxw.entity.Good;

import java.util.List;

/**
 * @author liushikuan
 * @date   2017年10月16日18:12:30
 * 商品
 */
public interface GoodService {
	//插入
	public void insertGood(Good good);

	//查看
	public List<Good> queryGoods();

	//删除
	public void deleteGoodByid(String goodnum);
}
 