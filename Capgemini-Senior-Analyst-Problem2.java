// Alex is having a problem with his keyboard. If he is pressing any key, he is getting one or more occurrences of that character Example: If he wants to write hey, his kayboord say with hey hhey, hhey, hey, hhheyyy, or some other combination of the characters pressed by him.
// You are given a string s typed by Alex. Your task is to find out the number of possible strings Alex was trying to type and print the sam Output can be very large. Print (number of way % 1007). Where % is the modular operator,


// Input format:
// The input consists of a single line:
// The line contains the string s.
// The input will be read from the STDIN by the candidate


// Output format:
// Print the number of possible strings Alex was trying to type and print the same with module 1007, The output will be matched to the candidate's output printed on the STDOUT


// Constraints:
// • 1 < Length of string < 500


// Example:
// Input:
// "abbb"
// Output:
// 3
// Explanation
// The given string is "abbb" hence the possible strings that Alex might be trying to type are "ab", "abb", and "abbb".






class javaprac{
    public static String capgeminniAlex(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        char currchar = word.charAt(0);
        int longestStart = 0;
        int longestLength = 0;
        int currstart = 0;
        int currlength = 1;
        for (int ix = 1; ix < word.length(); ix++) {
            if (word.charAt(ix) == currchar) {
                currlength++;
            } else {
                if (currlength > longestLength) {
                    longestStart = currstart;
                    longestLength = currlength;
                }
                currchar = word.charAt(ix);
                currstart = ix;
                currlength = 1;
            }
        }
        if (currlength > longestLength) {
            longestStart = currstart;
            longestLength = currlength;
        }
        return word.substring(longestStart, longestStart + longestLength);
    }
    public static void main(String[] args) {
        String s = "abbb";
        System.out.println(capgeminniAlex(s).length());
    }
}
