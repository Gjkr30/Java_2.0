class Patter {
  public static void main(String[] args) {
    //patter1(5);
    patter8(5);
  }

// Simple star Patter.
  public static void patter1(int n) {
    for (int i=0;i<n;i++){
      for (int j=0;j<n;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void patter2(int n) {
    for (int i=0;i<n;i++){
      for (int j=0;j<=i;j++){
        System.out.print(i+1);
      }
      System.out.println();
    }
  }
  public static void patter3(int n) {
    for (int i=0;i<n;i++){
      for (int j=0;j<n-i;j++){
        System.out.print(j+1);
      }
      System.out.println();
    }
  }
  public static void patter4(int n) {
    for (int i=1;i<=n;i++){
      for (int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      for (int j=1;j<=2*i-1;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void patter5(int n) {
    for (int i=1;i<=n;i++){
      for (int j=n;j>n-i+1;j--){
        System.out.print(" ");
      }
      for (int j=1;j<=2*(n-i)+1;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void patter6(int n){

    // combine pattern 4 and pattern 5
    patter4(n);
    patter5(n);
  }

  public static void patter7 (int n){

    for (int i=1;i<=n;i++){
      for (int j=1;j<=i;j++){
        System.out.print((i+j+1)%2 + " ");
      }
      System.out.println();
    }
  }

  public static void patter8(int n) {
    for (int i=0;i<n;i++){
      for (int j=0;j<=i;j++){
        System.out.print((char)(65+j));
      }
      System.out.println();
    }
  }
}
