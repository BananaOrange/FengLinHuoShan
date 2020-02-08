package chess.engine.entity;

/**
 * 位棋盘,用三个int类型的组合来表示棋盘上的90个点(左上至右下，最高6位不用)	 
 * @author        BananaOrange
 * @date          2019年12月3日
 */
public class BitBoard {
    private int low;//低32位,0~31
    private int medium;//中32位,32~63
    private int high;//高32位,64~89
    
    public int getLow() {
        return low;
    }
    public void setLow(int low) {
        this.low = low;
    }
    public int getMedium() {
        return medium;
    }
    public void setMedium(int medium) {
        this.medium = medium;
    }
    public int getHigh() {
        return high;
    }
    public void setHigh(int high) {
        this.high = high;
    }

    /*
     * 全参构造方法
     */
    public BitBoard(int low,int medium,int high) {
	this.low = low;
	this.medium = medium;
	this.high = high;
    }
}
