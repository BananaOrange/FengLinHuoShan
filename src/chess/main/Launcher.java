package chess.main;

import java.util.Scanner;

import chess.command.Dispatcher;
import chess.test.PrintCommandAll;
import chess.test.PrintCommandNewest;

/**
 * 程序入口	 
 * @author        BananaOrange
 * @date          2019年11月30日
 */
public class Launcher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
    	String command = in.nextLine();
    	//PrintCommandAll.PrintCommand(command);
    	//PrintCommandNewest.PrintCommand(command);
            Dispatcher.dispatchCommand(command);
        }
        in.close();
    }
}
