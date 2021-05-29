import java.util.ArrayList;
import java.util.Arrays;

public class Bai10HoanViNguoc {

    // nếu end (không có thay đổi thứ tự cấu hình) return true
    // tìm cấu hình tiếp theo của hoán vị ( tìm số kết thúc dãy tăng dần từ phải qua trái)
    public static boolean next(int[] arr) {
        int i;
        for (i = arr.length - 1; i > 0; i--) {
            if (arr[i - 1] < arr[i]) {
                break;
            }
        }
        if (i == 0) return true;

        // tìm số vừa đủ lớn hơn và đổi chỗ
        for (int j = arr.length - 1; j >= i; j--) {
            if (arr[j] > arr[i -1]) {
                int temp = arr[j];
                arr[j] = arr[i -1];
                arr[i-1] = temp;
                break;
            }
        }

        Arrays.sort(arr, i, arr.length);
        return false;
    }

    public static int[] generateBegin (int n) {
        int[] result = new int[n];
        for (int i=0; i<n; i++)
            result[i] = i + 1;
        return result;
    }

    public static String arrToString(int[] arr) {
        String result = "";
        for (int i=0; i<arr.length; i++)
            result += arr[i];
        return result;
    }

    public static void main(String[] args) {
        int[] input = generateBegin(3);
        StringBuilder result = new StringBuilder(arrToString(input));
        while (!next(input)) {
            result.insert(0, arrToString(input) + ",");
        }
        System.out.println(result);
    }

}
