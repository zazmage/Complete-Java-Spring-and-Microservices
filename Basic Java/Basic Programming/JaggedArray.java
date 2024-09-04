import java.util.Random;

public class JaggedArray {
    public static void main(String[] args) {

        // In Java the array is an object therefore is inside the heap memory.
        int nums[][] = new int[3][];
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];

        // int test[] = new int[]; // This is not allowed

        for (int i = 0; i<3; i++) {
            for (int j = 0; j<nums[i].length; j++) {
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for ( int i = 0; i<nums.length; i++) {
            for (int j = 0; j<nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }


        int[][][] nums1 = new int[3][][];

        nums1[0] = new int[2][];
        nums1[0][0] = new int[3];
        nums1[0][1] = new int[2];

        nums1[1] = new int[1][];
        nums1[1][0] = new int[4];

        nums1[2] = new int[2][];
        nums1[2][0] = new int[1];
        nums1[2][1] = new int[3];

        Random rand = new Random();

        // Populate the array with random values
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1[i].length; j++) {
                for (int k = 0; k < nums1[i][j].length; k++) {
                    nums1[i][j][k] = rand.nextInt(10); // Random values between 0 and 9
                }
            }
        }

        // Print the array
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1[i].length; j++) {
                for (int k = 0; k < nums1[i][j].length; k++) {
                    System.out.print(nums1[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
