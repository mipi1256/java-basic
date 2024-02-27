package oop.poly.player;
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

   public void ru(Player target) {
      /*
         - 전사의 고유 기능인 rush 메서드를 작성합니다.

         - rush의 대상은 모든 직업들 입니다.

         - 만약 rush의 대상이 전사라면 10의 피해를 받고,
         마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.

         - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.

         - 남은 체력도 출력해 주세요.

         - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
      */

      if (target instanceof Warrior) {
         target.hp -= 10;
         System.out.println("============================================");
         System.out.printf("%s님이 %s님에게 돌진을 시전했습니다.\n", this.name, target.name);
         System.out.printf("%s님(전사)이 10의 피해를 입었습니다.\n", target.name);
         System.out.printf("%s님의 남은 체력: %d\n", target.name, target.hp);
         System.out.println("---------------------------------------------");
      } else if (target instanceof Mage) {
         target.hp -= 20;

         System.out.printf("%s님이 %s님에게 돌진을 시전했습니다.\n", this.name, target.name);
         System.out.printf("%s님(마법사)이 20의 피해를 입었습니다.\n", target.name);
         System.out.printf("%s님의 남은 체력: %d\n", target.name, target.hp);
         System.out.println("---------------------------------------------");
      } else if (target instanceof Hunter) {
         target.hp -= 15;

         System.out.printf("%s님이 %s님에게 돌진을 시전했습니다.\n", this.name, target.name);
         System.out.printf("%s님(사냥꾼)이 15의 피해를 입었습니다.\n", target.name);
         System.out.printf("%s님의 남은 체력: %d\n", target.name, target.hp);
         System.out.println("---------------------------------------------");
      }


   }

   public void rush(Player p){
      /*
         - 전사의 고유 기능인 rush 메서드를 작성합니다.

         - rush의 대상은 모든 직업들 입니다.

         - 만약 rush의 대상이 전사라면 10의 피해를 받고,
         마법사라면 20의 피해를 받고, 사냥꾼이라면 15의 피해를 받습니다.

         - 서로 다른 데미지를 instanceof를 사용하여 구분해서 적용해 주세요.

         - 남은 체력도 출력해 주세요.

         - main에서 객체를 생성한 후 호출하셔서 잘 적용됐는지 확인해 주세요.
      */

      System.out.printf("%s님이 %s님에게 돌진을 시전했습니다!\n", this.name, p.name);

      int damage; String job;
      if(p instanceof Warrior) {
         damage = 10; job = "전사";
      } else if (p instanceof Mage) {
         damage = 20; job = "마법사";
      } else {
         damage = 15; job = "사냥꾼";
      }

      p.hp -= damage;
      System.out.printf("%s님(%s)이 %d의 피해를 입었습니다.\n", p.name, job, damage);
      System.out.printf("%s님의 남은 체력: %d\n", p.name, p.hp);
      System.out.println("----------------------------------------");
   }

   @Override
   void characterInfo() {
      super.characterInfo();
      System.out.println("# 분노: " + rage);
   }


}