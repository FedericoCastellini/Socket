public class TimerThread implements Runnable{
    private int tempo;
    public TimerThread(int t){
        this.tempo=t;
    }
    @Override
    public void run(){
        for(int i=tempo; i>0;i--)
        {
            try {
                System.out.println("Secondi rimasti: "+i);
                sleep(1000);
            } catch (InterruptedException ex) { 
                Logger.getLogger(TimerThread.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        Thread t=new Thread();
    }

    void start() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
