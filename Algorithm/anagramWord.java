import java.util.Arrays;
import java.util.Scanner;

public class anagramWord {

    public static void main(String arg[])
    {
        Scanner s = new Scanner(System.in);
        int flg = 0;
        System.out.println(" Enter words:");
        String word1 = s.nextLine();
        String word2 = s.nextLine();
        char w1[] = new char[word1.length()];
        char w2[] = new char[word2.length()];
        word1 = word1.replaceAll("\\s", "");
        word2 = word2.replaceAll("\\s", "");  
        if (word1.length() != word2.length())
        {
            System.out.println("words are not anagram:");
        }
        else
        {
            word1 = word1.toLowerCase();
            word2 = word2.toLowerCase();
            for(int i=0;i<word1.length();i++)
            {
                w1[i] = word1.charAt(i);
                w2[i] = word2.charAt(i);
            }
            Arrays.sort(w1);
            Arrays.sort(w2);
            for(int i=0;i<w1.length;i++)
            {
                if (w1[i] == w2[i]) {
                    flg = 1;
                } else {
                    flg = 0;
                    break;
                }
            }
            if(flg==1)
                System.out.println("Words are anagram");
            else
                System.out.println("words are not anagram");
        }
    }
}