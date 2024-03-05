import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args){
        Scanner readScanner =new Scanner(System.in);
    
        while (true) {
            System.out.println("Enter student ID:");
            String studentID = readScanner.nextLine();

            System.out.println("Enter student name:");
            String studentName = readScanner.nextLine();
            
            System.out.println("Enter number of extra activities:");
            int numExtraActivities =readScanner.nextInt();
            readScanner.nextLine();

            student student = new student(studentID, studentName, numExtraActivities);
            
            for (int i=0;i<numExtraActivities;i++){
                System.out.println("Enter extra activity " + (i+1) + ":");
                String activity=readScanner.nextLine();
                student.addExtraActivity(i ,activity);
            }
            
            System.out.println("student details:\n" + student);
            System.out.println("Do you want to enter another student? (yes/no)");
            String continueInput = readScanner.nextLine().toLowerCase();
        
            if(!continueInput.equals("yes")){
                break;
            }
        }
        readScanner.close();
    }
}