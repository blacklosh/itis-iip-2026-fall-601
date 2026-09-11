import java.util.Scanner;

public class Main4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Введи число, и я возведу его в квадрат:");
    int n = sc.nextInt();
    int square = n * n;
    System.out.println("Держи квадрат " + square);
  }
}
