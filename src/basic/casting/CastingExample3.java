package basic.casting;

public class CastingExample3 {

    public static void main(String[] args) {

        char c = 'B';
        int i = 2;

        int intResult = c + i;
        char charResult = (char) (c + i);

        System.out.println("intResult = " + intResult);
        System.out.println("charResult = " + charResult);

        int k = 10;
        double d = k / 4.0 ;
        // For the result to come out 2.5 you have to ways
        // double d = (double) k / 4; or
        // double d = k / 4.0;
        System.out.println("d = " + d);

    }
}
