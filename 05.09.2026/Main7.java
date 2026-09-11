
public class Main7 {

  public static void main(String[] args) {
    int n = 6;
    int n1 = n;
    int res = 1;
    while (n > 1) {
	res = res * n;
	n = n - 1;
    }

    System.out.println(n1 + "! = " + res);
  }
}
