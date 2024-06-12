package com.company.MyFarm.sharing;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sharing")
@RequiredArgsConstructor
public class SharingController {

    private final SharingService sharingService;

    @PostMapping
    public ResponseEntity<String> uploadSharingRequest(
            @RequestParam("title") String title,
            @RequestParam("weight") String weight,
            @RequestParam("price") String price,
            @RequestParam("region") String region,
            @RequestParam("image") String image) {
        try {
            // Save the image URL to the database
            String message = sharingService.saveSharing(title, weight, price, region, image);

            // Return the success message
            return ResponseEntity.ok(message);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error uploading request");
        }
    }

}
