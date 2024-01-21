public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        for (int u = 10; u >= 1; u--){
            System.out.println(u);
        }

        for (int y = 0; y < 17; y = y + 2){
            System.out.println(y);
        }

        for (int e = 10; e >= -10; e--){
            System.out.println(e);
        }

        for (int a = 1904; a <= 2096; a = a + 4){
            System.out.println(a + " is a leap year");
        }

        for  (int p = 7; p <= 98; p = p + 7){
            System.out.println(p);
        }

        for (int x = 1; x<= 512; x = x * 2){
            System.out.println(x);
        }

        int total = 0;
        int partMoney = 29000;
        for (int m = 1; m <= 12; m++){
            total = total + partMoney;
            System.out.println("Month " + m + ", the amount of savings " + total);
        }

        int totalBank = 0;
        int moneyPart = 29000;
        for (int n = 1; n <= 12; n++){
            totalBank = totalBank + totalBank/100;
            totalBank = totalBank + moneyPart;
            System.out.println("Month " + n + ", the amount of savings " + totalBank);
        }

        for (int t = 1; t <= 10; t++){
            System.out.println("2 * " + t + " = " + (t * 2));
        }
    }
}