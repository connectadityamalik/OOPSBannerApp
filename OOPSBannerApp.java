import java.util.HashMap;
public class OOPSBannerApp {

    /**
     * Initializes a HashMap with character patterns.
     * @return HashMap containing character patterns
     */
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();
        charMap.put('O', new String[]{
                "  *** ", " * * ", " * * ", " * * ", " * * ", " * * ", "  *** "
        });
        charMap.put('P', new String[]{
                " **** ", " * * ", " * * ", " **** ", " * ", " * ", " * "
        });
        charMap.put('S', new String[]{
                "  **** ", " * ", " * ", "  *** ", "     * ", "     * ", " **** "
        });
        charMap.put(' ', new String[]{
                "       ", "       ", "       ", "       ", "       ", "       ", "       "
        });
        return charMap;
    }

    /**
     * Renders the banner for the given message using the character map.
     * @param message the String message to display
     * @param charMap the HashMap containing the patterns
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        int patternHeight = 7; 
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();
            for (char ch : message.toCharArray()) {
                // Retrieves pattern or defaults to space if character is missing
                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                sb.append(pattern[line]).append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    /**
     * Main method to orchestrate the map creation and banner rendering.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}