package model;

public class Cursor {
    
    private final String ESC   = "\u001b[";
    private final String RESET = "\u001B[0m";
    private final int MAX = 100;
    private int width = 1;
    private int high;
    private int y;
    public String backGround;
    private long sleep;

    public Cursor(int high, int y, String backGround, long sleep) {
        this.high = high;
        this.y = y;
        this.backGround = backGround;
        this.sleep = sleep;
    }
	
	public synchronized void move() {
		char ch = ' ';

        while(width <= MAX){

            for(int i = 0; i < high; i++ ){
              
                System.out.print(ESC + String.valueOf(width) + "G" + ESC + String.valueOf(y + i) + "d" + backGround + ch);
                System.out.print(RESET);
               
                try {
                    Thread.sleep(sleep);
                    
                } catch (InterruptedException e) {
                    e.printStackTrace();
    
                }
               
            }

            width++;

        }

        System.out.print("\u001b[" + "0G" + "\u001b[" + "28d");

	}

}
