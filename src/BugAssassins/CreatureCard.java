package BugAssassins;

public class CreatureCard extends Card {
    private int id;
    private String name;
    //    mana花费
    private int cost;
    //    攻击力
    private int attack;
    //    生命值
    private int health;
    //    描述
    private String description;
    //    卡牌归属的玩家
    private Player belongs;

    //    全局移动
    private boolean flying;
    //    全局攻击
    private boolean ranged;
    //    两次进攻
    private boolean windfury;
    //    嘲讽
    private boolean provoke;
    //    全局部署
    private boolean summonedLimit;

    public void setCard(int id, String name, int cost, int attack, int health,
                        String description, boolean flying, boolean ranged, boolean windfury,
                        boolean provoke, boolean summonedLimit) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.attack = attack;
        this.health = health;
        this.description = description;
        this.flying = flying;
        this.ranged = ranged;
        this.windfury = windfury;
        this.provoke = provoke;
        this.summonedLimit = summonedLimit;
    }



}
