package com.dailycodework.buynowdotcom.dtos;

import lombok.Data;

@Data
public class ImageDTO {

    private Long id;
    private String fileName;
    private String fileType;
    private String downloadUrl;
}
