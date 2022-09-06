public class main {
    public static void main(String[] args) {
        Arena arena = new Arena();

        System.out.println("La area se está preparando y recibiendo a todos sus espectadores, para comenzar la batalla. Chun chun chun!!!");
        Fighter korby = new Korby();
        Fighter dittu = new Dittu();
        Fighter meganMan = new MeganMan();

        Viewer firstViewer = new Viewer(001, meganMan, arena, "Heigz");
        Viewer secondViewer = new Viewer(002, dittu, arena, "Rogerxdgta");
        Viewer thirdViewer = new Viewer(003, korby, arena, "ChaoGod");
    }
}
