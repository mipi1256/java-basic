package basic.datatype;

public class FloatExample {

    public static void main(String[] args) {

        /*


        */
        //  실수 리터럴의 기본 데이터 타입은 double 입니다.
        float f1 = 7.12345F; // For float, you need to add an "F" on the end
        double d1 = 7.12345;

        //////////////////////////////////////////////////////////////////////
        float f2 = 1.234567891234F;
        double d2 = 1.234567891234;

        // Even when the numbers are the same length Float will only print out specific amount of numbers
        // Compare to double were it will print out more than what float could do.
        System.out.println("f2 = " + f2);
        System.out.println("d2 = " + d2);

    }
}
