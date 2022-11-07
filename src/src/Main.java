public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Gerard", "Wojownik", 50, 15, true);
        hero1.changeName("Super");
        hero1.vievName();
        System.out.println(hero1.vievName());
        hero1.changeClass("Mag");
        hero1.vievClass();
        System.out.println(hero1.vievClass());
        hero1.changeForce(20);
        hero1.vievForce();
        System.out.println(hero1.vievForce());

    }
}
