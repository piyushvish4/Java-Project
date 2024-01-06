//PIYUSH SHARMA,ROLL NO.=21124041
package assignment2;

public class person {

    private String name;
    person(String name){
        this.name=name;
    }
    //setter to change name
    public void setName(String name){
        this.name=name;
    }
    //getter to return String name
    public String getName(){
        return this.name;
    }
    //method to print name
    public void printname(){
        System.out.println("NAME="+name);
    }
}
