//PIYUSH SHARMA,ROLL NO.=21124041
package assignment2;

public class Student extends person{
    private int Rollno;
    private String Email;
    private String Branch;
    private int age;
    private int tution_fee;
    //constructor  with 5 parameters
    Student(String name,int Rollno,String email,String Branch,int tution_fee){
        super(name);
        this.Rollno=Rollno;
        this.Email=email;
        this.Branch=Branch;
        this.tution_fee=tution_fee;
    }
    public void setRollno() {
        this.Rollno = Rollno;
    }
    public int getRollno(){
        return Rollno;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }
    public void printRollno(){
        System.out.println("ROLLNO.="+Rollno);
    }
    public void printEmail(){
        System.out.println("EMAIL="+Email);
    }
    public void setBranch(){
        this.Branch=Branch;
    }
   public  int getTution_fee(){
        return tution_fee;
    }
    public String getBranch(){
        return Branch;
    }

}
