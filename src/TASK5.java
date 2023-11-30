public class TASK5 {
    public static void main(String[] args) {
        System.out.println(repFirstChar("test"));
    }

    public static String repFirstChar(String s) {
        char c = s.charAt(0);

        if (c >= 'A' && c <= 'Z') {
            return "upper";
        } else if (c >= 'a' && c <= 'z') {
            return "lower";
        } else if (c >= '0' && c <= '9') {
            return "digit";
        } else {
            return "other";
        }
    }
}
