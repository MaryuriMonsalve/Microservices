package practice.cargarimagen.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import practice.cargarimagen.service.IPictureService;

@RestController
@RequestMapping("/picture")
public class PictureRest {
    IPictureService fotoService;

    PictureRest(IPictureService fotoService){
        this.fotoService=fotoService;
    }


    @PostMapping(path = "/save")
    public void procesarFoto(@RequestParam(name = "foto") String fileBase64) {

        fotoService.procesarFoto(fileBase64);
    }

}
