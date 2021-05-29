import java.util.Scanner;

public class Bai1FibonacciN {

    //Viết chương trình tính số Fibonacci thứ n (với n không quá 92)	4

    public static void main(String[] args) {
        long[] fibonaccis = new long[93];

        fibonaccis[1] = 1;
        fibonaccis[2] = 1;

        for (int i=3; i<fibonaccis.length; i++) {
            fibonaccis[i] = fibonaccis[i-1] + fibonaccis[i-2];
            System.out.println(fibonaccis[i]);
        }

        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        while (amount-- > 0) {
            int index = sc.nextInt();
            System.out.println(fibonaccis[index]);
        }

    }

}
