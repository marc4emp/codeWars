public class Solution {

    public static boolean validatePin(String pin) {

        try {
            int pinToInt = Integer.parseInt(pin);
        }
        catch (NumberFormatException e)
        {
            return false;
        }

        if (pin.length() == 4 || pin.length() == 6) {
            return true;
        } else return false;
    }
}
