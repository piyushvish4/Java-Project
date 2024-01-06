//ABHIJEET SINGH,ROLL NO=21124001
package assignment2;

public class hostel_room_mess extends hostel{
    //constructor with 7 parameters
    hostel_room_mess(String name,int Rollno,String email,int hostel_fees,String branch,int tution_fee,int mess_fees){
        super(name,Rollno,email,hostel_fees,branch,mess_fees,tution_fee);

    }
    // method of type boolean to check if a student has paid hostel fees or not
    public  boolean hostel_fee_payment_status(){
        if(getHostel_fees()==0){
            System.out.println("HOSTEL FEES PAYMENT STATUS:HOSTEL FEES IS NOT PAID ");
            return false;
        }else{
            return true;
        }

    }
    // method to print whether a student has paid hostel fees or not
    public void print_hostel_fee_payment_status(){
        if(hostel_fee_payment_status()){
            System.out.println("HOSTEL FEES PAYMENT STATUS:HOSTEL FEES IS  PAID ");

        }
    }
    // method which takes a String gender and an integer semester and allocates hostel to a student;
    //if gender is male and semester is 1 then hostel "DG2" is allocated else if gender is male and semester is any other then hostel XYZ
    //is allocated,similarly is gender is female and semester is 1 then hostel ABC is allocated else if gender is female and semester is any other
    // then hostel ABC2 is allocated
    public void allocate_hostel(String gender,int semester) {
        if (hostel_fee_payment_status()){
            System.out.println("");
            System.out.println("\n                  HOSTEL ALLOCATION\n");
            print_hostel_fee_payment_status();
        if (hostel_fee_payment_status()) {
            if (gender.equals("Male")) {
                if (semester == 1)
                    System.out.println("HOSTEL ALLOCATED:DG2");
                else
                    System.out.println("HOSTEL ALLOCATED:XYZ");
            } else if (gender.equals("Female")) {
                if (semester == 1)
                    System.out.println("HOSTEL ALLOCATED:ABC");
                else System.out.println("HOSTEL ALLOCATED:ABC2");

            }
        }
    }
    }
    //method which takes a String branch and an integer rollno as parameter
    //i have considered only two branches "CSE" and "MnC" in this university
    public  void allocate_room(String branch,int rollno){
        //considering CSE has 96 students
        if(branch.equals("CSE")){
          //t contains last two digits of rollno
            int t=rollno%100;
            //  initializing m=0 and p=1,later on t is compared to t and t+2 and roomno is alloacted as 200+m for students with
            // t>=p and t<=p+2
            int p=1,m=0;
            //considering room allocation for CSE starts from roomno. 200
            int room_no=200;
           while(p<97){
               if(t>=p&&t<=p+2){
                   room_no=200+m;
                   break;
               }
               p=p+3;
               m++;
           }
            System.out.println("ROOM NO.="+room_no);

        }else if(branch.equals("MnC")){
            //considering MnC has 51 students
            int t=rollno%100;
            int p=1,m=0;
            //considering room allocation for MnC starts from roomno. 400

            int room_no=400;
            while(p<52){
                if(t>=p&&t<=p+2){
                    room_no=400+m;
                    break;
                }
                p=p+3;
                m++;
            }
            System.out.println("ROOM NO.="+room_no);

        }

    }
    // method to check if mess fee is paid
    public boolean mess_fee_payment_status(){
        if(getPaid_mess_fees()==0){
            System.out.println("MESS FEES IS NOT PAID ");
            return false;
        }else{

            return true;
        }
    }
    // method to print whether the mess fees is paid or not
    public void print_mess_fee_payment_status(){
        if(mess_fee_payment_status())
        System.out.println("MESS FEES PAYMENT STATUS:MESS FEES IS  PAID ");

    }
    //method to allocate mess depending on branch
    public  void allocate_mess(){
if(mess_fee_payment_status()){
    if(getBranch().equals("CSE"))
    System.out.println("Allocated MESS:MESS 1");
    else if(getBranch().equals("MnC"))
        System.out.println("Allocated MESS:MESS 2");

}
    }

}
