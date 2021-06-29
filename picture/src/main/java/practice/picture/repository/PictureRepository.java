package practice.picture.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import practice.picture.domain.PictureDocument;

import java.io.Serializable;

@Repository
public interface PictureRepository extends MongoRepository<PictureDocument, Serializable> {

}
