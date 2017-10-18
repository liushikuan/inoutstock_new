package cn.codingxiaxw.web;

import cn.codingxiaxw.entity.Good;
import cn.codingxiaxw.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
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
    @Autowired
    private GoodService goodService;

    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public String goodList(Model model) {
		List<Good> goodlist = goodService.queryGoods();
//        List<Good> goodlist = new ArrayList<Good>() {
//            {
//                add(new Good("G001",
//                        "AirForce1",
//                        "F",
//                        null,null,null));
//                add(new Good("G002",
//                        "AirMax Zero",
//                        "M",
//                        null,null,null));
//            }
//        };
        model.addAttribute("goodlist", goodlist);
        return "goodlist";
    }

}























