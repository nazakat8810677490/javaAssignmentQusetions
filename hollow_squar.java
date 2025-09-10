public class hollow_squar {
    public static void main(String[] args) {
        System.out.println(" holo squar pattern");
           for(int i=0; i<5; i++){  
            for(int j=0; j<5; j++){
                if(i<=0 ||i>=4){
                System.out.print("*");
                }
                else if(j==0||j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    
}
