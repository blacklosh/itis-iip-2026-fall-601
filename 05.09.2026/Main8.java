
public class Main8 {

  public static void main(String[] args) {
    int n = 6;

    int res = 1;
    int i = 1;
    for (;;) {
	res = res * i;
        i = i + 1;
        if (i > n) {
		break;
	}
    }

    System.out.println(n + "! = " + res);
  }
}
