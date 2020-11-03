import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PDFReviewer {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        Map<Character, Integer> wordMap = new HashMap<Character, Integer>();
        int maxHeight = 0;
        int area=0;
        int index=0;
        for(int i=97;i<=122;i++){
         wordMap.put((Character)(char)i,h[index]);
         index++;  
        }
        
        for(int i=0;i<word.length();i++){
            if(maxHeight < wordMap.get(word.charAt(i)))
                maxHeight = wordMap.get(word.charAt(i));
        }
        
        area = maxHeight*word.length(); 
        
        return area;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {    

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);       

        System.out.println(result);
    }
}
