package main.java.lesson3;

public class G_System_formating {
    public static void main(String[] args) {
        String greet = "Hello %s, my name is %s and my age is %d";

        System.out.println("Hello");
        System.out.print("Hello");
        System.out.print(" Dude");

        System.out.println(greet);
        System.out.printf(greet, "Oleg", "Habibi", 69);
        System.out.println();
        System.out.printf(greet, "Popo", "Dudu", 14);
        System.out.println();
        System.out.printf(greet, "Reet", "Lola", 45);
        System.out.println();

        System.out.println("Hello\\ \n\"Vova\"\tROFL ");
    }
}
