package extend;

public class Person {

    private String firstName;
    private String lastName;
    private char gender;
    private int age;

    public static String status = "Человек";

    public Person() {}

    public Person(String firstName, String lastName, char gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public final void changeGender() {
        if(this.gender == 'm') {
            this.gender = 'f';
        } else {
            this.gender = 'm';
        }
    }

    @Override
    public String toString() {
        return "FirstName - " + firstName + '\n' +
                "LastName - " + lastName + '\n' +
                "Gender - " + gender + '\n' +
                "Age - " + age;
    }
}
