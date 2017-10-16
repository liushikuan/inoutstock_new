package cn.codingxiaxw.dao;

import cn.codingxiaxw.entity.Good;
import cn.codingxiaxw.service.GoodService;
import com.alibaba.fastjson.JSON;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
					   "classpath:spring/spring-service.xml"})
public class test000test {
	
	@Autowired
	private TestDao testDao;
	
	@Autowired
	private GoodDao goodDao;
	
	@Autowired
	private GoodService goodService;

	@Test
	public void testUpdate () throws Exception{
		System.out.println("测试更新");
		System.out.println("rrrrr");
		testDao.testUpdate("哈哈哈", "1");
	}
	
//	@Test
	public void goodDaoInsert () throws Exception{
		System.out.println("测试插入");
		goodDao.insertGood(new Good(UUID.randomUUID().toString()
				                  , "小白鞋"
				                  , "F"
				                  , null
				                  , null
				                  , null));
	}
	
	
	
	@Test
	public void queryGoods () throws Exception{
		System.out.println("测试查看列表");
		List<Good> list = goodService.queryGoods();
		System.out.println("测试查看列表====" +  JSON.toJSONString(list));
	}
	
//	@Test
	public void deleteGoodByid () throws Exception{
		System.out.println("测试查看列表删除");
		goodDao.deleteGoodByid("989f367b-c4fb-4616-a898-cb644b6d266b");
	}
}