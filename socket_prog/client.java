import java.io.*;
import java.net.*;

class clienttest{
    public static void main(String[] args){
	try{
	    Socket s =new Socket("localhost",6666);
	    DataOutputStream dis =new DataOutputStream(s.getOutputStream());
	    dis.writeUTF("hello");
	    dis.flush();
	    s.close();
	    }

	catch(Exception e){
	    System.out.println(e);
	}
}
}
