public class PlayButtonPattern {
    public static void main(String[] args) {
        for (int i = 1; i <=7 ; i++) {
            for (int j = 1; j <= 4 ; j++) {
                if(i > 4 && j <= 8-i){
                    System.out.print("*");
                }
                else if (i <= 4 && j <= i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
