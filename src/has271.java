public class has271 {
  public boolean has271(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] ==  nums[i + 1] - 5 && (Math.abs((nums[i + 2] + 1) - nums[i]) <=2)) {
        return true;
      }
    } return false;
  }
}
