import java.util.Scanner;

public class ConditionalOperatorTest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Kindly enter your grade here");
        double scoreRecord1= input.nextDouble();
        System.out.println("Kindly enter your grade here");
        double scoreRecord2= input.nextDouble();

        ConditionalOperator myCO1= new ConditionalOperator("Lekwa" , scoreRecord1);
        ConditionalOperator myCO2= new ConditionalOperator( "Humble" , scoreRecord2);

        System.out.printf("The default score of %s is :%n%s%n", myCO1.getName(), myCO1.getScoreRecord(scoreRecord1));
        System.out.printf("The default score of %s is :%n%s%n", myCO2.getName(), myCO2.getScoreRecord(scoreRecord2));



    }





}
