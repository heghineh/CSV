import com.github.javafaker.DateAndTime;
import com.github.javafaker.PhoneNumber;

public class Person {
    private String name;
    private String surname;
    private DateAndTime date;
    private Race race;
    private PhoneNumber phoneNumber;
    private String email;

    public Person(String name, String surname, DateAndTime date, Race race, PhoneNumber phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.race = race;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public DateAndTime getDate() {
        return date;
    }

    public void setDate(DateAndTime date) {
        this.date = date;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
