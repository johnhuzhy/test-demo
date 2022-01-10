public class JbInput {
    public static String aa = "aaaaaa";
    public static String bb = "bbbbbb";
    public static int a1 = 33;
    public static int b1 = 56;

    public static void main(String[] args) {
        System.out.println(aa);
    }

    private static int getMax(int s1, int s2) {
        if (s1 > s2) {
            return s1;
        } else {
            return s2;
        }
    }
}
