//PIYUSH SHARMA,ROLL NO=21124041
package assignment2;

public class courses_lecturehall_prof_allocation extends Student implements course{

    courses_lecturehall_prof_allocation(String name,int Rollno,String email,String Branch,int tution_fee){
        super(name,Rollno,email,Branch,tution_fee);
    }
    // method that takes an object of class professor and compares its course attribute to a particular course,if it is equal
    //then it prints the lecture hall for that course
    public void allocate_courses_lecturehall(professor m){
        System.out.print("\tLECTURE HALL:");
        if(m.course.equals("E0-102")){
            System.out.print("L.T-3.1A");
        }else if(m.course.equals("CSO-102")){
            System.out.print("ABLT-4");
        }else if (m.course.equals("MA-102")){
            System.out.print("ABLT-4");
        }else if(m.course.equals("MA-104")){
            System.out.print("LT-3.1A");
        }else if(m.course.equals("H-106")){
            System.out.print("LT-3.2B");
        } else if (m.course.equals("E0-101")) {
            System.out.print("LT-3.1A");
        }else if (m.course.equals("CSE-103N")){
            System.out.print("LT-3.1A");
        }else if(m.course.equals("ME-104")){
            System.out.print("LT-3.2B");
        }


    }
    // method to print courses with name of professors and lecture hall
    public  void allocate_courses(){
        System.out.println("\n                  COURSE ALLOCATION");
        if(getBranch().equals("CSE")){
            // creating an object of class professor and giving necessary inputs
            professor a=new professor("xyz1","E0-101");
            //calling objects metjod to print name of courses and name of professor for that course
            System.out.print("\nCOURSE:"+a.getCourse()+"\t "+"PROFESSOR"+":"+a.getName()+"\t");
            //calling    allocate_courses_lecturehall method to print the lecture hall for that course
            allocate_courses_lecturehall(a);
            professor b=new professor("xyz2","CSO-102");
            System.out.print("\nCOURSE:"+b.getCourse()+"\t "+"PROFESSOR"+":"+b.getName()+"\t");
            allocate_courses_lecturehall(b);

            professor c=new professor("xyz3","MA-102");
            System.out.print("\nCOURSE:"+c.getCourse()+"\t "+"PROFESSOR"+":"+c.getName()+"\t");
            allocate_courses_lecturehall(c);

            professor d=new professor("xyz3","CSE-103N");
            System.out.print("\nCOURSE:"+d.getCourse()+"\t "+"PROFESSOR"+":"+d.getName()+"\t");
            allocate_courses_lecturehall(d);

            professor e=new professor("xyz4","ME-104");
            System.out.print("\nCOURSE:"+e.getCourse()+"\t "+"PROFESSOR"+":"+e.getName()+"\t");
            allocate_courses_lecturehall(e);

        }
        if(getBranch().equals("MnC")){
            professor a=new professor("xyz1","E0-102");
            System.out.print("\nCOURSE:"+a.getCourse()+"\t "+"PROFESSOR"+":"+a.getName()+"\t");
            allocate_courses_lecturehall(a);

            professor b=new professor("xyz2","CSO-102");
            System.out.print("\nCOURSE:"+b.getCourse()+"\t "+"PROFESSOR"+":"+b.getName()+"\t");
            allocate_courses_lecturehall(b);
            professor c=new professor("xyz3","MA-102");
            System.out.print("\nCOURSE:"+c.getCourse()+"\t "+"PROFESSOR"+":"+c.getName()+"\t");
            allocate_courses_lecturehall(c);

            professor d=new professor("xyz3","MA-104");
            System.out.print("\nCOURSE:"+d.getCourse()+"\t "+"PROFESSOR"+":"+d.getName()+"\t");
            allocate_courses_lecturehall(d);

            professor e=new professor("xyz4","H-106");
            System.out.print("\nCOURSE:"+e.getCourse()+"\t "+"PROFESSOR"+":"+e.getName()+"\t");
            allocate_courses_lecturehall(e);

        }

    }

}
