package oop.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringQuiz {

   public static void main(String[] args) {

      /*
         1. 주민등록번호 13자리를 입력받습니다.
         2. 주민등록번호는 -을 포함해서 받을 예정입니다.
         3. 13자리가 아니라면 다시 입력받습니다.
         4. ex)
         921013-1234567 -> 1992년 10월 13일 32세 남자.
         960223-2345678 -> 1996년 2월 23일 28세 여자.
         031125-3456789 -> 2003년 11월 25일 21세 남자
         031125-4123456 -> 2003년 11월 25일 21세 여자.

         제대로 출력이 될 때까지 다시 입력 받으세요.
      */

      Scanner sc = new Scanner(System.in);
      System.out.println("주민등록번호 13자리를 입력해주세요");
      System.out.println("-을 포함해서 입력하세요.");
      //System.out.println("id = " + id);

      while (true) {
         System.out.print(">> ");
         String id = sc.next();

         if (id.indexOf("-") == -1) {
            System.out.println("-을 포함해서 입력하세요.");
            continue;
         } else if (id.length() != 14) {
            System.out.println("주민등록번호는 13자리 입니다.");
            continue;
         }

         String ssn = id.replace("-", "");
         char c = ssn.charAt(6); //뒤짜리 첫번째 숫자.
         String str = ssn.substring(0, 2);
         int year = Integer.parseInt(str); // 연도를 정수로 변환.
         String month = ssn.substring(2, 4);
         String day = ssn.substring(4, 6);

         // 연도 1900 추가 또는 2000 추가
         if (c == '1' || c == '2') {
            year += 1900;
         } else {
            year += 2000;
         }

         // 나이 출력
         int age = 2024 - year;

         String gender;
         if (c == '1' || c == '3') {
            gender = "남자";
         } else {
            gender = "여자";
         }

         System.out.printf("%d년 %s월 %s일 %d세 %s \n", year, month, day, age, gender);
         break;

      }

      /* My try to answer the question
      while (true) {
         if (id.length() == 14) {
            System.out.println("입력한 주민등록번호:  " + id);
            System.out.println(id.length());
            String[] split = id.split("-");
            System.out.println("split = " + Arrays.toString(split));
            int birthday1 = split[0].indexOf("9");
            int birthday3 = Integer.parseInt(split[0]);
            int birthday2 = split[0].indexOf("0");
            int birthday4 = Integer.parseInt(split[0]);
            int genderM = split[1].indexOf("1, 3");
            int genderF = split[1].indexOf("2, 4");

            if (birthday1 == 9) {
               System.out.println(String.valueOf(birthday3));
            } else if (birthday2 == 0) {
               System.out.println(String.valueOf(birthday4));
            } else {
               System.out.println("error");
            }
            break;

         } else {
            System.out.println("주민등록번호를 다시 입력해주세요.");
            //System.out.println(id.length());
         }
       */

      sc.close();
   }
}
