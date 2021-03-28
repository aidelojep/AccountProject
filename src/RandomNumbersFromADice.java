import java.security.SecureRandom;

public class RandomNumbersFromADice{

    public static void main(String[] args) {

        SecureRandom myRandom = new SecureRandom();
        int frequency1 =0;
        int frequency2 =0;
        int frequency3 =0;
        int frequency4 =0;
        int frequency5 =0;
        int frequency6 =0;

        for(int counter=1; counter<=6000000; counter++) {
            int face = 1 + myRandom.nextInt(6);

            switch(face)
            {   case 1-> ++frequency1;
                case 2-> ++frequency2;
                case 3-> ++frequency3;
                case 4-> ++frequency4;
                case 5-> ++frequency5;
                case 6-> ++frequency6;
            }
        }
        System.out.println("Face\tFrequency");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequency1, frequency2,frequency3,frequency4,frequency5,frequency6 );

    }

}
