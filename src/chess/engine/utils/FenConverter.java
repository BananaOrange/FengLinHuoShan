package chess.engine.utils;

import chess.engine.runtime.RuntimeBitBoard;
import chess.engine.runtime.RuntimeStatus;

/**
 * 工具类,解析转换FEN串	 
 * @author        BananaOrange
 * @date          2019年12月8日
 */
public class FenConverter {
    /*
     * 将FEN串解析转换
     */
    public static void fenConverter(String fenAndOrderStr) {
	String fenArr[] = fenAndOrderStr.split(" ");
	//确定先后手
	if(fenArr.length == 2) {
	    RuntimeStatus.PLAYER_ORDER = fenArr[1];
	}else {
	    return;
	}
	//将FEN串转换为BitBoard
	//rnbakabnr/9/1c5c1/p1p1p1p1p/9/9/P1P1P1P1P/1C5C1/9/RNBAKABNR w - - 0 0
	int crossPoint = 0;//棋盘上的交叉点序号(由左上角至右下角,范围从1至90)
	for(int i=0,length=fenArr[0].length();i<length;i++) {
	    char ch = fenArr[0].charAt(i);
	    switch(ch) {
        	case 'r':
    		    crossPoint++;
    		    BitBoardOperation.setTrueFlag(RuntimeBitBoard.BR,crossPoint);
    		    break;
        	case 'n':
    		    crossPoint++;
    		    BitBoardOperation.setTrueFlag(RuntimeBitBoard.BN,crossPoint);
    		    break;
        	case 'b':
    		    crossPoint++;
    		    BitBoardOperation.setTrueFlag(RuntimeBitBoard.BB,crossPoint);
    		    break;
        	case 'a':
    		    crossPoint++;
    		    BitBoardOperation.setTrueFlag(RuntimeBitBoard.BA,crossPoint);
    		    break;
        	case 'k':
    		    crossPoint++;
    		    BitBoardOperation.setTrueFlag(RuntimeBitBoard.BK,crossPoint);
    		    break;
        	case 'c':
    		    crossPoint++;
    		    BitBoardOperation.setTrueFlag(RuntimeBitBoard.BC,crossPoint);
    		    break;
        	case 'p':
    		    crossPoint++;
    		    BitBoardOperation.setTrueFlag(RuntimeBitBoard.BP,crossPoint);
    		    break;
        	case 'R':
    		    crossPoint++;
    		    BitBoardOperation.setTrueFlag(RuntimeBitBoard.WR,crossPoint);
    		    break;
        	case 'N':
    		    crossPoint++;
    		    BitBoardOperation.setTrueFlag(RuntimeBitBoard.WN,crossPoint);
    		    break;
        	case 'B':
    		    crossPoint++;
    		    BitBoardOperation.setTrueFlag(RuntimeBitBoard.WB,crossPoint);
    		    break;
        	case 'A':
    		    crossPoint++;
    		    BitBoardOperation.setTrueFlag(RuntimeBitBoard.WA,crossPoint);
    		    break;
        	case 'K':
    		    crossPoint++;
    		    BitBoardOperation.setTrueFlag(RuntimeBitBoard.WK,crossPoint);
    		    break;
        	case 'C':
    		    crossPoint++;
    		    BitBoardOperation.setTrueFlag(RuntimeBitBoard.WC,crossPoint);
    		    break;
        	case 'P':
    		    crossPoint++;
    		    BitBoardOperation.setTrueFlag(RuntimeBitBoard.WP,crossPoint);
    		    break;
        	default:
        	    if(ch != '/') {
        		crossPoint += Integer.parseInt(String.valueOf(ch));
        	    }
    		    break;
	    }
	}
	//将单个棋子的位棋盘相或，获得红方/黑方/全部棋子位棋盘
	RuntimeBitBoard.W_PIECES = BitBoardOperation.multiOpOr(RuntimeBitBoard.WR, RuntimeBitBoard.WN, RuntimeBitBoard.WB, RuntimeBitBoard.WA, 
								    RuntimeBitBoard.WK, RuntimeBitBoard.WC, RuntimeBitBoard.WP);
	RuntimeBitBoard.B_PIECES = BitBoardOperation.multiOpOr(RuntimeBitBoard.BR, RuntimeBitBoard.BN, RuntimeBitBoard.BB, RuntimeBitBoard.BA, 
		                                                    RuntimeBitBoard.BK, RuntimeBitBoard.BC, RuntimeBitBoard.BP);
	RuntimeBitBoard.ALL_PIECES = BitBoardOperation.opOr(RuntimeBitBoard.W_PIECES, RuntimeBitBoard.B_PIECES);	
    }
}
