public class Fila extends CreatingQueue {
    private boolean IsQueueEmpty = true;
    private int HowManyInQueue;

    public boolean CheckQueue(){
        if (queue.length != 0) {
            IsQueueEmpty = false;
        }
        return IsQueueEmpty;
    }

    public int CountQueue(){
        for(int i=0;i<queue.length;i++){
            HowManyInQueue = i + 1;
        }
        return HowManyInQueue;
    }
}
