
public class DattyTest{
    public static void main(String[] args) {

        Datty myDate1 = new Datty(01, 01, 2021);
        Datty myDate2 = new Datty(03, 07, 1994);

        System.out.printf("%sThe default date is :%n%d%d", myDate1.getMonth(), myDate1.getDay(), myDate1.getYear());
        System.out.printf("%sThe default date is :%n%d%d", myDate2.getMonth(), myDate2.getDay(), myDate2.getYear());


    }






}