public class hollow_triangle {
    public static void main(String[] args) {
        System.out.println(" holo triangle");
for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
              if(i==5 || k==2*i-1 || k==1 ){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
        }
            System.out.println();
        }
    }   
}
