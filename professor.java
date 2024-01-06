//PIYUSH SHARMA,ROLL NO=21124041
package assignment2;

public class professor extends person{
    String course;
    professor(String name,String course){
        super(name);
        this.course=course;
    }
    public void setCourse(){
        this.course=course;
    }
public String getCourse(){
        return course;
    }

}
