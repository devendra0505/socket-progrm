import java.io.*;
import java.net.*;

class servertest{
    public static void main(String[] args) throws Exception{
	ServerSocket ss = new ServerSocket(6666);
	Socket s = ss.accept();
	DataInputStream dis = new DataInputStream(s.getInputStream());
	DataOutputStream dis1 = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str1 = "",str2="";
	while(!str1.equals("stop")){
	    str1=(String)dis.readUTF();
	    System.out.println("client says:"+str1);
	    str2=br.readLine();
	    dis1.writeUTF(str2);
            dis1.flush();
	}

	ss.close();
	s.close();
	dis.close();
	dis1.close();
	
		 
    }
}
