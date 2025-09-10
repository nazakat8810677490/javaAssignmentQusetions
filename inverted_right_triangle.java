public class inverted_right_triangle {
    public static void main(String[] args) {
        System.out.println("inverted right triangle");
 for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int k=5+1-i; k>=1; k--) {
                System.out.print("*");
        }
            System.out.println();
        }
    }
}
