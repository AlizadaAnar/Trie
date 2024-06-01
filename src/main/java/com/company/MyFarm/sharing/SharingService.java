package com.company.MyFarm.sharing;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class SharingService {

    private final SharingRepository sharingRepository;

    public String saveSharing(String title, String weight, String price, String region, String image) throws IOException {

        // Save the entity with the image data
        SharingEntity sharingEntity = new SharingEntity();
        sharingEntity.setTitle(title);
        sharingEntity.setWeight(weight);
        sharingEntity.setPrice(price);
        sharingEntity.setRegion(region);
        sharingEntity.setImage(image);

        sharingRepository.save(sharingEntity);

        // Return a success message
        return "Image saved successfully.";
    }
}
