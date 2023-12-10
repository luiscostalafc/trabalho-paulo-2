import java.util.Arrays;

public class MaioresQue {
    public static int maioresQue(int[] array, int val) {
        if (array.length == 0) {
            return 0;
        } else {
            int count = array[0] > val ? 1 : 0;
            return count + maioresQue(Arrays.copyOfRange(array, 1, array.length), val);
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(maioresQue(array, 3)); // Deve imprimir 2
        System.out.println(maioresQue(array, 5)); // Deve imprimir 0
        System.out.println(maioresQue(array, 0)); // Deve imprimir 5
    }
}