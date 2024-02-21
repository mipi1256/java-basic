package basic.constate;

import java.util.Scanner;

public class SwitchQuiz {

  public static void main(String[] args) {


    /*
    - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요. (+, -, *, /)
     다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
     연산 결과를 출력해 주시면 됩니다. (switch문 사용)
     연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
     결과를 말씀해 주세요.
     만약, 사용자가 나눗셈을 선택 했을 때 0으로 나누려는 시도를 한다면
     연산할 수 없는 입력값이라고 얘기 해 주세요.
    */

    Scanner sc = new Scanner(System.in);

    System.out.print("정수1 입력하세요: ");
    int num1 = sc.nextInt();

    System.out.print("연산자 입력하세요: [+, -, *, /]");
    String operator = sc.next();

    System.out.print("정수2 입력하세요: ");
    int num2 = sc.nextInt();

    boolean flag = false;

    switch (operator) {

      case "+":
        int plus = num1 + num2;
        System.out.printf("%d + %d =  %d ", num1, num2, plus);
        break;

      case "-":
        int minus = num1 - num2;
        System.out.printf("%d - %d =  %d ", num1, num2, minus);
        break;

      case "*":
        int multi = num1 * num2;
        System.out.printf("%d * %d =  %d ", num1, num2, multi);
        break;

      case "/":
        if (num2 == 0) {
          System.out.println("연산 할 수 없는 일력값 입니다.");
          flag = true;
          break;
        }
        int divide = num1 / num2;
        if(!flag) {
          System.out.printf("%d / %d =  %d ", num1, num2, divide);
          break;
        }

      default:
        System.out.println("연산을 기호를 정확하게 입력해수제요. [+, -, *, /] ");
    }

    sc.close();
  }
}
