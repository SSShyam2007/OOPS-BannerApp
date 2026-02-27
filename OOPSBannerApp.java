public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = createO();
        String[] p = createP();
        String[] s = createS();

        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "   " + o[i] + "   " + p[i] + "   " + s[i]);
        }
    }

    static String[] createO() {
        return new String[]{
                " OOO ",
                "O   O",
                "O   O",
                "O   O",
                " OOO "
        };
    }

    static String[] createP() {
        return new String[]{
                "PPPP ",
                "P   P",
                "PPPP ",
                "P    ",
                "P    "
        };
    }

    static String[] createS() {
        return new String[]{
                " SSS ",
                "S    ",
                " SSS ",
                "    S",
                " SSS "
        };
    }
}