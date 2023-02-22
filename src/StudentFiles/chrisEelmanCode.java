package StudentFiles;

public class chrisEelmanCode {
    //Copy everything from here down, except the final bottom '}'
    //Then copy that into a new file titled with your name, example: JohnSmith.java
    public static void main(String[] args) {

    }

    //Website: https://edabit.com/challenge/QCgoxbd32BqFr6AY7
    public static String fizzBuzz(int n) {
        boolean divisibleByThree = false;
        boolean divisibleByFive = false;

        if (n % 3 ==0){
            divisibleByThree = true;
        }
        if (n % 5 ==0){
            divisibleByFive = true;
        }
        if (divisibleByThree && divisibleByFive){
            return "FizzBuzz";
        }else if (divisibleByThree){
            return "Fizz";
        }else if (divisibleByFive){
            return "Buzz";
        }else  {
            return Integer.toString(n);
        }
    }

    //Website: https://edabit.com/challenge/rzpucPyoyEtXPo2BG
    public static int[] arrayOfMultiples(int num, int length) {

        int[] answer = new int[1000]; //Sample line so code executes


        return answer;
    }

}
