import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    TimerThread tt;
    ServerSocket ss;
    Socket so;
    BufferedWriter bw;
    BufferedReader br;
    private Object bw;
   public Server(int porta){
        try {
            ss=new ServerSocket(porta);
            System.out.println("Server avviato ed in ascolto");    
                       ss.setSoTimeout(50000);                                            
       tt=new TimerThread(2000);
       tt.start();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

   public void ascolto(){
        try {
            so=ss.accept();
             System.out.println("Connessione Stabilita");               
             br=new BufferedReader(new InputStreamReader(so.getInputStream()));           
             bw=new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);     
        }

   }
    public void scrivi(String messaggio){
        try {
            bw.write(messaggio+"\n");               
            bw.flush();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
    public String leggi(){
        String messaggioritorno="";
        try {
            messaggioritorno=br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        return messaggioritorno;      
    }


}
