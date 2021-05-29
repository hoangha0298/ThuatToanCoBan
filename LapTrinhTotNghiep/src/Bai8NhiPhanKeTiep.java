import java.util.Scanner;

public class Bai8NhiPhanKeTiep {

    static class Result {
        String nextBinary;
        boolean end;

        public Result(String nextBinary, boolean end) {
            this.nextBinary = nextBinary;
            this.end = end;
        }
    }

    public static Result nextBinary(String binary) {
        char[] chars = binary.toCharArray();
        // begin là vị trí duyệt để tất cả phần tử sau nó đc set = 0
        int begin = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (chars[i] == '0') {
                chars[i] = '1';
                begin = i + 1;
                break;
            }
        }
        for (int i = begin; i < chars.length; i++) {
            chars[i] = '0';
        }
        return new Result(new String(chars), begin == 0);
    }

    public static void printBinaryToEnd(String binaryBegin) {
        Result result;
        do {
            result = nextBinary(binaryBegin);
            binaryBegin = result.nextBinary;
            System.out.println(binaryBegin);
        } while (!result.end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        sc.nextLine();

        while (loop-->0) {
            printBinaryToEnd(sc.nextLine());
        }
    }

}
