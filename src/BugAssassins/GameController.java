package BugAssassins;

public class GameController {

    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) {
//        初始化玩家
        Player humanPlayer = new Player();
        Player AIPlayer = new Player();
//        初始化牌堆
        Deck humanDeck = new Deck();
        Deck AIDeck = new Deck();
//        初始化手牌
        HandCard humanHandCard = new HandCard();
        HandCard AIHandCard = new HandCard();
//        初始化棋盘
        Board board = new Board(humanPlayer,AIPlayer,humanHandCard);
        humanHandCard.setHandCard(humanPlayer,board);
        AIHandCard.setHandCard(AIPlayer,board);

//        设置当前玩家
        Player currentPlayer;
        HandCard currentHandCard;
//        各抽三张牌
        TurnAction turnAction = new TurnAction(board);

//        进入回合
        while (true){
            turnAction.doTurn();
//            设置current（包括player，handcard，deck）
            currentHandCard = humanHandCard;
            currentPlayer = humanPlayer;
            PlayerAction action = new PlayerAction(currentPlayer,board, currentHandCard);
//            等待指令，执行指令
            int end = 0;
            while (end == 0){
//                if (获取用户动作)
//                如果动作为点击next turn 将end置为1
                end = 1;
            }
        }
    }
}
