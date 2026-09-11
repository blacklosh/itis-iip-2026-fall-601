import java.util.Scanner;

public class Main5 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Привет! Как тебя зовут?");
    String name = sc.nextLine();
    System.out.println("А сколько тебе лет?");
    int age = sc.nextInt();

    if (age < 18) {
      System.out.println("Ну ты и врун, " + name + "!");
    } else {
      System.out.println("Привет, " + name + "! "
        + "Тебе " + age + " лет)))");
    }
  }
}
