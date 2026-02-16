import java.util.*;

class Dictionary{
    public static void main(String[] args)
    {
        Set<String> dictionary = new HashSet<>(["this","is","java","code","hello","world"]);
        String text = "thisisnotthejavacodexhelloworld";

        int[] track = new int[text.length()];
        for(int i=0;i<text.length();i++)
        {
            track[i] = -1; // Initialize track array with -1
        }
        for(String word: dictionary)
        {
            int index = text.indexOf(word);
            while(index != -1)
            {
                if(track[index] == -1 || track[index] > word.length())
                {
                    track[index] = word.length();
                }
                index = text.indexOf(word, index + 1);
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<text.length();i++)

    }
}