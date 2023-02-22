package StudentFiles;

public class LizaKim {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fizzBuzz(n));

    }

    //Website: https://edabit.com/challenge/QCgoxbd32BqFr6AY7
    public static String fizzBuzz(int n) {
        //multiple of 3
        if (n % 3 == 0) {
            return "Fizz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        }
        if (n % 5 == 0 && n % 3 == 0) {
            return "FizzBuzz";
        } else {
            return String.valueOf(n);
        }
    }
}
