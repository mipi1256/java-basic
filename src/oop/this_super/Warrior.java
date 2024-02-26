package oop.this_super;
    /*
      # 메서드 오버라이딩(재정의)
      - 부모가 물려주는 메서드는 모든 자식들에게 다 맞게 설계되기 힘들기 때문에
       부족한 점이 있거나, 아예 맞지 않는 경우에는 자식 클래스 쪽에서
       내용을 추가하거나 수정할 수 있습니다. 이를 오버라이딩 이라고 합니다.

      - 만약 자식 클래스에서 부모가 물려준 메서드를 새롭게 재 정의한다면
       자식이 수정한 메서드가 우선적으로 호출됩니다.

      - 오버라이딩의 규칙이 있습니다. (3가지 모두 일치해야 오버라이딩 인정)
      1. 부모가 물려주는 메서드와 이름이 똑같을 것!
      2. 부모가 물려주는 메서드와 리턴 타입이 똑같을 것!
      3. 부모가 물려주는 메서드와 매개변수의 선언 방식이 똑같을 것!
     */

public class Warrior extends Player {

   int rage;

   Warrior(String name) {
      // 모든 생성자에는 super()가 내장되어 있습니다.
      // 자식 객체가 생성될 때는 부모의 객체도 생성이 되어야
      // 부모의 속성과 기능이 실존하게 되고, 물려줄 수 있기 때문입니다.
      // When the child is being called to another place and it has the text extend and super.
      // Then the parent will be always be called with the child
      // So the basic format that the parent had the child will get it no matter what.
      super(name); // This code will always be inside the child even though it is not written down.
      // this.name = name; -> 부모의 생성자가 대신 초기화해 줌.
      // No need for this part of the code because there is already made in the parent format.
      this.rage = 60;
   }

   @Override
   void characterInfo() {
      super.characterInfo();
      System.out.println("# 분노: " + rage);
   }


}

































