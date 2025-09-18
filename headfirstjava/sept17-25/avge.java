
public class avge {
    public static void main(String[] args) {
        int[] arr = {10, 20,89,5,23,74 ,30,11,34, 40,543, 50};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;  
        System.out.println("Average of array elements: " + average);
    }
}

