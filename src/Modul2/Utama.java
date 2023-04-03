package Modul2;
import java.util.*;

public class Utama {
    public static void main(String[] args) {

    ArrayList<String> hewan = new ArrayList<>();


    hewan.add("sapi");
    hewan.add("kelinci");
    hewan.add("kambing");
    hewan.add("unta");
    hewan.add("domba");


    ArrayList<String> deletehewan = new ArrayList<>();


    deletehewan.add("kelinci");
    deletehewan.add("kambing");
    deletehewan.add("unta");


    System.out.println("Hewan: " + hewan);
    System.out.println("Hewan yang dihapus: \n" + deletehewan);
    hewan.removeAll(deletehewan);


    System.out.println("Output Hewan: \n" + hewan);



}
}

