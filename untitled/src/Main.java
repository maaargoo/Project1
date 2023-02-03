import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Derevo v = new Derevo();
        Scanner vu = v.getVu();
        System.out.print("Зиберіть що посадити, дерево чи саженець: ");
        v.setKus(vu.nextLine());
        while (vu.hasNext()){
            Scanner in=v.getIn();
            System.out.print("Оберіть висоту дерева: ");
            v.setDer(in.nextInt());
            System.out.println("Зараз висота вашого дерева: "+v.getDer());
        }
        vu.close();
    }
}