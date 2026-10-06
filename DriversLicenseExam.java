import java.util.Scanner;
public class DriversLicenseExam {
    public static void main(String[] args){
         String[] correctAnswers = {"A", "D", "B", "B", "C",
                                  "B", "A", "B", "C", "D",
                                  "A", "C", "D", "B", "D",
                                  "C", "C", "A", "D", "B"};
         String[] studentAnswers = {};
         Scanner s = new Scanner(System.in);
        for(int j = 1; j <= 20; j++){
         System.out.println("Enter your answers for the test: ");
         studentAnswers[j] = s.nextLine();

        }


    }
}
