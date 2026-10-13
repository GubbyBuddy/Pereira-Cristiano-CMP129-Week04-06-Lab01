/* Cristiano Pereira
   26FA15 Computer Science II (CMP-129-80231)
   Weeks 4 and 6, Lab 1
   10/12/2026
   */
import java.util.Scanner;
public class DriversLicenseExam {
    public static void main(String[] args){
         String[] correctAnswers = {"A", "D", "B", "B", "C",
                                  "B", "A", "B", "C", "D",
                                  "A", "C", "D", "B", "D",
                                  "C", "C", "A", "D", "B"};
         String[] studentAnswers = new String[20];
         Scanner s = new Scanner(System.in);
         int []wrong = new int[20]; 
         int wrongamt = 0;
         int amt = 0;
         String passorfail; 
        for(int j = 0; j < studentAnswers.length; j++){
         System.out.println("Enter your answers for question " + (j+1) + ": ");
         String input = s.nextLine();
        while(!input.matches("[A-Da-d]") ){
            System.out.println("Please input A B C D answers only");
            input = s.nextLine();
        }



         studentAnswers[j] = input.toUpperCase();
         

        }
        for(int j = 0; studentAnswers.length > j; j++)
            if(studentAnswers[j].equals(correctAnswers[j])){
                amt++;
        }else{
            wrong[wrongamt] = j + 1;
            wrongamt++;
        }
        if(amt >= 15){
            passorfail = "pass";

        }else{
            passorfail = "fail";
        }
        System.out.println("correct answers: " + amt);
        System.out.println("Incorrect answers: " + wrongamt);
        System.out.println("Result: " + passorfail);
        System.out.println("The questions you got wrong where: ");
        for( int j = 0; j < wrongamt; j++){
        System.out.println(wrong[j]);
        }
    }
}
