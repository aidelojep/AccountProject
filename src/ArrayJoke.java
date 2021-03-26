public class ArrayJoke {
    public static void main(String[] args) {
       /* int array [];  = new int[10];*/
        int array [] = {2,4,6,8,9,7,4,1,0,11};
        System.out.printf("%s%8s%n", "Index", "Value");
        int counter;
        for(counter=0; counter<=array.length; counter++)
        System.out.printf("%5d%8d%n", counter, array[counter]);


    }


}
