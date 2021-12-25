package function;

public class Shadow {
    public static int x = 10;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 20;
        System.out.println(x);
        shadow();
    }

    private static void shadow() {
        System.out.println(x);
    }

}
