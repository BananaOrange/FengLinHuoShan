package chess.command;

/**
 * @description   指令处理类,处理"quit"指令,返回"bye"后退出程序 	 
 * @author        BananaOrange
 * @date          2019年11月29日
 */
public class CommandQuit {
    /*
     * "quit"指令处理
     */
    public static void handleCommand(String command) {
        try {
            System.out.println("bye");
            System.exit(0);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
