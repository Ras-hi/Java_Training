package one_to_many;

public class User {
	Post[] posts ;
	String userName;
	static int cnt =0;
	public User(int size, String userName) {
		this.posts=new Post[size];
		this.userName=userName;	
	}
	public void addPost(Post p) {
		if(cnt<posts.length) {
			posts[cnt++]=p;
			System.out.println("Post uploaded");
		}
		else {
			System.out.println("Cannot post , the array is full.");
		}
	}
	public void displayPosts() {
		for(int i =0;i<cnt;i++) {
			System.out.println(posts[i].postid+"\n"+posts[i].postDn);
		}
	}
	public void updatepost(){//by id
			
	}
}
