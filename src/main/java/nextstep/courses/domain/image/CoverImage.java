package nextstep.courses.domain.image;

import java.util.Objects;

public class CoverImage {
    private Long id;
    private final String fileName;
    private final ImageDimension imageDimension;
    private final ImageSize imageSize;
    private final ImageType imageType;

    public CoverImage(Long id, String fileName, int width, int height, int size) {
        this(id, fileName, ImageType.extract(fileName), new ImageDimension(width, height), new ImageSize(size));
    }

    public CoverImage(Long id, String fileName, ImageType imageType, ImageDimension imageDimension, ImageSize imageSize) {
        this.id = id;
        this.fileName = fileName;
        this.imageType = imageType;
        this.imageDimension = imageDimension;
        this.imageSize = imageSize;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CoverImage that = (CoverImage) o;
        return Objects.equals(fileName, that.fileName) && Objects.equals(imageDimension, that.imageDimension) && Objects.equals(imageSize, that.imageSize) && imageType == that.imageType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, imageDimension, imageSize, imageType);
    }
}
