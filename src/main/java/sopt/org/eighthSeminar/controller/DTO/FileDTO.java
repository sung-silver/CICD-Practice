package sopt.org.eighthSeminar.controller.DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class FileDTO {
    @NotNull
    private MultipartFile file;
}
