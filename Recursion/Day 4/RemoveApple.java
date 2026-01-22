public class RemoveApple {

    public static String remove(String str) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith("apple")) {
            return remove(str.substring(5));
        }

        return str.charAt(0) + remove(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(remove("abcappledef"));
    }
}
