import odai.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;


public class Demo {

    public static void main(String[] args) {

        ArrayList<Employee> contractors = new ArrayList<>();

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

            contractors.add(e1);
            contractors.add(e2);
            contractors.add(e3);

        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Java Project");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JButton addManPowerBtn = new JButton("Add ManPower");
        JButton addSupplierBtn = new JButton("Add Supplier");
        JButton displayExpensesBtn = new JButton("Display Expenses");
        JButton exitBtn = new JButton("Exit");

        addSupplierBtn.addActionListener(actionEvent -> {

            /**
             * Add Supplier button click function.
             */
            JFrame dialogFrame = new JFrame();
            dialogFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dialogFrame.setVisible(true);
            JList<String> list = new JList<>(getNames(Nameofsuppliers.class));
            JOptionPane.showMessageDialog(dialogFrame, list);
            System.out.println(list.getSelectedValue());
            dialogFrame.pack();

            /**
             * Add Supplier button click function ends here.
             */
        });

        addManPowerBtn.addActionListener(actionEvent -> {

            /**
             * Add Manpower button click function.
             */
            String name = JOptionPane.showInputDialog("Enter name");
            String id = JOptionPane.showInputDialog("Enter ID");
            String designation = JOptionPane.showInputDialog("Enter Designation");
            String hourlyPay = JOptionPane.showInputDialog("Enter Hourly pay");
            String overTime = JOptionPane.showInputDialog("Enter Overtime");
            int[] weeklyWorkedHour = new int[7];
            for (int i = 0; i < weeklyWorkedHour.length; i++) {
                int hours = Integer.parseInt(JOptionPane.showInputDialog("Enter day:" + (i + 1) + " hours"));
                weeklyWorkedHour[i] = hours;
            }
            Contractor contractor = new Contractor(name, id, designation, Double.parseDouble(hourlyPay), weeklyWorkedHour, Double.parseDouble(overTime));
            contractors.add(contractor);


            /**
             * Add Manpower button click function ends here.
             */
        });

        displayExpensesBtn.addActionListener(actionEvent -> {

            /**
             * Display Expenses button click function.
             */
            String contractorsInfo = "";
            for (Employee c : contractors
            ) {
                contractorsInfo += c.toString() + "\n";
            }

            JOptionPane.showMessageDialog(null, contractorsInfo);

            /**
             * Display Expenses button click function ends here.
             */
        });

        exitBtn.addActionListener(actionEvent -> {
            /**
             * Exit button click function.
             */
            int result = JOptionPane.showConfirmDialog(null, "Want to close the program", "Close Program", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                System.exit(0);
            }

            /**
             * Exit button click function ends here.
             */
        });

        panel.add(addSupplierBtn);
        panel.add(addManPowerBtn);
        panel.add(displayExpensesBtn);
        panel.add(exitBtn);
        frame.add(panel);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static String[] getNames(Class<? extends Enum<?>> e) {
        return Arrays.toString(e.getEnumConstants()).replaceAll("^.|.$", "").split(", ");
    }

}