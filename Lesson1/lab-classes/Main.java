import java.util.Scanner;

public class Main
{   
    public static void main(String[] args)
    {
        LabClass OOP = new LabClass(3000000);
        
        //students data
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students? ");
        int number = sc.nextInt();//input
        sc.nextLine(); // to clear the input buffer
        
        for (int i=1;i<=number;i++)//for loop example
        {    
            //get name
            System.out.print("Student name? ");
            String name = sc.nextLine();
            //get id
            System.out.print("Student id? ");
            String id = sc.nextLine();
            //create Student object
            Student newStudent = new Student(name, id);
            //run enroll method to append list
            OOP.enrollStudent(newStudent);
        }
        
        
        //class data
        
        OOP.setTime("Friday, 10am");
        OOP.setInstructor("Xinogalos");
        OOP.setRoom("E4");
        OOP.printList();
    }
    
}
