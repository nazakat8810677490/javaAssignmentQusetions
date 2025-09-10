public class inverted_number_triangle {
    public static void main(String[] args) {
        int n=5;
        System.out.println("Inverted Number Triangle ");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
