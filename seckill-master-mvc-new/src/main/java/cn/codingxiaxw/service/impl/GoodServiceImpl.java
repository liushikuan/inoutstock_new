package cn.codingxiaxw.service.impl;

import cn.codingxiaxw.dao.GoodDao;
import cn.codingxiaxw.entity.Good;
import cn.codingxiaxw.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/** 
* @author liushikuan
* @date   2017年10月16日18:04:37
* 商品实现类
*/
@Service
public class GoodServiceImpl implements GoodService {
	
	@Autowired
	GoodDao goodDao;

	@Autowired
	HttpServletRequest request;
	
	public void insertGood(Good good) {

		goodDao.insertGood(good);
	}

	public List<Good> queryGoods() {

		return goodDao.queryGoods();
	}

	public void deleteGoodByid(String goodnum) {

		goodDao.deleteGoodByid(goodnum);
	}

	public void deleteGoodByidAjax() {

		String goodnum = request.getParameter("goodnum");
		System.out.println("ajax测试=====" + goodnum);
//		goodDao.deleteGoodByid(goodnum);
	}

}
 