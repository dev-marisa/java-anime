package models;

public class Anime {

    private String Title;
    private String Studio;
    private Integer Year;

    public Anime() {
    }

    public Anime(String title, String studio, Integer year) {
        Title = title;
        Studio = studio;
        Year = year;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "Title='" + Title + '\'' +
                ", Studio='" + Studio + '\'' +
                ", Year=" + Year +
                '}';
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getStudio() {
        return Studio;
    }

    public void setStudio(String studio) {
        Studio = studio;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        Year = year;
    }

}
