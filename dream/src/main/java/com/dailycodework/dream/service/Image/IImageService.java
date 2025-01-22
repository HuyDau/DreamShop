package com.dailycodework.dream.service.Image;

import com.dailycodework.dream.dto.ImageDto;
import com.dailycodework.dream.model.Product.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(Long productId, List<MultipartFile> files);
    void updateImage(MultipartFile file,  Long imageId);
}
