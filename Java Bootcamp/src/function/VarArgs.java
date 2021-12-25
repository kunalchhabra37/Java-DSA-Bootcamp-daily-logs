package function;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        names("Kunal","Harshit");
        marks(90,95);
    }
    static void names(String ...a){
        System.out.println(Arrays.toString(a));
    }
    static void marks(int ...m){
        System.out.println(Arrays.toString(m));
    }
}
