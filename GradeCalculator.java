
// GRADE CALCULATOR TASK 2
import java.util.*;
public class GradeCalculator
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of subjects:");
        int number =sc.nextInt(); // number of subjects
        
        int [] marks= new int[number]; // marks in each subject
        int totalMarks=100;
        System.out.println("enter the marks in each subject out of 100:");
        for (int i=0;i<number;i++){
            System.out.println("Subject"+(i+1)+":");
            marks[i]=sc.nextInt();
            totalMarks+=marks[i];

        }
        double avg=(double)totalMarks/(number*100)*100;
        String grade;
        if(avg>=90){
         grade ="A";
        }
        else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        

        System.out.println("Averagr Percentage:"+ String.format("%.3f",avg)+"%");
        System.out.println("Grade:"+grade);
        sc.close();

       
    }
}