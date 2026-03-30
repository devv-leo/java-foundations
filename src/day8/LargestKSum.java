package day8;

public class LargestKSum {
    
    public static boolean findLargestKSum(int[] arr, int k) {
        if (arr.length < k) {
            return false;
        }
        
        int maxSum = 0;
        int index = 0;

        for (int i = 0; i < k; i++) {
            maxSum = maxSum + arr[i];
        }

        int currentSum = maxSum;

        for (int i = k; i < arr.length; i++) {
            currentSum = currentSum - arr[i - k] + arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                index = i - k + 1;
            }
        }

        for (int i = index; i < index + k; i++) {
            System.out.print(arr[i]);
            if (i < index + k - 1) {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findLargestKSum(new int[]{1, 5, 6, 9, 3, 2}, 3));
    }
}
