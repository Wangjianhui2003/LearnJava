//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 1, 4, 6, 3, 5, 8};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j <= array.length - 2; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int j : array) {
            System.out.print(j);
        }
    }
}