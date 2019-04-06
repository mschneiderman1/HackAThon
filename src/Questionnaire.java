import java.util.Scanner;

public class Questionnaire {
    public static void main(String args){
        intro();
        q1();
    }
    public static void intro(){
        System.out.println("Please Answer the following questions: \n\n");
    }
    public static String q1(){
        Scanner console = new Scanner(System.in);

        System.out.println("What is the average length of your showers in minutes?");
        return console.next();

    }
}
