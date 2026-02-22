public class OOPSBannerApp {

    /**
     * Inner class for storing character-to-pattern mappings
     */
    public static class CharacterPatternMap {
        Character character;
        String[] pattern;

        /**
         * Constructs a CharacterPatternMap
         * @param character the character to be mapped
         * @param pattern the ASCII art pattern representation
         */
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * @return the character associated with this pattern map
         */
        public Character getCharacter() {
            return this.character;
        }

        /**
         * @return the pattern array representing the character
         */
        public String[] getPattern() {
            return this.pattern;
        }
    }

    /**
     * Creates and initializes CharacterPatternMap array
     * @return array of CharacterPatternMap objects containing character patterns
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];
        
        // Uniform 7-character width applied to prevent alignment warping
        charMaps[0] = new CharacterPatternMap('O', new String[]{
                "  *** ", " * * ", " * * ", " * * ", " * * ", " * * ", "  *** "
        });
        charMaps[1] = new CharacterPatternMap('P', new String[]{
                " **** ", " * * ", " * * ", " **** ", " * ", " * ", " * "
        });
        charMaps[2] = new CharacterPatternMap('S', new String[]{
                "  **** ", " * ", " * ", "  *** ", "     * ", "     * ", " **** "
        });
        charMaps[3] = new CharacterPatternMap(' ', new String[]{
                "       ", "       ", "       ", "       ", "       ", "       ", "       "
        });
        return charMaps;
    }

    /**
     * Retrieves the ASCII pattern for a given character safely.
     * @param ch the character to look up
     * @param charMaps the array of CharacterPatternMap objects
     * @return the pattern array for the given character, or space pattern if not found
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            // Defensive null check and primitive comparison
            if (map.getCharacter() != null && map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return charMaps[3].getPattern(); 
    }

    /**
     * Prints a message as a banner using ASCII art patterns
     * @param message the message string to be displayed
     * @param charMaps the array of CharacterPatternMap objects
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                line.append(pattern[i]).append(" ");
            }
            System.out.println(line.toString());
        }
    }

    /**
     * Main method Entry point
     * @param args command line arguments
     */
    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}