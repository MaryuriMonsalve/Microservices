package practice.cargarimagen.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface IPictureService {

    void procesarFoto(String fileBase64);
}
