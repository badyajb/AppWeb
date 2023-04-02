package Isamm;
import java.util.ArrayList;

public class GestionMessage {
	
	public static ArrayList<Message> list = new ArrayList<Message>();
	
	
	
	public static void ajouterMessage(Message m)
	{	
		list.add(m);
	}

	public static ArrayList<Message> getList() {
		return list;
	}

	public static void setList(ArrayList<Message> list) {
		GestionMessage.list = list;
	}
	
	public static boolean chercher(String ch)
	{
		boolean test=false;
		for (Message m:GestionMessage.getList())
		{
			
			if(m.getValue().compareTo(ch)==0)
			{
				test=true;
			}
			
		}
		return test;
	}

	
	
}
