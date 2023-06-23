package sopt.org.eighthSeminar.controller;

import sopt.org.eighthSeminar.client.aws.S3Service;
import sopt.org.eighthSeminar.controller.DTO.FileDTO;
import sopt.org.eighthSeminar.controller.DTO.FilesDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/s3")
public class S3Controller {

    private final S3Service s3Service;

    @PostMapping("/file")
    public String insertS3File(
            @ModelAttribute @Valid final FileDTO request
    ) {
        String uploadedFileName = s3Service.uploadImage(request.getFile(), "folder");
        return uploadedFileName;
    }


    @PostMapping("/files")
    public String insertS3Files(
            @ModelAttribute @Valid final FilesDTO request
    ) {
        List<String> uploadedFileNames = s3Service.uploadImages(request.getFiles(), "folder");
        return uploadedFileNames.toString();
    }
}
