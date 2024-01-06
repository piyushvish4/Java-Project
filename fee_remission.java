//PIYUSH SHARMA,ROLL NO=21124041
package assignment2;

public class fee_remission extends Student {
    private int family_income;
//constructor with 6 parameters
    public fee_remission(String name,int rollno, String email,String  branch,int tution_fee ,int family_income) {
        super(name, rollno, email,branch,tution_fee);
        this.family_income=family_income;


    }
// method to check eligibility for fee remission
    //if family income is less than 500000 then it prints "ELIGIBILTY FOR FEE REMISSION" else it prints "NOT ELIGIBILTY FOR FEE REMISSION"
    public void eligibility_for_fee_remission() {
        System.out.print("ELIGIBILITY FOR FEE-REMISSION:");
        if (family_income < 500000) {
            System.out.println("ELIGIBLE FOR FEE-REMISSION");
        } else {
            System.out.println("NOT ELIGIBLE FOR FEE-REMISSION");
        }
    }
// method to print FEE REMISSION ,if family income is less than 500000 and greater than 100000 then it prints 70% and if
    // family income is less than 100000 then it prints 100% else it prints "NO FEE REMISSION"
    public void feesemission() {
        System.out.print("FEE REMISSION:");
        if (family_income < 500000) {
            if (family_income > 100000) {
                System.out.println("70%");
            } else
                System.out.println("100%");

        }else{
            System.out.println("NO FEE REMISSION");
        }
    }
    // method to print the reduced tuition fee after remission
    public double tutionfee_after_remission(){
        if (family_income < 500000) {
            if (family_income > 100000) {
                return 0.3*(double)getTution_fee();
            } else
               return 0;

        }else return getTution_fee();
    }
    public void print_family_income(){
        System.out.println("FAMILY INCOME="+family_income);
    }
}
