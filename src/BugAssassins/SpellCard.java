package BugAssassins;

public class SpellCard extends Card{
    private int id;
    private String name;
    private int cost;
    //    卡牌归属的玩家
    private Player belongs;

    public void effect(){
        switch (this.id){
            case 18:
            case 19:
//                造成2点伤害
                break;
            case 20:
            case 21:
//                +5生命
                break;
            case 38:
            case 39:
//                +2攻击
                break;
            case 40:
            case 41:
//                消灭unit
        }
    }
}
