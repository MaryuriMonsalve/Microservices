package practice.picture.service.impl;

import org.springframework.stereotype.Service;
import practice.picture.domain.PictureDocument;
import practice.picture.repository.PictureRepository;
import practice.picture.service.IPictureService;


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
