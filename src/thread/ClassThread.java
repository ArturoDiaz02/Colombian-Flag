package thread;

import model.*;

public class ClassThread extends Thread{

    private Cursor cursor;

    public ClassThread(Cursor cursor) {
        this.cursor = cursor;
        
    }
    
    @Override
    public void run(){

        cursor.move();

    }
  
}