package chess.engine.base;

/**
 * 位棋盘,用三个int类型的组合来表示棋盘上的90个点(最高6位不用)	 
 * @author        BananaOrange
 * @date          2019年12月3日
 */
public class BitBoard {
    private int low;//低32位
    private int medium;//中32位
    private int high;//高32位
    
    public BitBoard(int low,int medium,int high) {
	low = this.low;
	medium = this.medium;
	high = this.high;
    }
    
    /*
     * 位棋盘的与操作
     */
    public BitBoard opAnd(BitBoard bitBoard1,BitBoard bitBoard2) {
	int low = bitBoard1.low & bitBoard2.low;
	int medium = bitBoard1.medium & bitBoard2.medium;
	int high = bitBoard1.high & bitBoard2.high;

	return new BitBoard(low, medium, high);
    }
    
    /*
     * 位棋盘的或操作
     */
    public BitBoard opOr(BitBoard bitBoard1,BitBoard bitBoard2) {
	int low = bitBoard1.low | bitBoard2.low;
	int medium = bitBoard1.medium | bitBoard2.medium;
	int high = bitBoard1.high | bitBoard2.high;

	return new BitBoard(low, medium, high);
    }
    
    /*
     * 位棋盘的非操作
     */
    public BitBoard opNot(BitBoard bitBoard) {
	int low = ~ bitBoard.low;
	int medium = ~ bitBoard.medium;
	int high = ~ bitBoard.high;

	return new BitBoard(low, medium, high);
    }
}
