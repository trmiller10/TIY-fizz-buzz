public class FizzBuzz {
    public static void main(String[] args) throws Exception {

        // Start with 1, increase by 1, to 100
        for(int x = 1 ; x <= 100 ; x++){

            // Determine if the remainder of 'x' is 0 when divided by 15 (divisible by both 5 and 3)
            // Moved in front of Fizz and Buzz loops to make sure 'FizzBuzz' gets printed instead of 'Buzz'
            if(x % 15 == 0){

                // Print 'FizzBuzz' if above is true
                System.out.print("FizzBuzz ");

                // Return to incrementing 'x'
                continue ;
            }

            // Determine if the remainder of 'x' is 0 when divided by 3 (divisible by 3)
            if(x % 3 == 0){

                // Print 'Fizz' if above is true
                System.out.print("Fizz ");

                // Return to incrementing 'x'
                continue ;
            }

            // Determine if the remainder of 'x' is 0 when divided by 5 (divisible by 5)
            if(x % 5 == 0){

                // Print 'Buzz' if above is true
                System.out.print("Buzz ");

                // Return to incrementing 'x'
                continue ;
            }


            // Print non-3,5,15 divisible integers
            System.out.print(x + " ");
        }

    }
}