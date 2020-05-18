import java.util.Arrays;
import java.util.Collections;

public class ArraysSample {
    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 10;

        //printArray(sortArray(getIntegers()));
        reverse();
    }

    private static Integer[] getIntegers(){
        Integer[] myIntArray1 = {106, 26, 81, 5, 16, 73};
        return  myIntArray1;
    }

    private static Integer[] sortArray(Integer[] array){
        Arrays.sort(array, Collections.reverseOrder());
        return array;
    }

    private static void printArray(Integer[] array){
        for (int i=0; i < array.length; i++){
            System.out.println("Value: " + array[i]);
        }
    }

    private static void reverse(){
        int[] array = {1,5,3,7,11,9,15};
        int maxIndex = array.length - 1;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length/2; i++){
            System.out.println(i);
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
