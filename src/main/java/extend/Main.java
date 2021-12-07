package extend;

public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee("1", "Apple Team", "Developer");

        employee1.setFirstName("Ivan");
        employee1.setLastName("Ivanov");
        employee1.setGender('m');
        employee1.setAge(25);

        System.out.println(employee1);

        System.out.println();

        Employee employee2 = new Employee("Vasiliy", "Vasin", 'm', 40, "123", "Pineapple Team", "Tester");
        //System.out.println(employee2);


        employee1.changeGender();

        System.out.println();

        System.out.println("Employee's 1 gender is: " + employee1.getGender());
        System.out.println("Employee's 2 gender is: " + employee2.getGender());

        System.out.println();

        System.out.println(Person.status);
        employee1.status = "Не человек";
        System.out.println(employee1.status);
        System.out.println(employee2.status);
    }

}
