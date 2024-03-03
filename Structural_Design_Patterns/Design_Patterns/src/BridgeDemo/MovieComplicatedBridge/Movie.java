package BridgeDemo.MovieComplicatedBridge;

public class Movie {
    private String classification;
    private String title;
    private String year;
    private String runtime;

    public String getClassification() {
        return classification;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
}
