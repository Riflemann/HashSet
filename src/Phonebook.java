import java.util.Objects;

public class Phonebook {

    private String number;
    private String name;

    public Phonebook(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phonebook phonebook = (Phonebook) o;
        return Objects.equals(number, phonebook.number) && Objects.equals(name, phonebook.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}
