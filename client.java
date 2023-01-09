import java.io.*;
import java.net.*;
import java.util.*;

public class client {
    public static void main(String args[]) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            DataInputStream dis = new DataInputStream(s.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Username:");
            String str = br.readLine();
            dos.writeUTF(str);
            System.out.println("Enter Password:");
            String str1 = br.readLine();
            dos.writeUTF(str1);
            String str2 = dis.readUTF();
            System.out.println("Server:" + str2);

            s.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
