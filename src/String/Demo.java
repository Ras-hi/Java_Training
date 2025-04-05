package String;

public class Demo {
	 public static void main(String[] args) {
//		String s1="Hello";
//		String s2= new String("Hello");
//		char[]arr= {'h','e','l','l','o'};
//		String s3= new String(arr);
//		System.out.println(s1+s2+s3);
		//case 1 
//		String s1="hello";
//		String s2="hello";
//		System.out.println(s1==s2);
		//Why true ? because string literal gets stored in string constant pool and there duplicates are not allowed so the address is same
//		 String s1="hello";
//		 String s2="Hello";
//		 System.out.println(s1.equals(s2));
//		 String s1=new String("Hello");
//		 String s2=new String ("Hello");
//		 System.out.println(s1.equals(s2));
//		 String s1="hello";
//		 s1=s1+" World";
		 //stored 
		 	
		// Creating a String object without passing an argument
	        String str = "";

	        // Assigning a value
	        str = "Hello";
	        System.out.println("Initial String: " + str);

	        // concat() - Adds text at the end
	        str = str.concat(" World");
	        System.out.println("After concat: " + str);

	        // replace() - Replaces all occurrences of a character
	        str = str.replace("World", "Java");
	        System.out.println("After replace: " + str);

	        // substring() - Extracts a portion of the string
	        String sub = str.substring(6, 10);
	        System.out.println("Substring (6,10): " + sub);

	        // toUpperCase() - Converts to uppercase
	        String upper = str.toUpperCase();
	        System.out.println("Uppercase: " + upper);

	        // toLowerCase() - Converts to lowercase
	        String lower = str.toLowerCase();
	        System.out.println("Lowercase: " + lower);

	        // length() - Returns the length of the string
	        System.out.println("Length: " + str.length());

	        // charAt() - Returns the character at a specified index
	        char ch = str.charAt(4);
	        System.out.println("Character at index 4: " + ch);

	        // indexOf() - Finds the first occurrence of a character or substring
	        int index = str.indexOf("Java");
	        System.out.println("Index of 'Java': " + index);

	        // lastIndexOf() - Finds the last occurrence of a character or substring
	        int lastIndex = str.lastIndexOf("a");
	        System.out.println("Last index of 'a': " + lastIndex);

	        // equals() - Checks if two strings are equal
	        boolean isEqual = str.equals("Hello Java");
	        System.out.println("Equals 'Hello Java': " + isEqual);

	        // equalsIgnoreCase() - Checks equality ignoring case
	        boolean isEqualIgnoreCase = str.equalsIgnoreCase("hello java");
	        System.out.println("EqualsIgnoreCase 'hello java': " + isEqualIgnoreCase);

	        // startsWith() - Checks if the string starts with a prefix
	        boolean startsWith = str.startsWith("Hello");
	        System.out.println("Starts with 'Hello': " + startsWith);

	        // endsWith() - Checks if the string ends with a suffix
	        boolean endsWith = str.endsWith("Java");
	        System.out.println("Ends with 'Java': " + endsWith);

	        // contains() - Checks if a string contains a substring
	        boolean contains = str.contains("Java");
	        System.out.println("Contains 'Java': " + contains);

	        // trim() - Removes leading and trailing spaces
	        String strWithSpaces = "   Trim Example   ";
	        System.out.println("Before trim: '" + strWithSpaces + "'");
	        System.out.println("After trim: '" + strWithSpaces.trim() + "'");

	        // split() - Splits the string into an array
	        String[] words = str.split(" ");
	        System.out.print("Split result: ");
	        for (String word : words) {
	            System.out.print(word + " | ");
	        }
	        System.out.println();

	        // toCharArray() - Converts string into character array
	        char[] charArray = str.toCharArray();
	        System.out.print("toCharArray result: ");
	        for (char c : charArray) {
	            System.out.print(c + " ");
	        }
	        System.out.println();

	        // valueOf() - Converts different types to String
	        int num = 100;
	        String numStr = String.valueOf(num);
	        System.out.println("ValueOf int 100: " + numStr);
		 
	}
}
