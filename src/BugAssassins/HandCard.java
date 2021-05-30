package BugAssassins;

import javax.swing.*;
import java.util.List;

public class HandCard {
    //    卡牌列表
    private List<Card> handCard;

    Player player;
    Board board;
    HighLight highLight;


    public void setHandCard(Player player, Board board) {
        this.player = player;
        this.board = board;
        highLight = new HighLight(board, player);
    }

    public Card getCard(int num){
//        获取手牌中的第num张
        Card card = new Card();
        return card;
    }

    public void drawCard(Card card) {
        //        抽取卡牌
    }

    public void popCard(Card card) {
        //        使用卡牌
    }

    public Card selectCard(int num) {
        //        选取卡牌，获取id，判断类型
        if(num == 1) {
            CreatureCard card = (CreatureCard)getCard(num);
            highLight.placement(card);
            return card;
        }else {
            SpellCard card = (SpellCard)getCard(num);
            highLight.object(card);
            return card;
        }
    }
}
