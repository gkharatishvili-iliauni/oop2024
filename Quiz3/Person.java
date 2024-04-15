package Quiz3;

public class Person {

    String id;
    String name, surname;
    boolean checkedIn;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void checkIn() {
        if (!checkedIn) {
            checkedIn = true;
            System.out.println(name + " " + surname + " checked in.");
        } else {
            System.out.println(name + " " + surname + " is already checked in.");
        }
    }

    public void checkOut() {
        if (checkedIn) {
            checkedIn = false;
            System.out.println(name + " " + surname + " checked out.");
        } else {
            System.out.println(name + " " + surname + " is not checked in.");
        }
    }
}
