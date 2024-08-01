public class Q_19 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};

        System.out.println("All combinations:");
        
		for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println(nums[i] + " " + nums[j]);
                for (int k = j + 1; k < nums.length; k++) {
                    System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);

				}
			}
		}
	}
}

