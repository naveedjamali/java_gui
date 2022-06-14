import odai.*;
public class Demo {
    public static void main(String[] args) {
        int hours1[] = {9, 8, 8, 7, 8, 9, 8};
        int hours2[] = {9, 10, 12, 10, 10, 9, 8};
        int hours3[] = {7, 8, 13, 14, 0, 0, 10};

        // Exception Handling

        try {
            // create new instance from contractor , then initialize them then add users to  list of type Employee
            Employee e1 = new Contractor("John Doe", "1001", "Analyst", 15, hours1, 20);

            Employee e2 = new Contractor("Jane", "1010", "Director", 30, hours2, 40);

            Employee e3 = new Contractor("Henry", "1009", "MD", 40, hours3, 60);
            Supplier e4 = new Supplier("XP_supplier", 100000);

            System.out.println(e1);

            System.out.println(e2);

            System.out.println(e3);
            System.out.println(e4);

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

}