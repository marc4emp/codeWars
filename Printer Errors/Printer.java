public class Printer {
    public static String printerError(String s) {

        char[] colors = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};
        int colorErrors = 0;

        char sAsChar[] = s.toCharArray();

        for (int i = 0; i< s.length(); i++) {

            boolean areEquals = true;

            for (int j = 0; j< colors.length; j++) {

                if (colors[j] == sAsChar[i]) {
                    areEquals = false;
                    break;
                }
            }
            if (areEquals) {
                colorErrors++;
            }
        }
        String totalErrors = (colorErrors + "/" + s.length());

        return totalErrors;
    }
}
