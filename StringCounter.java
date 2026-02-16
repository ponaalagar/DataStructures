import java.util.*;

class StringCounter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//add characters in map while converting them into small case
		//declare a string with vowels use them to count the characters in the given sentence
		//print the count for const = tot_count - vowels count & vowels count &  count for that seperate character


		System.out.println("enter the sentence : ");
		String str = sc.nextLine();
		
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);

		Map<Character, Integer> dict = new HashMap<>();


		//add the dictionary 
		for(char i:str.toCharArray()){
			if(Character.isLetter(i)){
				char lch = Character.toLowerCase(i);
			dict.put(lch,dict.getOrDefault(lch,0)+1);
			}
		}

		String vow = "aeiou";


		int tc = 0;
		int vc = 0;
		for(char i:vow.toCharArray()){
			vc+=dict.getOrDefault(i,0);
		}
for (Integer count : dict.values()) {
            tc += count;
        }
		System.out.println(" constants : " +(tc-vc));
		System.out.println(" vowels : "+vc);
		System.out.println("count for "+ch+" = " +dict.getOrDefault(ch,0));
	}
}
			
