package day13;

import java.util.ArrayList;
import java.util.List;
/** Создать соц сеть воот */
public class User {
	private String usarename;
	private List<User> subscribeption;

	public User(String usarename) {
		this.usarename = usarename;
		this.subscribeption = new ArrayList<>();
	}

	public void subscribe(User user){
		this.subscribeption.add(user);
	}

	public String getUsarename() {
		return usarename;
	}

	public List<User> getSubscribeption() {
		return subscribeption;
	}

	public boolean isSubscribe(User user){
		for (User currentUser : subscribeption ){
			if (currentUser.getUsarename().equals(user.getUsarename()))
				return true;
		}
		return false;
	}

	public boolean isFriend(User user) {
		return this.isSubscribe(user) && user.isSubscribe(this);
	}

	public void sendMessage(User user, String text){
		MessageDataBase.addNewMessage(this, user, text);
	}

	public String toString(){
		return usarename;
	}
}
