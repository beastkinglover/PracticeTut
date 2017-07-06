import java.util.*;

public class Solution {
    public static boolean canWin(int leap, int[] game) {
        int cont1s = 0;
        int maxcount = 0;
        boolean decision = true; 
           for(int i=0; i<(game.length); i++){
               if(game[i] == 1) cont1s++;
               if(cont1s > maxcount){ maxcount = cont1s; }
               if(maxcount >= leap) { decision = false; } 
               if(game[i] == 0){ cont1s=0; }
        } 
       return decision;   
     }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
