public class Arrays {
    public static void main(String[] args) {
        int i = 5;
        int j = 6;
        int k = 7;

        int nums[] = {5,7,2,4};
        int nums1[] = new int[3];

        nums[1] = 6;

        nums1[0] = 5;
        nums1[1] = 6;
        nums1[2] = 7;

        System.out.println(nums[1]);
        System.out.println(nums1[0]);
        System.out.println(nums1[1]);
        System.out.println(nums1[2]);

        for (int x = 0; x < nums.length; x++) {
            System.out.println(nums[x]);
        }

        
    }
}
