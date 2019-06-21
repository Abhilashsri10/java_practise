package occurance2;

import java.util.LinkedHashSet;
import java.util.Set;

public class occ2Nd {
    int []arr=new int[255];
    Set<Character> cs=new LinkedHashSet<Character>();
    public void secOcc(String s){
        int flag=0;

        for(char c:s.toCharArray())
            this.cs.add(c);
        for(char ch:cs){
            for (char c1 : s.toCharArray())
                if (ch==c1) {
                    arr[c1]++;
                }
        }
        for(char c:cs){
            if(flag==0 && arr[c]==2)flag=1;
            else if(flag!=0 && arr[c]==2) {
                System.out.println(c);
                //return c;
            }
        }
    //return '\0';
    }
}
