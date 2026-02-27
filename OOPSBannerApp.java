public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
            String.join("", " OOO ", "   ", "OOOO", "   ", "OOOO"),
            String.join("", "O   O", "   ", "O   O", "   ", "O   O"),
            String.join("", "O   O", "   ", "OOOO", "   ", "OOOO"),
            String.join("", "O   O", "   ", "O     ", "   ", "O"),
            String.join("", " OOO ", "   ", "O     ", "   ", "OOOO")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}