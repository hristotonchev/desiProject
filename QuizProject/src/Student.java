import java.util.Scanner;

/**
 * Created by Dispina Savopulo on 27.12.17.
 */
public class Student {

    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String firstName;
    String lastName;
    int facNum;
            System.out.println("Please Enter Your First Name:");
        firstName = scan.nextLine();
        if(firstName.equals("")) {
            System.out.println("Wrong First Name");
            return;
        }
            System.out.println("Please Enter Your Last Name");
        lastName = scan.nextLine();
        if(lastName.equals("")){
            System.out.println("Wrong Last Name");
            return;
        }
            System.out.println("Please Enter Your Faculty number :");
        facNum = scan.nextInt();
        if(facNum == 0 || facNum > 100000){
            System.out.println("Wrong Faculty Number");
            return;
        }


        makeTheExam();


    }

    public static void makeTheExam(){
        int j =0;
        int score = 0;
        Scanner scan = new Scanner(System.in);
        QuizQuestions quizQuestions = new QuizQuestions();
            for (int h = 0; h < quizQuestions.getTest().length; h++) {
                for (int i = 0 ; i < quizQuestions.getTest()[h].length; i++) {
                    System.out.println(quizQuestions.getTest()[h][i]);
                }
            System.out.println("Please Type the Correct Answer below: ");
                String answer = scan.nextLine();
                if(!(isValid(answer)) ) {
                    return;
                }else if(answer.equals(quizQuestions.correctAnswers[j])) {
                    System.out.println("Correct");
                    j++;
                    score++;
                } else {
                    System.out.println("Your answer is Wrong");
                    j++;
                }
            }

        float finalScore = (float)(quizQuestions.getTest().length) / score;
        System.out.println("Your Score is " + 100 / finalScore +"%");
    }

    private static boolean isValid(String a)
    {
        a = a.toLowerCase();
        if(a.equals("a") || a.equals("b") || a.equals("c") || a.equals("d"))
        {
            return true;
        }
        else
        {
            System.out.println("Start The Quiz Again");
            return false;
        }
    }


}
