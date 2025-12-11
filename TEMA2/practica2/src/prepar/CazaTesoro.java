package prepar;

import java.util.Scanner;

public class CazaTesoro {

    public static void main(String[] args) {

        String[][] board = new String[10][10];
        Scanner sc = new Scanner(System.in);
        int menu = -1;

        int keyX, keyY;

        int colocaX = (int) (Math.random() * 10);
        int colocaY = (int) (Math.random() * 10);

        System.out.println(colocaX);
        System.out.println(colocaY);

        int intentos  = 15;
        boolean win  = false;

        int distanciaAnterior=0;

        while (intentos != 0) {

            // طلب الإحداثيات
            System.out.println("أدخل الصف (0-9): ");
            int x = sc.nextInt();
            System.out.println("أدخل العمود (0-9): ");
            int y = sc.nextInt();

            int distance = Math.abs(colocaX - x) + Math.abs(colocaY - y) ;

            if (colocaX == x && colocaY == y) {
                win = true;
                break;
            };

            if (intentos < 15) { // لا نعطي تلميحاً في أول محاولة لأنه لا يوجد "سابق"
                if (distance < distanciaAnterior) {
                    System.out.println("🔥 تلميح: أنت تقترب (أقرب من المرة السابقة)!");
                } else {
                    System.out.println("❄️ تلميح: أنت تبتعد (أبعد من المرة السابقة)!");
                }
            }

            distanciaAnterior = distance;


            intentos--;
            System.out.println("intentos es " + intentos);
        }

        if (!win && intentos == 0) {
            System.out.println("\n💀 انتهت المحاولات! لقد خسرت.");
            System.out.println("الكنز كان في: (" + colocaX + ", " + colocaY + ")");
        }else {
            System.out.println("🎉 مبروك! لقد وجدت الكنز وفزت!");
        }

    }
}
