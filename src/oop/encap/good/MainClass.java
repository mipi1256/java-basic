package oop.encap.good;

public class MainClass {

   public static void main(String[] args) {

      MyBirth my = new MyBirth();
      // my.year = 1993; (x) Because this int is private in the MyBirth class
      my.setYear(1233123123); // there is no limit on the year, so it come out like a 0
      System.out.printf("내 생일은 %d년 입니다.\n", my.getYear());

      System.out.println("=========================");

      MyBirth my2 = new MyBirth();
      my2.setYear(1993);
      my2.setMonth(2);
      my2.setDay(28);

      my2.birthInfo();
   }
}
