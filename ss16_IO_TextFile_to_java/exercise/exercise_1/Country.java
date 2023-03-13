package ss16_IO_TextFile_to_java.exercise.exercise_1;

public class Country {
    private String id ;
    private String abbreviations ;
    private String name ;

    public Country(String id, String abbreviations, String name) {
        this.id = id;
        this.abbreviations = abbreviations;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAbbreviations() {
        return abbreviations;
    }

    public void setAbbreviations(String abbreviations) {
        this.abbreviations = abbreviations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", abbreviations='" + abbreviations + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
