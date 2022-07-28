package com.charon.excusedexam.service;

import com.charon.excusedexam.pojo.Product;
import com.charon.excusedexam.response.HttpResponse;

public interface ProService {
    HttpResponse findProIdByProName(String proName);

    HttpResponse insertProName(Product product);
}
