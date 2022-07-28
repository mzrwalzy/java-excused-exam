package com.charon.excusedexam.service.impl;

import com.charon.excusedexam.mapper.ProMapper;
import com.charon.excusedexam.pojo.Product;
import com.charon.excusedexam.response.HttpResponse;
import com.charon.excusedexam.service.ProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProServiceImpl implements ProService {
    private final ProMapper proMapper;

    @Autowired
    public ProServiceImpl(ProMapper proMapper) {
        this.proMapper = proMapper;
    }

    @Override
    public HttpResponse findProIdByProName(String proName) {
        Integer id = proMapper.selectProName(proName);
        return HttpResponse.ok(id);
    }

    @Override
    public HttpResponse insertProName(Product product) {
        Boolean ok = proMapper.insertProName(product);
        if (ok) {
            return HttpResponse.ok(product.getId());
        }
        return HttpResponse.error();
    }
}
