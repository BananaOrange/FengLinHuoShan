package chess.command;

/**
 * @description   指令处理类,处理"ucci"指令,需返回引擎信息和"ucciok"标识    	 
 * @author        BananaOrange
 * @date          2019年11月29日
 */
public class CommandUcci {
    /*
     * "ucci"指令处理
     */
    public static void handleCommand(String command) {
        try {
            System.out.println("id name FengLinHuoShan \n"
                            + "author BananaOrange \n"
                            + "ucciok");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
