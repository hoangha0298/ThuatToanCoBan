import java.util.Scanner;

public class Bai2USNT {

//    Hãy đưa ra ước số nguyên tố lớn nhất của N\

    public static boolean checkSnt(long value) {
        if (value == 2) return true;
        if (value % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(value); i += 2) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long loop = sc.nextLong();

        while (loop-- > 0) {
            long value = sc.nextLong();
            if (checkSnt(value))
                System.out.println(value);
            else {
                long temp = 2;
                while (temp <= value / 2) {
                    if (value % temp == 0 && checkSnt(value / temp)) {
                        System.out.println(value / temp);
                        break;
                    } else {
                        temp++;
                    }
                }
            }
        }

    }

}
