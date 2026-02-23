interface Message{
	void send();
}

class Email implements Message{
public void send(){
	System.out.println("email sended");
}
}

class Sms implements Message{
public void send(){
	System.out.println("sms sended");
}
}

class Notification {

Message m ;
Notification(Message m){
	this.m = m;
}

public void sendnotification(){
	m.send();
}
}



class Dip{
public static void main(String[] args)
{
	/*Message em = new Email();
	Message sm = new Sms();
	em.send();
	sm.send();*/
	
	Notification n = new Notification(new Email());
	n.sendnotification();

}
}


