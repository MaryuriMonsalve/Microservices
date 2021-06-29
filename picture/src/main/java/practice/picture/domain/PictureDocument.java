package practice.picture.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@Data
@Document(collection ="picture")
public class PictureDocument implements Serializable {

    @Id
    private String id;
    private String name;
    private String pictureB64;

}
