package odai;

public class Supplier {
    public Nameofsuppliers nameofsuppliers;
    public int weekly_pay;
    public Supplier(double weekly_pay, Nameofsuppliers nameofsuppliers) {


        this.nameofsuppliers = nameofsuppliers;

        this.weekly_pay = (int) weekly_pay;

        switch (nameofsuppliers) {
            case XP_supplier:
                this.weekly_pay = 100000;
                break;
            case MANPOWER_Supplier:
                this.weekly_pay = 110000;
                break;
            case HUGU_MANPOWER:
                this.weekly_pay = 150000;
                break;


        }

    }

    public Supplier(String string, int i) {
// TODO Auto-generated constructor stub
    }

    //overwrite toString method
    public String toString() {

        return "weekly pay for supplier [ Name of company = " + nameofsuppliers + ",  payment for supplier =  " + weekly_pay + "]";

    }
}
