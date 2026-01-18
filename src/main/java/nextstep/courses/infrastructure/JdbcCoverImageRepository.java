package nextstep.courses.infrastructure;

import nextstep.courses.domain.image.CoverImage;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

@Repository("coverImageRepository")
public class JdbcCoverImageRepository implements nextstep.courses.domain.image.CoverImageRepository {
    private final JdbcOperations jdbcTemplate;

    public JdbcCoverImageRepository(JdbcOperations jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(CoverImage coverImage) {

    }

    @Override
    public int findById(Long id) {
        return 0;
    }
}
