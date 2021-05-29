import java.util.Arrays;

public class Bai3XuLyString {

//    Ví dụ S =”ACCBA10D2EW30” ta nhận được kết quả: “AABCCDEW6”

    public static void main(String[] args) {
        String s = "ACCBA10D2EW30";
        char[] c = s.toCharArray();

        Arrays.sort(c);

        int total = 0;
        for (int i = 0; i < c.length; i++) {
            if (48 <= c[i] && c[i] <= 57) total += c[i] - 48;
            else System.out.print(c[i]);
        }
        System.out.println(total);
    }

}
