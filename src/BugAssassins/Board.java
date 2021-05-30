package BugAssassins;

public class Board {
    private Player humanPlayer;
    private Player AIPlayer;
    private Tile[][] board;
    private HandCard handCard;

//    差一个按钮，不知道是什么类！
    public Board(Player humanPlayer, Player AIPlayer, HandCard handCard){
        this.humanPlayer = humanPlayer;
        this.AIPlayer = AIPlayer;
        this.handCard = handCard;
        this.board = drawBoard();
    }

    public Tile[][] drawBoard(){
        Tile[][] board = new Tile[5][9];
//        绘制棋盘
        return board;
    }
}
