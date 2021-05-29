import java.util.ArrayList;
import java.util.Scanner;

public class Bai4SoDep {

//    Một số được coi là đẹp nếu đó là số thuận nghịch và chỉ toàn các chữ số chẵn Y/N

    public static boolean checkNumber(String number) {
        char[] chars = number.toCharArray();
        for (int i = 0; i <= chars.length / 2; i++) {
            if (chars[i] % 2 != 0) return false;
            if (chars[i] != chars[chars.length-1-i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loop = sc.nextInt();
        sc.nextLine();

        while (loop-- > 0) {
            String number = sc.nextLine();
            System.out.println(checkNumber(number) ? "YES" : "NO");
        }
    }

}
