package basic.loop;

import java.util.Scanner;

public class BreakExample {

  public static void main(String[] args) {

    //Loop Break
    for (int i = 1; i < 11; i++) {
      if(i > 6) break;
      System.out.print(i + " ");
    }
    System.out.println("\n반복문 종료!");

    System.out.println("-------------------------");

    //Loop Continue
    for (int i = 1; i <11 ; i++) {
      if(i == 6) continue;
      System.out.print(i + " ");
    }
    System.out.println("\n반복문 종료!");

    System.out.println("-------------------------");

    Scanner sc = new Scanner(System.in);
    System.out.println("15 x 6 = ???");
    System.out.println("정답을 모르시면 0을 입력하면 종료됩니다.");

    //Loop Infinite
    while (true) {
      System.out.print("> ");
      int answer = sc.nextInt();

      if(answer == 90) {
        System.out.println("정답입니다~!");
        break;
      } else if(answer == 0) {
        System.out.println("정답은 90 이였습니다~!");
        break;
      } else {
        System.out.println("틀렸습니다~!");
      }

    }

    sc.close();

  }
}
