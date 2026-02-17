
public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {
        // 1. Get the patterns for each letter using helper methods
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // 2. Loop through the arrays and print the combined banner
        // We assume all patterns have the same height (7 lines)
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + oPattern[i] + pPattern[i] + sPattern[i]);
        }
    }

    // Helper Method for Letter O
    public static String[] getOPattern() {
        return new String[] {
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        };
    }

    // Helper Method for Letter P
    public static String[] getPPattern() {
        return new String[] {
            " PPPP   ",
            " P   P  ",
            " P   P  ",
            " PPPP   ",
            " P      ",
            " P      ",
            " P      "
        };
    }

    // Helper Method for Letter S
    public static String[] getSPattern() {
        return new String[] {
            "  SSSS  ",
            " S      ",
            " S      ",
            "  SSS   ",
            "     S  ",
            "     S  ",
            " SSSS   "
        };
    }
}