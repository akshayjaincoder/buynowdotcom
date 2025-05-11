package com.dailycodework.buynowdotcom.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(value = {"products"})
public class CategoryDTO {

    private Long id;
    private String name;
    private List<ProductDTO> products;
}
