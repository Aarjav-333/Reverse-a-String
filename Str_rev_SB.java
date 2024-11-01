import java.util.Scanner;

public class String_Reverse_method {
    public static void main(String[] args) {
        StringBuilder in = new StringBuilder("Hello, World!");
        System.out.println(in.reverse());
        System.out.println();
        StringBuilder out = new StringBuilder();
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String out1 = sc.nextLine();
        out.append(out1);
        out = out.reverse();
        System.out.println(out);
        sc.close();
    }
}
