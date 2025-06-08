import java.util.*;

class CountDigit {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(digits2(n));
  }

  public static int digits(int n){
    int count= 0;
    while (n>0){
      n = n/10;
      count++;
    }
    return count;
  }

  public static int digits2(int n){
    int count = (int)(Math.log10(n)) + 1;
    return count;
  }
}
