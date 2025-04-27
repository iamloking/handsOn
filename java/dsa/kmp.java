package dsa;
import java.util.*;
class KMP{

    static void constructLPS(String pat, int[] lps){
        int len=0;
        int i=1;
        int m = pat.length();

        while(i<m){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=len;
                    i++;
                }
            }
        }
    }
    static ArrayList<Integer> search(String pat, String txt) {
        int n = txt.length();
        int m = pat.length();

        int[] lps = new int[m];
        ArrayList<Integer> res = new ArrayList<>();

        constructLPS(pat, lps);

        // Pointers i and j, for traversing
        // the text and pattern
        int i = 0;
        int j = 0;

        while(i<n){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            else{
                if(j!=0){
                    j=lps[j-1];

                }
                else{
                    i++;
                }
            }
            if(j==m){
                res.add(i-j);
                j=lps[j - 1];
            }
        }


        return  res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String pat = sc.nextLine();

        ArrayList<Integer> res = search(pat, txt);
        for (int i = 0; i < res.size(); i++)
            System.out.print(res.get(i) + " ");
        sc.close();
    }
}