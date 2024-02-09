package tr.com.workintech.java.s17d1.entity;

public class Animal {
    private int id;
    private String value;

    public Animal(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
}
