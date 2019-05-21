package cn.junhui.demo.controller;

import cn.junhui.demo.model.DivModel;
import cn.junhui.demo.model.MyModel;
import cn.junhui.demo.vo.ResultVO;
import org.springframework.web.bind.annotation.*;

/**
 * Api class
 *
 * @author junhui
 * @date 19-4-26
 */
@RestController
@RequestMapping("/api")
public class ApiController {
    @PostMapping(value = "div")
    public ResultVO div(@RequestBody MyModel obj) {
        DivModel div = new DivModel(obj.getA(), obj.getB(), obj.getA() / obj.getB());
        return new ResultVO("0000", null, div);
    }

    @GetMapping(value = "div1")
    public ResultVO div1(MyModel obj) {
        DivModel div = new DivModel(obj.getA(), obj.getB(), obj.getA() / obj.getB());
        return new ResultVO("0000", null, div);
    }
}
