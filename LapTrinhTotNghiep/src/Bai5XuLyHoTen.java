import java.util.Arrays;
import java.util.Scanner;

public class Bai5XuLyHoTen {


    public static String convertName(String input) {
        String output = input.trim().replaceAll("\\s{1,}", " ").toLowerCase();
        char[] chars = output.toCharArray();

        boolean flagUpcase = true;
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (flagUpcase) {
                result += Character.toUpperCase(chars[i]);
                flagUpcase = false;
            }
            else result += chars[i];
            if (chars[i] == ' ') flagUpcase = true;
        }
        return result;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int loop = sc.nextInt();
//        sc.nextLine();
//
//        while (loop-- > 0) {
//            System.out.println(convertName(sc.nextLine()));
//        }

        System.out.println(args.length);
        Arrays.stream(args).forEach(s -> {
            System.out.println(s);
        });

    }
}
