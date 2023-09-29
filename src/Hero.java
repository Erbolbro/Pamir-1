public abstract class Hero implements HavingSuperAbility {
    public int helth;
    public int damage;
    public String SuperPowerType;

    public int getHelth() {
        return helth;
    }

    public void setHelth(int helth) {
        this.helth = helth;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperPowerType() {
        return SuperPowerType;
    }

    public void setSuperPowerType(String superPowerType) {
        SuperPowerType = superPowerType;
    }
}
