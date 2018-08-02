package javax.servlet;

public class MultiPartConfigElement extends Object {

    private final String location;
    private final long maxfileSize;
    private final long maxRequestSize;
    private final int fileSizeThreshold;

    public MultiPartConfigElement(MultiPartConfigElement annotation) {

        location = annotation.location;
        maxfileSize = annotation.maxfileSize;
        maxRequestSize = annotation.maxRequestSize;
        fileSizeThreshold = annotation.fileSizeThreshold;


    }

    MultiPartConfigElement(String location) {

        if (location != null) {
            this.location = location;
        } else
            this.location = "";

        this.fileSizeThreshold = 0;
        this.maxfileSize = -1;
        this.maxRequestSize = -1;

    }

    public MultiPartConfigElement(String location, long maxFileSize, long maxRequestSize, int fileSizeThreshold) {

        if (location != null) {
            this.location = location;
        } else
            this.location = "";

        this.maxRequestSize = maxRequestSize;
        this.maxfileSize = maxFileSize;
        this.fileSizeThreshold = fileSizeThreshold;


    }

    int getFileSizeThreshold() {

        return fileSizeThreshold;
    }

    String getLocation() {
        return location;
    }

    long getMaxFileSize() {
        return maxfileSize;
    }

    long getMaxRequestSize() {
        return maxRequestSize;
    }
}
