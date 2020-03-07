import java.util.*;

class magic_number {
    public static int guess_number(int start, int mid, int last) {

        mid = (start + (last - start) / 2);
        int result = mid;

        // checking if mid value last value and start value are same the it will the
        // given number
        if (mid == last || mid == start) {
            return result;
        } else {
            System.out.println("If number is between " + start + " to " + mid + " then press 'y' or press'n'");

            Scanner scanner = new Scanner(System.in);
            char choice = scanner.next().charAt(0);

            if (choice == 'y' || choice == 'Y') {

                // if its in first half the make mid value its last value
                last = mid;
                // recursion to check the result
                result = guess_number(start, mid, last);
            } else if (choice == 'n' || choice == 'N') {

                // if its in second half then make mid value as start value
                start = mid + 1;
                // recursion to check the result
                result = guess_number(start, mid, last);
            } else {
                // if user gives wrong input ask again
                System.out.println("give a proper input:");
                result = guess_number(start, mid, last);
            }
        }
        return result;
    }

    public static void main(String arg[]) {
        int start = 1;
        int last = 100;
        int mid = 0;
        int number_guess = guess_number(start, mid, last);
        System.out.println("Number you guessed is: " + number_guess);

    }
}