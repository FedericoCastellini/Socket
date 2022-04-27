
import socket.Server;

public class AvvioServer 
{
    public static void main(String[] args) {
        Server s=new Server(2000);    
        s.ascolto();
        s.scrivi("Connessione con il server");
        s.leggi();
    }
}
