package BugAssassins;

public class TurnAction {
    private int turnCount = 2;
    private Player player;
    private Board board;

    public TurnAction(Board board){
        this.board = board;
    }

    public void doTurn(){
//        处理新回合：mana回复，所有场上unit状态重置
        turnCount+=1;
    }


}
