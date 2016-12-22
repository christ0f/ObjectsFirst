package ObjectsFirst;

/**
 * Created by chris on 12/22/16.
 *
 * This class represents a student in an administration system
 */
public class Student {
    //students name
    private String name;
    //students id
    private String id;
    //number of credits taken by student
    private int credits;



    public Student(String fullName, String studentID) {
        name = fullName;
        if (fullName.length() < 4)
        {
            System.out.println("you need to get a longer name m8");
        }

        id = studentID;
        if (studentID.length() < 3)
        {
            System.out.println("your ID is too short");
        }
        credits = 0;
    }

    //return name of the student
    public String getName(){
        return name;
    }

    //sets a new name for the student
    public void changeName(String newName){
        name = newName;
    }

    //return student ID of this student
    public String getStudentID(){
        return id;
    }

    //add credits to students accumulated credits
    public void addCredits(int newCreditPoints){
        credits += newCreditPoints;
    }

    //return the number of credits the student has
    public int getCredits(){
        return credits;
    }
    //return the students login name, this is the first 4 letter of name
    //and the first 3 of the students ID
    public String getLoginName() {
        if (name.length() < 4) {
            if (id.length() < 3) {
               return name + id;
            }
        }
        return name.substring(0, 4) + id.substring(0, 3);
    }


    //print the name and ID
    public void print(){
        System.out.println("students name: "+ name+ "\tstudent id: "+ id+"\tnumber of credits:"+credits);
    }

    public static void main (String [] args){

        Student student2 = new Student("df","85");
        System.out.println(student2.getLoginName());

    }
}
