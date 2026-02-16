import java.util.Arrays;

class Platform{
    public static void main(String[] args) {
        int[]  arrival = {900,940,950,1100,1500,1800};
        int[]  departure = {910,1200,1120,1130,1900,2000};
        int n = arrival.length;
        int platform = 1;
        /*
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arrival[i] < arrival[j] && departure[i] > arrival[j]){
                    platform++;
                }
            }
        }*/
       //two pointer approach 

       Arrays.sort(arrival);
       Arrays.sort(departure);
       
       int i=1,j = 0;
       while(i<n && j<n)
       {
        if(arrival[i] < departure[j])
        {
            platform++;
            i++;
        }
        else
        {
            platform--;
            j++;
        }
       }
        System.out.println(platform);
        int p =0;
        System.out.println((p++));
        return ;
    }
}