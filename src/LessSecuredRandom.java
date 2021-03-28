import java.util.Random;

public class LessSecuredRandom {
    public static void main(String[] args) {
        int password1=0;
        int password2=0;
        int password3=0;
        int password4=0;
        int password5=0;
        int password6=0;

        Random justRandom = new Random();


        for(int counter=1; counter<=6; counter++) {
            
            int weakPassword = 1 + justRandom.nextInt(6);

            switch (weakPassword) {
                case 1:
                    ++password1;
                    break;
                case 2:
                    ++password2;
                    break;
                case 3:
                    ++password3;
                    break;
                case 4:
                    ++password4;
                    break;
                case 5:
                    ++password5;
                    break;
                case 6:
                    ++password6;
                    break;
            }

        }
        System.out.println("WeakPassword\tPassword");
        System.out.printf("1\t\t\t\t%d%n2\t\t\t\t%d%n3\t\t\t\t%d%n4\t\t\t\t%d%n5\t\t\t\t%d%n6\t\t\t\t%d%n",password1, password2, password3, password4, password5, password6);

    }

}
