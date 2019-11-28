package chess.main;

import java.util.Scanner;

import chess.command.Dispatcher;

/**
 * 
 * @description   程序入口  	 
 * @author        BananaOrange
 * @date          2019年11月29日
 */
public class Launcher {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                Dispatcher.dispatchCommand(in.next());
            }
            in.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
