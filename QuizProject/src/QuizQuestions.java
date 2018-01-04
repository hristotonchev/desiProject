/**
 * Created by Dispina Savopulo on 27.12.17.
 */
public class QuizQuestions {

    public String[][] test = {
    //String[][] test = new String[][] {
            {   "Which is the capital of Bulgaria?",
                "A: Sliven",
                "B: Varna",
                "C: Burgas",
                "D: Sofia"
            },

            {   "When was founded the first Bulgarian country?",
                "A: 1878",
                "B: 1235",
                "C: 681",
                "D: 3"
            },

            {   "Which is the birth town of Hristo Botev",
                "A: Kazanluk",
                "B: Karlovo",
                "C: Kalofer",
                "D: Koprivchica"
            },

            {   "What is Intellij IDEA?",
                "A: An Awesome IDE",
                "B: Aliens",
                "C: Programming language",
                "D: Meaning of life itself"
            }
    };

    public String[][] getTest(){
        return this.test;
    }

    public String[] correctAnswers = {"d","c","c","a","a"};

    public String[] getCorrectAnswers(){
        return this.correctAnswers;
    }

}