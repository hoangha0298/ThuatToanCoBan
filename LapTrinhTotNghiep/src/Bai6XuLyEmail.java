import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai6XuLyEmail {

//    Hãy tạo ra các địa email tương ứng

    public static String generateEmail(String input) {
        input = input.trim().toLowerCase().replaceAll("\\s{2,}", " ");
        char[] chars = input.toCharArray();

        char firtCharOfWord = ' ';
        boolean flagFist = true;
        String word = "";
        String email = "";

        for (int i = 0; i < chars.length; i++) {
            if (flagFist) {
                firtCharOfWord = chars[i];
                flagFist = false;
            }
            if (chars[i] == ' ') {
                flagFist = true;
                email += firtCharOfWord;
                word = "";
            } else {
                word += chars[i];
            }
        }
        email = word + email + "@ptit.edu.vn";
        return email;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loop = sc.nextInt();
        sc.nextLine();

        while (loop-- > 0) {
            System.out.println(generateEmail(sc.nextLine()));
        }
    }

}
