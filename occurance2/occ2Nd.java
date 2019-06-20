//package occurance2;

import java.util.HashSet;

public class occ2Nd {
    char []arr=new char[255];
    HashSet<Character> cs=new HashSet<Character>();
    public char secOcc(String s){
        int flag=0;
        for(char c:s.toCharArray())
            this.cs.add(c);
        for(char c:cs){
            for(char c1:s.toCharArray()){
                if(c==c1) arr[c]++;
            }
        }
        for(char c2:cs){
            if(flag==0 && arr[c2]==2)flag=1;
            if(flag!=0 && arr[c2]==2)return c2;
        }

    return '\0';
    }
}
