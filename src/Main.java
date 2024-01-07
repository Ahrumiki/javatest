import java.awt.desktop.SystemEventListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.printf("Hello and welcome!");
        System.out.println("Hello");
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }
        Person person = new Person("bruh", 64);
        System.out.println(person.getAge() + person.getName());

    }
}