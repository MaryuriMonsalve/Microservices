package practice.cargarimagen.service.impl;

import org.springframework.stereotype.Service;
import practice.cargarimagen.domain.PictureDocument;
import practice.cargarimagen.repository.PictureRepository;
import practice.cargarimagen.service.IPictureService;


@Service
public class PictureServiceImpl implements IPictureService {

    public PictureRepository pictureRepository;

    public PictureServiceImpl (PictureRepository pictureRepository){
        this.pictureRepository=pictureRepository;
    }


    @Override
    public String procesarFoto(String fileBase64) {
        PictureDocument picture= new PictureDocument();
        picture.setPictureB64(fileBase64);
        pictureRepository.save(picture);
        return fileBase64;
    }
}
