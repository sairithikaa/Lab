public class Movie {


    private String movieName;
    String product_by;
    String direct_by;
    float duration;
    int year;
    String category;


    public Movie(String MovieName, String Product_by, String direct_by, float duration, int year, String category) {
        this.movieName = movieName;
        this.productby = product_by;
        this.directby = direct_by;
        this.duration = duration;
        this.year = year;
        this.category = category;
    }

    public String getmovieName() {
        return moviename;
    }

    public String getproductby() {
        return productby;
    }

    public String getdirectby() {
        return directby;
    }

    public float getduration() {
        return duration;
    }

    public int year() {
        return year;
    }

    public string category() {
        return category;
    }

public static void main(String[] args) {

}
}


