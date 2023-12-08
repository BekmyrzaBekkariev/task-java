package day13;

public class test {
	public static void main(String[] args) {
		User user1 = new User("user1");
		User user2 = new User("user2");

		user1.sendMessage(user2, "Hi");
		user1.sendMessage(user2, "Hell");

		user2.sendMessage(user1, "i'm fine");
		user2.sendMessage(user2, "GOOD!");

		user1.sendMessage(user1, "DDD!");




		MessageDataBase.showDialog(user1,user1);
	}
}
