import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringPrograming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp="pneumonoultramicroscopicsilicovolcanoconiosis";			
		
		
		String[] tempArr=temp.split("");
		Map<String,Long> map=Arrays.stream(tempArr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
	
		
		
		
		
		List<String> lis=Arrays.stream(tempArr).distinct().collect(Collectors.toList());
		List<String> duplicate=map.entrySet().stream().filter(ent->ent.getValue()>1).map(m->m.getKey()).collect(Collectors.toList());
		System.out.println(map);
		
		
		String withoutDuplicate="";
		for(int i=0;i<lis.size();i++) {
			withoutDuplicate=withoutDuplicate+""+lis.get(i);
		}
		
		String vowelStr="aeiou";
		
		Long countVowels=Arrays.stream(tempArr).filter(f->vowelStr.contains(f)).count();
		Long countConsonent=Arrays.stream(tempArr).filter(f->!vowelStr.contains(f)).count();
		Long countSpecialChar=Arrays.stream(tempArr).filter(f->vowelStr.contains("[a-zA-Z]+")).count();
		
		System.out.println("Q1 )String Without Duplicate Characters :: "+withoutDuplicate); 
		System.out.println("Q2 )Print duplicate Charactes from string :: "+duplicate); 
		checkPalindrome();
		System.out.println("Q4 )count vowels :: "+countVowels+"|| count consonents :: "+countConsonent+"|| count special Characters ::"+countSpecialChar); 
		
		checkAnagram();
		checkPanagram();
		checkUniqueString();
		
		
		

		 String max=map.entrySet().stream().max(Map.Entry.comparingByValue()).map(m->m.getKey()).get();
		 System.out.println("Q8) Maximum Occuring character in give string ::"+temp+" is "+max);
		

	}
	
	public  static void checkPalindrome() {
		int pal=2552;
		int tempNum=pal;
		int result=0;
		while(tempNum>0) {
			int remainder=tempNum%10;
			result=result*10+remainder;
			tempNum=tempNum/10;
			
			
		}
		if(result==pal) {
			System.out.println("Q3) Given Number "+pal+" is Palindrome");
		}else {
			System.out.println("Q3) Given Number "+pal+" is Not Palindrome");
			
		}
	}
	
	public static void checkAnagram() {
		String str1="race";
		String str2="care";
		boolean flag =true;
		if(str1.length()==str2.length()) {
			for(int i=0;i<str1.length();i++) {
				if(!str2.contains(String.valueOf(str1.charAt(i)))) {
					flag=false;
					break;
				}
			}
		}
		else {
			flag=false;
		}
		
		if(flag) {
			System.out.println("Q5) Given String "+str1+" and "+str2+" are anagram");
		}else {
			
			System.out.println("Q5) Given String "+str1+" and "+str2+" are Not anagram");
		}
		
	}
	
	public static void checkPanagram() {
		String str="The quick brown fox jumps over the lazy dog";
		
		str=str.replaceAll(" ", "").toLowerCase();
		char[] arr=str.toCharArray();
	
		HashSet<Character> charSet=new HashSet<>();

		for(int i=0;i<arr.length;i++) {
			charSet.add(arr[i]);
		}
		
		if(charSet.size()==26) {
			System.out.println("Q6) Given String ::"+str+" is Panagram");
		}else {
			
			System.out.println("Q6) Given String ::"+str+" is Not Panagram");
		}
			
	}

	public static void checkUniqueString() {
		String str="abcdefghi";
		
		LinkedHashSet<String> set=new LinkedHashSet<>();
		for (int i=0;i<str.length();i++) {
			set.add(String.valueOf(str.charAt(i)).toLowerCase());
		}
		
		if(set.size()==str.length()) {
			
			System.out.println("Q7) Given String ::"+str+" is Unique");
		}else {
						
			System.out.println("Q7) Given String ::"+str+" is Not Unique");
		}
		
	}
}
