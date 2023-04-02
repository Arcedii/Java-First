package src;

public class Cycles {
    public static void main(String[] args) {


         for (int i = 0; i <= 10; i++) {
             System.out.println("Не смотри сюда");
         }


         int b = 100;
         while (b >= 10) {
             b -= 10;
             System.out.println(b);
         }


         int c = 0;
         do {
              System.out.println("Do-while");
         } while (c == 1);


         for (int t = 0; t <= 10; t++){
             if (t == 5)
                 continue;
             System.out.println(t);
             if (t == 8)
                 break;
        }


    }
}
