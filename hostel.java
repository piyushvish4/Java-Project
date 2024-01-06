//PIYUSH SHARMA,ROLL NO=21124041
package assignment2;



public abstract class  hostel extends Student {

        private int paid_hostel_fees;
        private int paid_mess_fees;
        //constructor with 7 parameters
        hostel(String name,int Rollno,String email,int hostel_fees,String branch,int tution_fee,int mess_fees){
                super(name,Rollno,email,branch,tution_fee);
                this.paid_hostel_fees=hostel_fees;
                this.paid_mess_fees=mess_fees;
        }

        public void setHostel_fees(){
                this.paid_hostel_fees=paid_hostel_fees;
        }

        public int getHostel_fees() {
                return paid_hostel_fees;
        }

        public int getPaid_mess_fees() {
                return paid_mess_fees;
        }

        // abstact methods of class hostel
        public abstract boolean hostel_fee_payment_status();
        public abstract boolean mess_fee_payment_status();
        public abstract void allocate_hostel(String gender,int semester);
        public abstract void allocate_room(String branch,int rollno);
        public abstract void allocate_mess();

}

