public class Person {
    public String name;
    public String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Имя человека: " + name + ", а фамилия человека: " + surname;
    }
}
