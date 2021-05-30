package BugAssassins;

import javax.swing.text.Position;

public class Unit {
    private int id;
    private String animation;
    private Position position;
    private int health;
    private UnitAnimationSet animatins;
    private ImageCorrection correction;

    //    归属的玩家
    private Player belongs;
//    状态：未移动，已移动未攻击，已攻击。
    private int status;

    public void summonEffect() {
        switch (this.id) {
            case 8:
            case 9:
//                +3生命
                break;
        }
    }

    public void spellEffect() {
        switch (this.id) {
            case 6:
            case 7:
//                +1攻击，+1生命
                break;
            case 30:
            case 31:
//                双方抽卡
                break;
        }
    }

    public void deathEffect() {
        switch (this.id) {
            case 32:
            case 33:
//                抽卡
                break;
        }
    }

    public void avatarDamageEffect() {
        switch (this.id) {
            case 10:
            case 11:
//                +2攻击
                break;
        }
    }

    public void setHealth(int health){
        this.health = health;
    }
}
