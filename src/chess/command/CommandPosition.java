package chess.command;

import chess.engine.utils.FenConverter;

/**
 * 指令处理类,处理"position"指令	 
 * @author        BananaOrange
 * @date          2019年12月10日
 */
public class CommandPosition {
    /*
     * "position"指令处理(暂时只处理FEN串，忽略moves部分)
     */
    public static void handleCommand(String command) {
	//拆分FEN串(拆分后包含纯FEN串和先后手标识)
	String fenAndOrderStr = command.substring(command.indexOf("fen")+3,command.indexOf("-")).trim();
        FenConverter.fenConverter(fenAndOrderStr);
    }
}
