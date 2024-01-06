        // PIYUSH SHARMA ,ROLL NO.=21124041
  package assignment2;

        public class runfile {
        public static void main(String[] args) {
        System.out.println("                                 WELCOME TO STUDENT MANAGEMENT SYSTEM !                                 ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");


        fee_remission ab=new fee_remission("SHAHID",657869,"dgjggk6896@gmail.com","CSE",100000,300000);
        ab.printname();
        ab.printRollno();
        ab.printEmail();
        ab.print_family_income();
        ab.eligibility_for_fee_remission();
        System.out.println("TUITION FEE BEFORE REMISSION:"+ab.getTution_fee());
        ab.feesemission();
        System.out.println("TUITION FEE AFTER REMISSION:"+ab.tutionfee_after_remission());


        hostel_room_mess a=new hostel_room_mess("SHAHID",657869,"dgjggk6896@gmail.com",5000,"CSE",100000,500000);

        a.allocate_hostel("Male",1);
        a.allocate_room("CSE",234807);
        a.print_mess_fee_payment_status();
        a.allocate_mess();

        courses_lecturehall_prof_allocation m=new courses_lecturehall_prof_allocation("SHAHID",657869,"dgjggk6896@gmail.com","MnC",100000);
        m.allocate_courses();
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");

        fee_remission ab1=new fee_remission("DEVANSH",584258,"gfkbkfg@gmail.com","MnC",100000,300000);
        ab1.printname();
        ab1.printRollno();
        ab1.printEmail();
        ab1.print_family_income();
        ab1.eligibility_for_fee_remission();
        System.out.println("TUITION FEE BEFORE REMISSION:"+ab1.getTution_fee());
        ab1.feesemission();
        System.out.println("TUITION FEE AFTER REMISSION:"+ab1.tutionfee_after_remission());


        hostel_room_mess a1=new hostel_room_mess("DEVANSH",584258,"dgjggk6896@gmail.com",5000,"MnC",100000,500000);

        a1.allocate_hostel("Male",1);
        a1.allocate_room("MnC",584258);
        a1.print_mess_fee_payment_status();
        a1.allocate_mess();

        courses_lecturehall_prof_allocation m1=new courses_lecturehall_prof_allocation("DEVANSH",584258,"dgjggk6896@gmail.com","MnC",100000);
        m1.allocate_courses();

        }

        }
