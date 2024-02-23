// 패키지 선언을 항상 클래스 최 상단에 위치해야 합니다.
package oop.pac;

//작성중인 패키지와 다른 곳에 위치한 클래스 불러오려먼 import가 필요합니다.
//import oop.pac.fruit.Apple;
//import oop.pac.fruit.Banana;
//import oop.pac.fruit.Melon;
// fruit 패키지의 모든 클래스를 import 하겠다.
import oop.pac.fruit.*; // the start will bring all the packages inside the folder.



public class MainClass {

   public static void main(String[] args) {

      // 다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 때는
      // 반드시 패키지 경로를 직접 명시해 주셔야 합니다.

      Apple a = new Apple();
      oop.pac.juice.Apple a2 = new oop.pac.juice.Apple();


      Banana b = new Banana();
      Melon m = new Melon();

      // You can call packages by putting their pathway
      // But this is not recommended
      // It's better for the autofill to call the package.
      // java.util.Scanner sc = new java.util.Scanner(System.in);




   }
}
















