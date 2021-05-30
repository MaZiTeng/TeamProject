package BugAssassins;

public class PlayerAction {
    private Player currentPlayer;
    private Board board;
    private HighLight highLight;
    private HandCard handCard;

    public PlayerAction(Player player, Board board, HandCard handCard) {
        this.currentPlayer = player;
        this.board = board;
        this.handCard = handCard;
        this.highLight = new HighLight(board, player);
    }

    public void selectUnit(Unit unit) {
        //        选取unit
        highLight.unit(unit);
        //        如果前端传过来的被攻击对象
        Unit unit2 = new Unit();
        attack(unit, unit2);
        highLight.cancel();
        //        如果前端传来位置
        move(unit, 1, 1);
        highLight.cancel();
        selectUnit(unit);       //  准备攻击
    }

    public void attack(Unit unit1, Unit unit2) {
        //        攻击行为（unit1攻击unit2）
        move(unit1, 1, 1);  // 如果被攻击者不在附近，需要移动
    }

    public void move(Unit unit, int x, int y) {
        //        移动行为（unit移动到(x,y)点）
    }

    public void selectCard(int num){
        Card card = handCard.selectCard(num);
//        如果选择了位置:
        creatureCardPlaying(card,1,2);
//        如果选择了对象：
        Unit unit = new Unit();
        spellCardPlaying(card,unit);
    }
    public void creatureCardPlaying(Card card, int x, int y) {
//        初始化Unit
        handCard.popCard(card);
        Unit unit = new Unit();
        unit.summonEffect();
    }

    public void spellCardPlaying(Card card, Unit unit) {
//        执行效果：
        handCard.popCard(card);
        unit.setHealth(12);
//        对场上每一个unit执行spellEffect()
    }

}
