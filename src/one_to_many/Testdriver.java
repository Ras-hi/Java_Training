package one_to_many;
import java.util.Scanner;
public class Testdriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of posts :");
		int size=sc.nextInt();
		User u1= new User(size,"Ramesh");
		boolean flag =true;
		while(flag) {
			System.out.println("Enter 1 to add post\nEnter 2 to display posts\nEnter 3 to exit ");
			int choice =sc.nextInt();
			switch(choice) {
				case 1:
					sc.nextLine();
					System.out.println("Enter user id: ");
					int id =sc.nextInt();
					sc.nextLine();
					System.out.println("Enter post description: ");
					String des=sc.nextLine();
					Post posts=new Post(id,des);
					u1.addPost(posts);
					break;
				case 2:
					u1.displayPosts();
					break;
				case 3:
					flag=false;
					break;
			}
		}
	}
}
