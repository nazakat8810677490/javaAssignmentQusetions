public class floyd_triangle {
    public static void main(String[] args) {
        int n=5;
        System.out.println("Floyd's Triangle ");
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
