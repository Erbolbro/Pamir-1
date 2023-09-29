// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        Medic medic = new Medic();
        Megic megic = new Megic();

        Hero[] heroes = {medic, megic, warrior};
        String[] marvel = {" хилить ", " заклинание", " сильный"};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility(marvel[i]);
        }
    }
}