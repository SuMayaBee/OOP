public class EncrytionUtil {

    public static String encrypt(String password) {
        int shift = 2;
        return password.substring(shift) + password.substring(0, shift);
    }

    public static String decrypt (String password) {
        int shift = password.length() - 2;
        return password.substring(shift) + password.substring(0, shift);
    }
}
