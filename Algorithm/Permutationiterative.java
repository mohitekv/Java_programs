import java.util.Scanner;

class Permutationiterative {
    public static void swap(char array[], int i, int j) {
        char temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public static void reverse(char array[], int i, int j) {
        while (i < j) {
            swap(array, i++, j--);
        }
    }

    public static void permutation(String string, int length) {
        if (string.length() == 1) {
            System.out.println(string);
        } else {
            char array[] = string.toCharArray();
            while (true) {
                System.out.print(String.valueOf(array) + "  ");
                int i = length - 1;
                while (array[i - 1] >= array[i]) {
                    if (--i == 0) {
                        return;
                    }
                }
                int j = length - 1;
                while (j > i && array[j] <= array[i - 1]) {
                    j--;
                }
                swap(array, i - 1, j);
                reverse(array, i, length - 1);

            }
        }
    }

    public static void main(String arg[]) {
        System.out.println("Enter a string to find permutation using iteration:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Permutation of String");
        permutation(string, string.length());
    }
}