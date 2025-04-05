package StringBuffer_Builder;

public class Rashi {
	public static void main(String[] args) {
		// Creating StringBuffer object without passing an argument
        StringBuffer sb = new StringBuffer();

        // append() - Adds text at the end
        sb.append("Hello");
        System.out.println("After append: " + sb);

        // insert() - Inserts text at a specific index
        sb.insert(5, " World");
        System.out.println("After insert: " + sb);

        // replace() - Replaces characters from start index to end index
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        // delete() - Deletes characters from start index to end index
        sb.delete(5, 9);
        System.out.println("After delete: " + sb);

        // reverse() - Reverses the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // length() - Returns the length of the StringBuffer
        System.out.println("Length: " + sb.length());

        // capacity() - Returns the current capacity
        System.out.println("Capacity: " + sb.capacity());

        // setCharAt() - Modifies a character at a specified index
        sb.setCharAt(0, 'H');
        System.out.println("After setCharAt: " + sb);

        // ensureCapacity() - Ensures a minimum capacity
        sb.ensureCapacity(50);
        System.out.println("New Capacity after ensureCapacity(50): " + sb.capacity());

        // substring() - Extracts a substring
        String sub = sb.substring(1, 4);
        System.out.println("Substring (1,4): " + sub);

        // charAt() - Returns a character at the specified index
        char ch = sb.charAt(2);
        System.out.println("Character at index 2: " + ch);

        // indexOf() - Finds the first occurrence of a substring
        int index = sb.indexOf("lo");
        System.out.println("Index of 'lo': " + index);

        // lastIndexOf() - Finds the last occurrence of a substring
        int lastIndex = sb.lastIndexOf("l");
        System.out.println("Last Index of 'l': " + lastIndex);

        // deleteCharAt() - Deletes the character at a specific index
        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt(0): " + sb);
        
        /* sb.append("Hello"), sb.insert(4,arr,1,2);arr=['a','b','c','d']
         * sb.insert(index of sb, array , offset index, no of characters to insert from arr*/ 
		
	}
}
// go with string builder as it is asynchronous 
//then we can convert it back to string 
//String s= new String(sb) and vice versa 
