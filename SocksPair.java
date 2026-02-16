import java.util.HashMap;
import java.util.Arrays;
class SocksPair{
    public static void main (String[] args){
        int[] socks = {10,20,20,10,10,30,50,10,20};
        int n = socks.length;
        int pair = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(socks[i]))
            {
                map.put(socks[i],map.get(socks[i])+1);
            }
            else
            {
                map.put(socks[i],1);
            }
        }
        for(int i:map.values())
        {
            pair += i/2;
        }
        System.out.println(pair);

        pair = 0;
        Arrays.sort(socks);
        for(int i=0;i<n-1;i++)
        {
            if(socks[i] == socks[i+1])
            {
                pair++;
                i+=2;
            }
        }
        System.out.println(pair);
    }
}