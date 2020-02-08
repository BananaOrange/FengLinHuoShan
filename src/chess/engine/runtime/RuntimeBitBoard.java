package chess.engine.runtime;

import chess.engine.entity.BitBoard;

/**
 * 运行时所有位棋盘	 
 * @author        BananaOrange
 * @date          2019年12月8日
 */
public class RuntimeBitBoard {
    
    public static BitBoard ALL_PIECES;//棋盘上所有棋子(不区分红黑,1表示有子,0表示无子,以下皆同)
    
    public static BitBoard W_PIECES;//棋盘上所有红方棋子
    
    public static BitBoard B_PIECES;//棋盘上所有黑方棋子
    
    public static BitBoard WR;//棋盘上所有红车
    
    public static BitBoard WN;//棋盘上所有红马
    
    public static BitBoard WB;//棋盘上所有红象
    
    public static BitBoard WA;//棋盘上所有红士
    
    public static BitBoard WK;//棋盘上所有红将
    
    public static BitBoard WC;//棋盘上所有红炮
    
    public static BitBoard WP;//棋盘上所有红兵
    
    public static BitBoard BR;//棋盘上所有黑车
    
    public static BitBoard BN;//棋盘上所有黑马
    
    public static BitBoard BB;//棋盘上所有黑象
    
    public static BitBoard BA;//棋盘上所有黑士
    
    public static BitBoard BK;//棋盘上所有黑将
    
    public static BitBoard BC;//棋盘上所有黑炮
    
    public static BitBoard BP;//棋盘上所有黑兵
    
    
}
