public class FizzBuzz {
    public static String FizzBuzz(int i){
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(i);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(FizzBuzz(i));
        }
    }
}