package oop.poly.player;

import java.lang.annotation.Target;

public class Mage extends Player {

   int mana;

   Mage(String name) {
      super(name);
      this.mana = 100;
   }



   /*
   This is for one target and my answer.
   public void blizz(Player target) {
      if (this == target) {
         System.out.println("스스로는 때릴 수 없습니다.");
         return;
      }
      System.out.printf("%s님이 눈보라 시전!!\n", this.name);
      this.mana -= 30;
      System.out.printf("30의 마나가 소모됩니다. 남은 정신력: %d\n", this.mana);
      System.out.println("---------------------------------------");

      int damage = (int) (Math.random() * 6 + 10);
      target.hp -= damage;
      System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %d)\n", target.name, damage, target.hp);
   }
   */

   public void blizzard(Player[] targets) {

      System.out.printf("%s님의 눈보라 시전!!\n", name);
      this.mana -= 30;
      System.out.printf("30의 마나가 소모됩니다. 남은 정신력: %d\n", this.mana);
      System.out.println("---------------------------------------");

      for (Player p : targets) {
         if (p == this) continue;
         int damage = (int) (Math.random() * 6 + 10);
         p.hp -= damage;
         System.out.printf("%s님이 %d의 피해를 입었습니다. (남은 체력: %d)\n", p.name, damage, p.hp);
      }

   }


   @Override
   void characterInfo() {
      super.characterInfo();
      System.out.println("# 마나: " + mana);
   }
}
