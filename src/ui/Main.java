package ui;

import thread.*;
import model.*;

public class Main {

    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    private static ClassThread thread1;
    private static ClassThread thread2;
    private static ClassThread thread3;

    public static void main(String[] args){
        thread1 = new ClassThread(new Cursor(14, 0, YELLOW_BACKGROUND, 10));
        thread2 = new ClassThread(new Cursor(7, 14, BLUE_BACKGROUND, 26));
        thread3 = new ClassThread(new Cursor(7, 21, RED_BACKGROUND, 33));

        System.out.print("\u001b[2J");//Clear screen

        thread1.start();
        thread2.start();
        thread3.start();



	}

}
        



    


