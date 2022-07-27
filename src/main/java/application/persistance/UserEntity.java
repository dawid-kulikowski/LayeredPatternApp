package application.persistance;

public class UserEntity {

    public UserEntity(String name, String surname, int age) {

        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int id;
    public String name;
    public String surname;
    public int age;
}
