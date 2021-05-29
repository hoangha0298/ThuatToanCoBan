import java.util.Arrays;

public class Bai9HoanViKeTiep {

    // thao tác trực tiếp với input arr nên chỉnh luôn nội dung arr
    // nếu end trả về true
    public static boolean next(int[] arr) {
        // i là vị trí kết thúc dãy tăng từ phải qua trái
        int i;
        for (i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) break;
        }
        if (i == 0) return true;

        // vị trí vừa đủ lớn hơn số ở vị trí i + 1
        int j;
        for (j = arr.length - 1; j >= i; j--) {
            if (arr[j] > arr[i - 1]) break;
        }

        int temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        Arrays.sort(arr, i, arr.length);
        return false;
    }

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(x));
        while (!next(x)) {
            System.out.println(Arrays.toString(x));
        }

    }

}
