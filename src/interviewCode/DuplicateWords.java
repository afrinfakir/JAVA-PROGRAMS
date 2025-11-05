package interviewCode;

public class DuplicateWords {
    public static void main(String[] args) {
        String input = "This is a test This is only a test";
        
        // Convert the input string to lowercase to handle case insensitivity
        input = input.toLowerCase();
        
        // Split the string into words
        String[] words = input.split(" ");

        System.out.println("Duplicate words are:");

        // Outer loop - go through each word
        for (int i = 0; i < words.length; i++) {
            int count = 1;  // Initialize count for each word
            
            // Skip empty words (after marking duplicates)
           // if (words[i].equals(""))
              //  continue;
            
            // Inner loop - compare current word with other words
            for (int j = i + 1; j < words.length; j++) {
                // If a duplicate is found
                if (words[i].equals(words[j])) {
                    count++;
                    // Mark duplicate word as empty to avoid counting it again
                   // words[j] = "";
                }
            }
            
            // If count is more than 1, it's a duplicate
            if (count > 1) {
                System.out.println(words[i] + "---------" + count);
            }
        }
    }
}
