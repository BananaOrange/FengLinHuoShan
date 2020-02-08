package chess.command;

/**
 * 分发类,将界面指令分发给command包中对应处理类	 
 * @author        BananaOrange
 * @date          2019年11月30日
 */
public class Dispatcher {
    /*
     * 指令解析与分发
     */
    public static void dispatchCommand(String command) {
        if(command.startsWith("ucci")) {
            CommandUcci.handleCommand(command);
        }else if(command.startsWith("quit")) {
            CommandQuit.handleCommand(command);
        }else if(command.startsWith("position")) {
            CommandPosition.handleCommand(command);
        }
    }
}
