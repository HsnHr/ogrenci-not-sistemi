import java.util.ArrayList;
import java.util.Scanner;

public class OgrenciNotSistemi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ogrenci> liste = new ArrayList<>();

        while (true) {
            System.out.println("\n1- Öğrenci Ekle");
            System.out.println("2- Listele");
            System.out.println("3- Çıkış");
            System.out.print("Seçim: ");

            int secim = scanner.nextInt();
            scanner.nextLine();

            if (secim == 1) {

                System.out.print("Öğrenci adı: ");
                String ad = scanner.nextLine();

                System.out.print("Not: ");
                int not = scanner.nextInt();
                scanner.nextLine();

                Ogrenci ogrenci = new Ogrenci(ad, not);
                liste.add(ogrenci);

                System.out.println("Eklendi.");

            } else if (secim == 2) {

                System.out.println("\n--- Liste ---");

                int toplam = 0;

                for (Ogrenci o : liste) {
                    System.out.println(o.ad + " - Not: " + o.not + " - " + o.durum());
                    toplam += o.not;
                }

                if (!liste.isEmpty()) {
                    double ortalama = (double) toplam / liste.size();
                    System.out.println("\nOrtalama: " + ortalama);
                }

            } else if (secim == 3) {
                break;
            }
        }

        scanner.close();
    }
}