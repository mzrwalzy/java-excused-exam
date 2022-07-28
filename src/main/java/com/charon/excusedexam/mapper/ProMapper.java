package com.charon.excusedexam.mapper;

import com.charon.excusedexam.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ProMapper {
    Integer selectProName(@Param("proName") String proName);

    Boolean insertProName(Product product);
}
