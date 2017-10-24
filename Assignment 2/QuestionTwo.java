import java.util.Arrays;
import java.util.Scanner;
public class QuestionTwo{
    static String a;
    static String user = "c";
    static String input = "";
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (user.equals("c")){
            System.out.println("Enter an infix expression");
            input = in.nextLine(); // Collecting user input
            if (MyCalculator.isBalanced(input)){
                a = MyCalculator.infixToPostfix(input); //Converting to postfix
                System.out.println(a);
                MyCalculator.evaluate(a); // Evaluating converted
                System.out.println("Do you want to continue. If you dont enter q if you do enter c");
                user = (in.nextLine()).toLowerCase(); //Taking user input
            }

            else{
                System.out.println("Enter a correct expression");
                user = "c";
            }
        }
    }


}