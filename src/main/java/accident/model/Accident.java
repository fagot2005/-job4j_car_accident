package accident.model;

import java.util.Objects;

public class Accident {
    private int id;
    private String name;
    private String text;
    private String adress;

    public Accident(int id, String name, String text, String adress) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accident accident = (Accident) o;
        return id == accident.id &&
                Objects.equals(name, accident.name) &&
                Objects.equals(text, accident.text) &&
                Objects.equals(adress, accident.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, text, adress);
    }
}
