package StudentFiles;
public class BrettW {
    public static void main(String[] args) {
        fizzBuzz(15);
    }

    //Website: https://edabit.com/challenge/QCgoxbd32BqFr6AY7
    public static String fizzBuzz(int n) {
        if(n % 3 == 0 && 5 % n == 0){
            System.out.println("FizzBuzz");
        }else if(n % 3 ==0){
            System.out.println("Fizz");
        }else if(n % 5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(n);
        }
        return "sample answer";
    }

    //Website: https://edabit.com/challenge/rzpucPyoyEtXPo2BG
    public static int[] arrayOfMultiples(int num, int length) {

        int[] answer = new int[1000]; //Sample line so code executes


        return answer;
    }
}
