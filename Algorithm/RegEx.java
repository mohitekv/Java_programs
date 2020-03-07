import java.util.regex.*;
import java.util.*;

class RegEx {
    public static void main(String arg[]) {
        String string = "Hello <<name>>, We have your full name as <<full_name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz XX/XX/XXXX.";
        System.out.println(string);
        Scanner scanner = new Scanner(System.in);
        String words[] = string.split(" ");

        // regex pattern declaration
        Pattern pattern_user_name = Pattern.compile("<<name>>,");
        Pattern pattern_full_name = Pattern.compile("<<full_name>>");
        Pattern pattern_mobile_number = Pattern.compile("91-xxxxxxxxxx.");
        Pattern pattern_date = Pattern.compile("XX/XX/XXXX.");

        string = "";
        System.out.println();
        System.out.println("Please enter valid ");

        for (int i = 0; i < words.length; i++) {

            // matcher variables to match with patterns.
            Matcher matcher_user_name = pattern_user_name.matcher(words[i]);
            Matcher matcher_full_name = pattern_full_name.matcher(words[i]);
            Matcher matcher_mobile_number = pattern_mobile_number.matcher(words[i]);
            Matcher matcher_date = pattern_date.matcher(words[i]);

            if (matcher_user_name.matches()) {
                System.out.println("Enter user name");
                String user_name = scanner.nextLine();
                words[i] = user_name + ",";
            }
            if (matcher_full_name.matches()) {
                System.out.println("Enter user full name");
                String full_name = scanner.nextLine();
                words[i] = full_name;
            }
            if (matcher_mobile_number.matches()) {
                System.out.println("Enter user Mobile number");
                String mobile_number = scanner.nextLine();
                words[i] = "91-" + mobile_number + ".";
            }
            if (matcher_date.matches()) {
                System.out.println("Enter user Mobile number");
                long millis = System.currentTimeMillis();
                java.sql.Date date = new java.sql.Date(millis);
                words[i] = date + ".";
            }
            string += words[i] + " ";
        }
        System.out.println(string);
    }
}