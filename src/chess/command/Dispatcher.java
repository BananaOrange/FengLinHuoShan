package chess.command;

/**
 * 
 * @description   分发类,将界面指令分发给command包中对应处理类 	 
 * @author        BananaOrange
 * @date          2019年11月29日
 */
public class Dispatcher {
    /*
     * 指令解析与分发
     */
    public static void dispatchCommand(String command) {
        try {
            if(command.startsWith("ucci")) {
                CommandUcci.handleCommand(command);
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
