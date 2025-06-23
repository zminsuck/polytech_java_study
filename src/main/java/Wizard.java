public class Wizard {

    private int hp;
    private int mp;
    private Wand wand;

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null 일 수 없다.");
        }
        this.wand = wand;
    }

    public int getMP() {
        return mp;
    }

    public void setMP(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("마법사의 MP는 0 이상이어야 한다.");
        }
        this.mp = mp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);  // 음수일 경우 0으로 처리
    }
}


