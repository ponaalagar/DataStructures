interface work{
void workable();
}

interface eat{
void eatable();
}


class robot implements work{
public void workable(){
System.out.println("It will do work");
}
}

class man implements work,eat{
public void workable(){
System.out.println("it will do work");
}

public void eatable(){
System.out.println("it will eat");
}

}

class Isp{
public static void main(String[] args)
{
	work r = new robot();
	eat m = new man();
	//work m = new man();
	
	r.workable();
	//m.workable();
	m.eatable();
}
}

