import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args){
        int[] nums;
        Random rnd = new Random();
        nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rnd.nextInt(1000) + 1;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int targetNum = sc.nextInt();
        int index = Arrays.binarySearch(nums, targetNum);
        if (index >= 0) {
            System.out.println("Индекс числа в массиве: " + index);
        } else {
            int insertionPoint = -index - 1;
            System.out.println("Индекс, куда можно вставить число: " + insertionPoint);
        }
    }
}
