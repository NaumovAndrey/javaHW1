package homeWork1;

import java.util.ArrayList;
import java.util.List;

/**
 * класс человек содержит базовые поля (наследники: Сотрудники, клиенты)
 */
public class Human {
    private int id;
    private String name;
    private String yearOfBirth;
    private List<String> phoneNumber;
    private List<String> listFieldsHuman;

    public Human(String name, String yearOfBirth, List<String> phoneNumber, List<String> listFieldsHuman) {
        setName(name);
        setYearOfBirth(yearOfBirth);
        setPhoneNumber(phoneNumber);
        setListFieldsHuman(listFieldsHuman);
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

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getListFieldsHuman() {
        return listFieldsHuman;
    }

    public void setListFieldsHuman(List<String> listFieldsHuman) {
        this.listFieldsHuman = listFieldsHuman;
    }
}
