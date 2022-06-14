package odai;// Example of Inheritance here


import odai.Employee;

public class Contractor extends Employee {

    double hourlyRate; // the regular hourly rate of the part time employee 

    int weeklyHours[] = new int[7]; // the number of hours worked by the employee weekly 

    double overtimeRate; // overTimeRate is applied for the hours greater than 60 hours 

    public Contractor(String name, String id, String designation, double rate, int hours[], double overtimeRate) {

        super(name, id, designation);

        this.hourlyRate = rate;

        this.weeklyHours = hours;

        this.overtimeRate = overtimeRate;

    }

    /**
     * @param hourlyRate the hourlyRate to set
     * @return the hourlyRate
     * public double getHourlyRate() {
     * <p>
     * return hourlyRate;
     * <p>
     * }
     * <p>
     * /**
     */

    public void setHourlyRate(double hourlyRate) {

        this.hourlyRate = hourlyRate;

    }

    /**
     * @return the weeklyHours
     */

    public int[] getWeeklyHours() {

        return weeklyHours;

    }

    /**
     * @param weeklyHours the weeklyHours to set
     */

    public void setWeeklyHours(int[] weeklyHours) {

        this.weeklyHours = weeklyHours;

    }

    /**
     * @return the overtimeRate
     */

    public double getOvertimeRate() {

        return overtimeRate;

    }

    /**
     * @param overtimeRate the overtimeRate to set
     */

    public void setOvertimeRate(double overtimeRate) {

        this.overtimeRate = overtimeRate;

    }

    // This method calculates the weekly total pay of the contractor 

    double getWeeklyTotalPay() {

        double totalPay = 0.0;

        int numberOfHours = weeklyTotalHoursWorked();

        if (numberOfHours > 60) {

            totalPay = 60 * hourlyRate + (numberOfHours - 60) * overtimeRate;

        } else {

            totalPay = numberOfHours * hourlyRate;

        }

        return totalPay;

    }

    // This method calculates the weekly total number of hours worked by the contractor 

    int weeklyTotalHoursWorked() {

        int numberOfHours = 0;
        /*

         * A class Contractor which extends Employee class

         */


//Suppler enum


        // Repetition statements

        for (int i = 0; i < weeklyHours.length; i++) {

            numberOfHours += weeklyHours[i];

        }

        return numberOfHours;

    }

    // // This method calculates the daily average pay of the contractor 

    double getDailyAvgPay() {

        int numberOfHours = weeklyTotalHoursWorked();

        // throw Divide by 0 exception 

        if (numberOfHours == 0)

            throw new ArithmeticException("Employee has not worked this week.....");

        return getWeeklyTotalPay() / numberOfHours;

    }

    /* (non-Javadoc)

     * @see java.lang.Object#toString()

     */

    @Override

    public String toString() {

        return "Contractor Employee [ Name = " + name + " ID = " + id + ", Designation = " + designation +

                " Hourly Rate = $" + hourlyRate + ", Overtime Rate = $" + overtimeRate +

                ", Total Hours worked = " + weeklyTotalHoursWorked() + ", Total Weekly Pay = $"

                + getWeeklyTotalPay() + ", Daily average pay = $" + getDailyAvgPay() + "]";

    }

}