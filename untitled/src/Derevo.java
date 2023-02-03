import java.util.Scanner;

public class Derevo {
    Scanner vu;
    String kus;
    Scanner in;
    int der;
     public Derevo() {
        vu= new Scanner(System.in);
        kus = vu.nextLine();
        in = new Scanner(System.in);
        der = in.nextInt();
    }

    public Derevo(Scanner in, Scanner vu, String kus, int der) {
        this.in = in;
        this.vu = vu;
        this.kus = kus;
        this.der = der;
    }

    public String getKus() {
        return kus;
    }

    public String setKus(String kus) {
        if (kus.equals("Саженець")){
            this.kus = kus;
            System.exit(1);
        }
        if (kus.equals("Дерево")){
            this.kus = kus;
        }
        else{
            System.out.print("Виберіть з представлених: ");
            setKus(vu.nextLine());
        }
        return kus;
    }

    public Scanner getVu() {
        return vu;
    }

    public void setVu(Scanner vu) {
        this.vu = vu;
    }


    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    public int getDer() {
        return der;
    }

    public int setDer(int der) {
        if ( der >= this.der) {
            this.der = der;
            }else {
            System.err.println("Неможна зменшити висоту!");
        }
        return der;
    }
}
