package oop.modi.protec.pac2;

import oop.modi.protec.pac1.*;

public class C extends A {

   // A a1 = new A(30);
   // A a2 = new A(5.67);

   public C() {

      /*
         - protected 제한자는 패키지가 다른 경우
         두 클래스 사이에 상속 관계가 존재한다면
         super 키워드를 통해 참조를 허용합니다.
       */
      super(30); // protected
      // super(3.14); (x) default does not work on another package

      super.x = 1; // protected
      // super.y = 2; (x) default

      super.method1();
      // super.method2(); (x) default


   }


}
