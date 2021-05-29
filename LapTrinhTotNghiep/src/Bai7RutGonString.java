import java.util.Scanner;

// Chẳng hạn xâu “aabcc” có thể trở thành “bcc” hoặc “aab” sau 1 lần xóa
// Trả về kết quả là rút gọn đến khi không rút gọn được nữa thì thôi
public class Bai7RutGonString {

    public static String rutGon (String input) {
        for (int i=0; i<input.length()-1; i++) {
            if (input.charAt(i) == input.charAt(i+1)) {
                return rutGon(input.substring(0, i) + input.substring(i+2, input.length()));
            }
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(rutGon(sc.nextLine()));
    }
}
