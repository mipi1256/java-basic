package oop.final_.constant;

public class Earth {

   /*
      # 상수 (constant)

      - 상수는 고정된 불변의 값입니다. 따라서 어디에서 접근을 하더라도
      같은 값이 나와야 하며, 값의 변경 또한 불가능해야 합니다.

      - 따라서 자바에서는 상수를 선언할 때 static, final을 동시에 사용합니다.
   */

   static final double RADIUS = 6400;
   // if the constant has static and final then the name should be written in uppercase.

   // For these constant you cannot use camel case, so you are able to use '_' in the name.
   static final double SURFACE_AREA;

   static {
      SURFACE_AREA = RADIUS * RADIUS * 4 * Math.PI;
   }

}










