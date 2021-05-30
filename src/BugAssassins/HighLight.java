package BugAssassins;

import javax.lang.model.element.Element;

public class HighLight {
    Board board;
    Player player;

    public HighLight(Board board, Player player) {
        this.board = board;
        this.player = player;
    }

    public void placement(Card card) {
//        高亮放置位置
    }

    public void unit(Unit unit) {
//  根据状态判断高亮（高亮可移动位置或可攻击对象）
    }

    public void cancel(Card card) {
//        取消高亮卡牌
    }

    public void cancel(Unit unit) {
//        取消高亮unit
    }

    public void cancel(Tile tile) {
//        取消高亮格子
    }

    public void cancel() {
//        取消高亮所有
    }

    public void object(Card card){
//  根据卡描述，高亮可选
    }
}
