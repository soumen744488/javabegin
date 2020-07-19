public class IncrDecr{
	public static void main(String args[]){
			int i= 1;
			i = i++ + i++;
			System.out.println("I is "+i);
			i = 1;
			i = ++i + ++i;
			System.out.println("I is "+i);
			i = 1;
			i = i++ + --i;
			System.out.println("I is "+i);
			i = 1;
			i = --i + i++;     //  1 + 0
			System.out.println("I is "+i);
			i = 1;
			i = --i + i++ + i++;     //  1 + 0  + 1
			System.out.println("I is "+i);
			i = 1;
			i = --i - --i + ++i;     //  (-1) - (-1)  + 0
			System.out.println("I is "+i);
			i = 1;
			i = i++ - i++ + --i;     //  1 - 2  + 2
			System.out.println("I is "+i);
			i = 1;
			i = --i - i-- + ++i;     //  (-1) - 0  + 0
			System.out.println("I is "+i);
			i = 1;
			i = i++ - --i - i--;     //  1 - 1  - 1
			System.out.println("I is "+i);
			i = 1;
			i = i++ + i-- - ++i;     //  1 + 2  - 2
			System.out.println("I is "+i);
			i = 1;
			i = (((i++ - i--) + ++i) - i++);  // 1 - 2  + 2 - 2
			System.out.println("I is "+i);
			
	}
}