package extend;

public class Employee extends Person {

    private static final int CONNECTION_AMOUNT_TRIES = 1;

    private String id;
    private String department;
    private String position;

    public Employee() {}
    public Employee(String id, String department, String position) {
        this.id = id;
        this.department = department;
        this.position = position;
    }

    public Employee(String firstName, String lastName, char gender, int age, String id, String department, String position) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setGender(gender);
        this.setAge(age);
        this.id = id;
        this.department = department;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public static void print() {
        System.out.println("asd");
    }

    //@Override
    //public void changeGender() {}

    @Override
    public String toString() {
        return "Employee info: \n" +
                "FirstName - " + this.getFirstName() + '\n' +
                "LastName - " + this.getLastName() + '\n' +
                "Gender - " + this.getGender() + '\n' +
                "Age - " + this.getAge() + '\n' +
                "Id - " + id + '\n' +
                "Department - " + department + '\n' +
                "Position - " + position;
    }
}
