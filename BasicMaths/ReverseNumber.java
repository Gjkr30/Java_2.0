import java.util.*;

class ReverseNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int tribute = Integer.MAX_VALUE;
    System.out.println(tribute);
    System.out.println(tribute + 5000);

  }

  public static int reverse(int x){
    int ans = 0;
        int n = x;
        if (x < 0){
            n = Math.abs(n);
        }
        while (n > 0){
            ans = ans*10 + n%10;
            n=n/10;
        }
        if (x<0){
            ans = ans * -1;
        }
        return ans;
  }
}
