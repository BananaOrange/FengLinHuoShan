package chess.command;

import chess.engine.core.Initializer;

/**
 * 指令处理类,处理"ucci"指令,返回程序信息	 
 * @author        BananaOrange
 * @date          2019年12月1日
 */
public class CommandUcci {
    /*
     * "ucci"指令处理
     */
    public static void handleCommand(String command) {
	//初始化
	Initializer.initRuntimeBitBoard();
	//返回引擎信息
        System.out.println("id name FengLinHuoShan \n"
                        + "author BananaOrange \n"
                        + "ucciok");
    }
}
