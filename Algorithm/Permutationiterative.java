import java.util.Scanner;

class Permutationiterative {
    public static void permutation(String string)
    {
        if(string.length()==1)
        {
            System.out.println(string);
        }
    }
    public static void main(String arg[])
    {
        System.out.println("Enter a string to find permutation using iteration:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Permutation of String");
        permutation(string);
    }
}