public class Fila extends CreatingQueue {

    private boolean IsQueueEmpty = true;
    private int HowManyInQueue;

    public Fila(int size) {
        super(size);
    }

    public void IsQEmpty(){
        if (getQueue() != null && getQueue().length > 0) {
            IsQueueEmpty = false;
        } else {
            IsQueueEmpty = true;
        }
    }

    public int CountQueue(){
        HowManyInQueue = 0;
        if (getQueue() != null) {
            for(int i=0; i<getQueue().length; i++){
                if (getQueue()[i] != null) {
                    HowManyInQueue++;
                }
            }
        }
        return HowManyInQueue;
    }

    public boolean getIsQueueEmpty() {
        return IsQueueEmpty;
    }

    public int getHowManyInQueue() {
        return HowManyInQueue;
    }
}