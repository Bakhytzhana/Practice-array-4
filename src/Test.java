public class Test {
    public static void main(String[] args) {
        int positiveCount = 0;
        int negativeCount = 0;
        int[] nums = {7, -3, 9, -11, 18, 99, 2, 11};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positiveCount += 1;
            } else {
                negativeCount += 1;
            }
        }
        System.out.println("Положительных элементов: " + positiveCount);
        System.out.println("Отрицательных элеменотов: " + negativeCount);
    }
}