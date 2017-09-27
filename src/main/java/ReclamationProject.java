/*
 * The following code needs firstString lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 *  This class contains a method which returns the largest similar
 *  set of characters shared between the two strings.
 */
public class ReclamationProject {
    /**
     *
     * @param firstString - a string input.
     * @param secondString - another string input, which will be compared to firstString
     * @return the largest similar set of characters shared between the two strings.
     */
    public static String largestSharedChar(final String firstString, final String secondString) {
        String reclaim = ""; //this will be the returned set of shared characters
        //this for loop will go through all possible and valid indices
        //of the two strings and also possible lengths of characters
        //that they can share to determine the largest set of characters that the two strings share.
        for (int firstStart = 0; firstStart < firstString.length(); firstStart++) {

            for (int num = firstString.length() - firstStart; num > 0; num--) {
                for (int secondStart = 0;
                        secondStart < secondString.length() - num; secondStart++) {
                    if (firstString.regionMatches(firstStart, secondString, secondStart, num)
                            && num > reclaim.length()) {
                        reclaim = firstString.substring(firstStart, firstStart + num);
                    }

                }
            }
        }
        return reclaim;
    }
    /**
     * runs the method largestSharedChar.
     * @param args - is a part of the call to the main method
     */
    public static void main(final String[] args) {
        System.out.println(largestSharedChar("The man loves her", "Theads loved the man."));
    }
}