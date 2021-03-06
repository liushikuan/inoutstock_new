package cn.codingxiaxw.web;

import cn.codingxiaxw.dto.CommonResult;
import cn.codingxiaxw.entity.Good;
import cn.codingxiaxw.service.GoodService;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 * liushikuan
 * 2017年10月18日10:07:31
 * 商品
 */
@Component
@RequestMapping("/good")//url:模块/资源/{}/细分
public class GoodController
{
    //日志对象
    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private GoodService goodService;

    /**
     * 商品列表查看
     * @param model
     * @return
     */
    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public String goodList(Model model) {
		List<Good> goodlist = goodService.queryGoods();
        model.addAttribute("goodlist", goodlist);
        return "goodlist";
    }

    /**
     * 删除商品
     * @param goodnum
     * @return
     */
    @RequestMapping(value = "/{goodnum}" , method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public CommonResult deleteGoodByNum(@PathVariable String goodnum) {
        logger.info("eiwo===" + goodnum);
        goodService.deleteGoodByid(goodnum);
        CommonResult commonResult = new CommonResult("1", "删除成功");
        return commonResult;
    }

    /**
     * 插入商品
     * @param good
     * @return
     */
    @RequestMapping(value = "" , method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public CommonResult insertGood(@RequestBody Good good) {
        logger.info("insertGood===" + JSON.toJSONString(good));
        goodService.insertGood(good);
        CommonResult commonResult = new CommonResult("1", "插入成功");
        return commonResult;
    }

}
