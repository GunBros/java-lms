package nextstep.courses.domain.image;

public interface CoverImageRepository {
    void save(CoverImage coverImage);
    int findById(Long id);
//    CoverImage findBySessionID(Long id);
}
