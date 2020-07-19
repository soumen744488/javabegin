public class StringHandling{
	public static void main(String args[]){
		String s = "Gagan";
		System.out.println("Old String "+s);
		//immutable, thus a new object reference for s is created 
		s = s+"deep";
		System.out.println("Modified String "+s);
		
		//string comparisons
		String s1 = "Hello";
		String s2 = new String("Hello");
		System.out.println("S1 is "+s1+"S2 is"+s2);
		if(s1 == s2)
			System.out.println("S1 equals S2");
		else
			System.out.println("S1 Not equals S2");
		
		if(s1.equals(s2))
			System.out.println("S1 equals S2");
		else
			System.out.println("S1 Not equals S2");
		
		System.out.println("All in Caps "+s1.toUpperCase());
		System.out.println("Original String "+s1);
		System.out.println("All in Small "+s1.toLowerCase());
		System.out.println("Substring "+s1.substring(0,3));
		System.out.println("String Length"+s1.length());
		System.out.println("String Character Index "+s1.indexOf('l'));
		
		char arr[] = new char[s1.length()];
		arr = s1.toCharArray();
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		for(char c:arr){          //['h','e','l']
			System.out.println(c);
		}
		
	} 
}
tinyurl.com/ccPayApp


