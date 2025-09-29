public class perfnum {
    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false; 
        }
        int sumOfDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { 
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors == number;
    }
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 28;
        int num3 = 12;
        System.out.println(num1 + " is a perfect number: " + isPerfectNumber(num1)); 
        System.out.println(num2 + " is a perfect number: " + isPerfectNumber(num2)); 
        System.out.println(num3 + " is a perfect number: " + isPerfectNumber(num3)); 
    }
}

