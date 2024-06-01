package com.company.MyFarm.sharing;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class SharingRequest {

    private String title;
    private String weight;
    private String price;
    private String region;
    private String image;
}
