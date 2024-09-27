public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Nom", "Prenom");
        p1.printPerson();
        p1.nameFormat();
        p1.printPerson();
        GraduatedPerson g1 = new GraduatedPerson("Nom", "Prenom");
        System.out.println(g1.toString());

        Person p2 = new Person("Nom", "Prenom");
        p2.nameFormat();
        System.out.println(p1.equals(p2));
        p2.setFirstName("John");
        System.out.println(p1.equals(p2));


        GraduatedPerson g2 = new GraduatedPerson("Nom", "Prenom");
        g2.nameFormat();
        System.out.println(g2.equals(g1));
        g2.setFirstName("test");
        System.out.println(g1.equals(g2));
    }
}
