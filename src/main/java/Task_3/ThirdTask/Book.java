package Task_3.ThirdTask;

public class Book {
    private String author, title, genre;
    private int year;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String ToString(){
        return "\"" + getTitle() + "\"" + " by " + getAuthor() + " was written in " + getYear() + " in genre: " +
                getGenre();
    }
}
