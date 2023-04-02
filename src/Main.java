public class Main {
    public static boolean isValidClassName(String className) {
        if (className == null || className.length() != 7) {
            return false;
        }
        char firstChar = className.charAt(0);
        if (firstChar != 'C' && firstChar != 'A' && firstChar != 'P') {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            char c = className.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        char lastChar = className.charAt(6);
        if (lastChar != 'G' && lastChar != 'H' && lastChar != 'I' && lastChar != 'K' && lastChar != 'L' && lastChar != 'M') {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] classNames = {"C0318G", "M0318G", "P0323A"};

        for (String className : classNames) {
            if (isValidClassName(className)) {
                System.out.println(className + " is valid");
            } else {
                System.out.println(className + " is invalid");
            }
        }
    }
}
