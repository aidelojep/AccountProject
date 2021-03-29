public class MethodOverloading {
    public static void main(String[] args) {
        System.out.printf("The square of int seven is: %d%n", square(7));
        System.out.printf("The square of double seven point five is: %f%n", square(7.5));
    }
        public static int square(int squareValue){
            System.out.printf("The value of int square is : %d%n", squareValue);
            return squareValue * squareValue;

        }

        public static double square(double squareValue){
            System.out.printf("The value of double square is : %3f%n", squareValue);
            return squareValue * squareValue;
        }



    }





