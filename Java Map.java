import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        
        Map<String , Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            map.put(name,phone);
            in.nextLine();
        }
        
        
        while(in.hasNext())
        {
            String s=in.nextLine();
            if( map.containsKey(s))
                System.out.println(s + "=" + map.get(s) );
            else
                System.out.println("Not found");
        }
    }
}
