package javaSessions;

public class occurenceofcharacters {
	
	public static String processString(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        String result = "";
        int[] Count = new int[256]; // ASCII characters

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);//g
            Count[currentChar]++;//count[g]++-->1
            result =result+ currentChar + String.valueOf(Count[currentChar]);
        }

        return result;
    }

    public static void main(String[] args) {
        //String input = "good";
        String output = processString("good");
       // System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
