import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

import javax.print.DocFlavor.STRING;

import java.io.*;

public class server {
    public static void main(String args[]) throws Exception {
        try {
            HashMap<String, String> map = new HashMap<String, String>();
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String str = dis.readUTF();
            String str1 = dis.readUTF();
            map.put("Anirudh", "1234");
            map.put("Admin", "1234");
            String a = map.get(str);
            if (a.equals(str1)) {
                dos.writeUTF("grant ACCess");
            } else {
                dos.writeUTF(" ACCess denied");
            }

            ss.close();
            s.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}