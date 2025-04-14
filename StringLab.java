import java.util.Scanner;

public class StringLab {
    public static void main(String[] args) {
        // Task 1: String Methods
        String str = " Welcome to the Java String Lab! ";

        // length()
        System.out.println("Length: " + str.length());

        // charAt()
        System.out.println("Character at index 7: " + str.charAt(7));

        // substring()
        System.out.println("Substring 'Java': " + str.substring(str.indexOf("Java"), str.indexOf("Java") + 4));

        // toUpperCase and toLowerCase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // indexOf()
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // contains()
        System.out.println("Contains 'Lab': " + str.contains("Lab"));

        // replace()
        System.out.println("Replace 'Java' with 'Java Programming': " + str.replace("Java", "Java Programming"));

        // split()
        System.out.println("Split by spaces:");
        String[] words = str.split(" ");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }

        // trim()
        System.out.println("Trimmed string: '" + str.trim() + "'");

        // equals and equalsIgnoreCase
        String compareStr = "java string lab!";
        System.out.println("Equals: " + str.equals(compareStr));
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(compareStr));

        // Task 2: Loop Challenges

        // Count vowels using a for loop
        int vowelCount = 0;
        String lowerStr = str.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            char c = lowerStr.charAt(i);
            if ("aeiou".indexOf(c) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Vowel count: " + vowelCount);

        // Check for palindrome using a while loop
        String word = "racecar";
        int start = 0;
        int end = word.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println(word + " is a palindrome: " + isPalindrome);

        // Do...While loop: Input validation
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter a sentence that contains the word 'Java': ");
            input = scanner.nextLine();
        } while (!input.contains("Java"));
        System.out.println("Thank you!");

        // Task 3: StringBuilder operations
        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java");
        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        sb.delete(sb.indexOf("Learning"), sb.indexOf("Learning") + "Learning".length());
        System.out.println("StringBuilder result: " + sb);
        System.out.println("Reversed StringBuilder: " + sb.reverse());

        // Task 4: StringBuffer operations
        StringBuffer sbf = new StringBuffer("Multithreading Lab");
        sbf.append(" - Learning Java");
        sbf.insert(sbf.indexOf("Lab") + 3, " is fun");
        sbf.delete(sbf.indexOf("Learning"), sbf.indexOf("Learning") + "Learning".length());
        System.out.println("StringBuffer result: " + sbf);
        System.out.println("Reversed StringBuffer: " + sbf.reverse());

        scanner.close();
    }
}
