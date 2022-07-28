package com.charon.excusedexam.controller;

import com.charon.excusedexam.pojo.Product;
import com.charon.excusedexam.response.HttpResponse;
import com.charon.excusedexam.service.ProService;
import com.charon.excusedexam.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProController {

    // 这里跟使用@Autowire注解是一样的效果
    private final ProService proService;

    @Autowired
    public ProController(ProService proService) {
        this.proService = proService;
    }

    // 这是一个示例
    // 详细的Get、Post请求需要你们自己去了解
    // 返回商品名对应的id
    @GetMapping("/getProId/{proName}")
    public HttpResponse getProId(@PathVariable("proName") String proName) {
        // 按住ctrl键进去看看具体调用的这个函数吧
        return proService.findProIdByProName(proName);
    }

    // 在这里仿照上面的getProId方法，进行controller层、service层和mapper层的完善吧，很有规律的！
    @PostMapping("/add")
    public HttpResponse uploadProName(@RequestBody ProductVo p) {
        Product product = new Product();
        product.setProName(p.getProName());
        return proService.insertProName(product);
    }
}
