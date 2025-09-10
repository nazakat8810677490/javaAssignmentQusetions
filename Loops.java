// 1 to 18;

class loops{
  public static void main(String[] args) {
    
int n=5;
System.out.println("squar pattern");
 for (int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(" *");
            }   
            System.out.println("\n");
        }

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

        System.out.println(" left slide squar pattern");
for(int i=0; i<5; i++) {
        for(int j=0; j<i; j++){
            System.out.print("*");
        }
         System.out.print("\n");
     }  
 System.out.println(" right slide squar pattern");
for(int i=0; i<5; i++){
        for(int j=0; j<i; j++){
            System.out.print(" ");
        }
        for(int k=0; k<5; k++){
            System.out.print("*");
        }
        System.out.print("\n");
     }

      System.out.println(" triangle pattern");
for(int i=0; i<5; i++){
        for(int j=5-i; j>0; j--){
            System.out.print(" ");
            
        }
        for(int k=0; k<5; k++){
            System.out.print("*");
        }
        System.out.print("\n");
        
     }

      System.out.println(" inverted right triangle");
for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
        }
            System.out.println();
        }

         System.out.println("inverted triangle");
 for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int k=5+1-i; k>=1; k--) {
                System.out.print("*");
        }
            System.out.println();
        }
 System.out.println(" holo time shap ");
for(int i = 5; i>=1; i--) {
            for (int j = 1; j <=5-i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=2*i-1; k++) {
                System.out.print("*");
        }
            System.out.println();
        }

         System.out.println("inverted left triangle");
 for(int i = 5; i>=1; i--) {
            for (int j = 1; j <=5-i; j++) {
                System.out.print("  ");
            }
            for (int k=1; k<=2*i-1; k++) {
                if(i==5 || k==2*i-1 || k==1 ){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
        }
            System.out.println();
        }
        
         System.out.println(" right triangle");
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
  System.out.println(" left slide squar pattern");
for(int i=5; i>0; i--) {
        for(int j=0; j<i; j++){
            System.out.print("*");
        }
         System.out.print("\n");
     }    

for(int i=1; i<5; i++){
        for(int j=5-i; j>1; j--){
            System.out.print(" ");
        }
        for(int k=1; k<=i; k++){
            System.out.print("*");
        }
    System.out.println();
     }   

System.out.println("\n--- Pattern 13: Inverted Pyramid ---");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 14: Diamond ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 15: Number Triangle ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 16: Inverted Number Triangle ---");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 17: Repeated Numbers ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("\n--- Pattern 18: Floyd's Triangle ---");
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