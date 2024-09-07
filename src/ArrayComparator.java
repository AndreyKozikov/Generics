import java.util.Arrays;

public class ArrayComparator {

    public static <T> boolean compareArrays(T[] array1, T[] array2){
        if (array1.length != array2.length) {
            return false;
        }

        return Arrays.equals(array1, array2);
    }

    // Перегруженные методы для сравнения массивов примитивных типов
    public static boolean compareArrays(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean compareArrays(double[] array1, double[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean compareArrays(char[] array1, char[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean compareArrays(boolean[] array1, boolean[] array2) {
        return Arrays.equals(array1, array2);
    }
}
