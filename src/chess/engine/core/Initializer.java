package chess.engine.core;

import chess.engine.entity.BitBoard;
import chess.engine.runtime.RuntimeBitBoard;

/**
 * 初始化类，用于初始化运行时位棋盘	 
 * @author        BananaOrange
 * @date          2020年2月7日
 */
public class Initializer {
    /*
     * 初始化运行时位棋盘
     */
    public static void initRuntimeBitBoard() {
	//红方七个兵种
	RuntimeBitBoard.WR = new BitBoard(0,0,0);
	RuntimeBitBoard.WN = new BitBoard(0,0,0);
	RuntimeBitBoard.WB = new BitBoard(0,0,0);
	RuntimeBitBoard.WA = new BitBoard(0,0,0);
	RuntimeBitBoard.WK = new BitBoard(0,0,0);
	RuntimeBitBoard.WC = new BitBoard(0,0,0);
	RuntimeBitBoard.WP = new BitBoard(0,0,0);
	
	//黑方七个兵种
	RuntimeBitBoard.BR = new BitBoard(0,0,0);
	RuntimeBitBoard.BN = new BitBoard(0,0,0);
	RuntimeBitBoard.BB = new BitBoard(0,0,0);
	RuntimeBitBoard.BA = new BitBoard(0,0,0);
	RuntimeBitBoard.BK = new BitBoard(0,0,0);
	RuntimeBitBoard.BC = new BitBoard(0,0,0);
	RuntimeBitBoard.BP = new BitBoard(0,0,0);
	
	//所有红棋;所有黑棋;所有棋子
	RuntimeBitBoard.W_PIECES = new BitBoard(0,0,0);
	RuntimeBitBoard.B_PIECES = new BitBoard(0,0,0);
	RuntimeBitBoard.ALL_PIECES = new BitBoard(0,0,0);
    }
}
