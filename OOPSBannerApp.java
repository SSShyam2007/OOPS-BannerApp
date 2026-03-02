public class OOPSBannerApp {

    // Class to store character and its pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }

        public char getCharacter() {
            return character;
        }
    }

    public static void main(String[] args) {

        // Pattern for O
        CharacterPattern O = new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // Pattern for P
        CharacterPattern P = new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        // Pattern for S
        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        // Banner letters
        CharacterPattern[] banner = {O, O, P, S};

        // Print banner
        for (int i = 0; i < 7; i++) {
            String line = "";

            for (CharacterPattern cp : banner) {
                line = line + cp.getPattern()[i] + "  ";
            }

            System.out.println(line);
        }
    }
}