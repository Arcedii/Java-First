package src;
import java.util.Scanner;
public class Array {
    public static void main(String[] args)
    {
        /*nt[] nums = new int[5];
       nums[0] = 45;
       nums[1] = 46;
       nums[2] = 44;
       nums[3] = 43;
       nums[4] = 42;
       int res = nums[1] + nums[4];
       System.out.println(res);

       float[] nums2 = new float[] {1.0f,3.23f,3.6645345f,4.453543252f,5434343f};
        System.out.println(nums2[0]);
        for (int i = 1; i < nums2.length; i++) {
            System.out.println("Element: " + nums2[i]);
        }
        */
          EnterMembers();
    }

    public static void EnterMembers(){
          int[] arr = new int[4];
           Scanner scan = new Scanner(System.in);
           System.out.println("Введите 4 числа :" );
        for (int i = 0; i < arr.length; i++) {
            int value = scan.nextInt();
            arr[i] = value;
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
             if(arr[i] < min){
                 min = arr[i];
             }
        }
        System.out.println("Minimal: " + min );

    }
}
