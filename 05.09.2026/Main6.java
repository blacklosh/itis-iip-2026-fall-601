
public class Main6 {

  public static void main(String[] args) {
    int n = 6;

    int res = 1;
    for (int i = 1; i <= n; i++) {
	res = res * i;
    }

    System.out.println(n + "! = " + res);
  }
}
