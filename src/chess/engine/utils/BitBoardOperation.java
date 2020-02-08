package chess.engine.utils;

import chess.engine.entity.BitBoard;

/**
 * 工具类，位棋盘的运算操作	 
 * @author        BananaOrange
 * @date          2020年2月7日
 */
public class BitBoardOperation {
    /*
     * 位棋盘的与操作
     */
    public static BitBoard opAnd(BitBoard bitBoard1,BitBoard bitBoard2) {
	int low = bitBoard1.getLow() & bitBoard2.getLow();
	int medium = bitBoard1.getMedium() & bitBoard2.getMedium();
	int high = bitBoard1.getHigh() & bitBoard2.getHigh();

	return new BitBoard(low, medium, high);
    }
    
    /*
     * 位棋盘的或操作
     */
    public static BitBoard opOr(BitBoard bitBoard1,BitBoard bitBoard2) {
	int low = bitBoard1.getLow() | bitBoard2.getLow();
	int medium = bitBoard1.getMedium() | bitBoard2.getMedium();
	int high = bitBoard1.getHigh() | bitBoard2.getHigh();

	return new BitBoard(low, medium, high);
    }
    
    /*
     * 位棋盘的非操作
     */
    public static BitBoard opNot(BitBoard bitBoard) {
	int low = ~ bitBoard.getLow();
	int medium = ~ bitBoard.getMedium();
	int high = ~ bitBoard.getHigh();

	return new BitBoard(low, medium, high);
    }
    
    /*
     * 多个位棋盘(七个兵种位棋盘)的与操作
     */
    public static BitBoard multiOpAnd(BitBoard bitBoard1,BitBoard bitBoard2,BitBoard bitBoard3,BitBoard bitBoard4
	    		      ,BitBoard bitBoard5,BitBoard bitBoard6,BitBoard bitBoard7) {
	
	int low = bitBoard1.getLow() & bitBoard2.getLow() & bitBoard3.getLow() & bitBoard4.getLow() &
		  bitBoard5.getLow() & bitBoard6.getLow() & bitBoard7.getLow();
	
	int medium = bitBoard1.getMedium() & bitBoard2.getMedium() & bitBoard3.getMedium() & bitBoard4.getMedium() &
		     bitBoard5.getMedium() & bitBoard6.getMedium() & bitBoard7.getMedium();
	
	int high = bitBoard1.getHigh() & bitBoard2.getHigh() & bitBoard3.getHigh() & bitBoard4.getHigh() &
		   bitBoard5.getHigh() & bitBoard6.getHigh() & bitBoard7.getHigh();

	return new BitBoard(low, medium, high);
    }
    
    /*
     * 多个位棋盘(七个兵种位棋盘)的或操作
     */
    public static BitBoard multiOpOr(BitBoard bitBoard1,BitBoard bitBoard2,BitBoard bitBoard3,BitBoard bitBoard4
	    		      ,BitBoard bitBoard5,BitBoard bitBoard6,BitBoard bitBoard7) {
	
	int low = bitBoard1.getLow() | bitBoard2.getLow() | bitBoard3.getLow() | bitBoard4.getLow() |
		  bitBoard5.getLow() | bitBoard6.getLow() | bitBoard7.getLow();
	
	int medium = bitBoard1.getMedium() | bitBoard2.getMedium() | bitBoard3.getMedium() | bitBoard4.getMedium() |
		     bitBoard5.getMedium() | bitBoard6.getMedium() | bitBoard7.getMedium();
	
	int high = bitBoard1.getHigh() | bitBoard2.getHigh() | bitBoard3.getHigh() | bitBoard4.getHigh() |
		   bitBoard5.getHigh() | bitBoard6.getHigh() | bitBoard7.getHigh();

	return new BitBoard(low, medium, high);
    }
    
    /*
     * 将位棋盘上的某一位置1
     * 
     * @param crossPoint 1至90
     */
    public static void setTrueFlag(BitBoard bitBoard, int crossPoint) {
	if(crossPoint>=1 && crossPoint<=32) {
	    bitBoard.setLow(bitBoard.getLow() | (1<<crossPoint-1));
	}else if(crossPoint>=33 && crossPoint<=64) {
	    crossPoint = crossPoint - 32;
	    bitBoard.setMedium(bitBoard.getMedium() | (1<<crossPoint-1));
	}else if(crossPoint>=65 && crossPoint<=90) {
	    crossPoint = crossPoint - 64;
	    bitBoard.setHigh(bitBoard.getHigh() | (1<<crossPoint-1));
	}
    }
}
