import java.util.Arrays;

public class Zadanie2 {
    public static void main(String[] args){
        int[] nums;
        nums = new int[1001];
        int sum;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%3==0 && nums[i]%5!=0){
                sum=nums[i]%10+nums[i]%100/10+nums[i]%1000/100;
                if (sum<10){
                    System.out.println(nums[i]);
                }
            }
        }
    }
}
