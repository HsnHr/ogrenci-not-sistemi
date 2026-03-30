public class Ogrenci {
    String ad;
    int not;

    public Ogrenci(String ad, int not) {
        this.ad = ad;
        this.not = not;
    }

    public String durum() {
        if (not >= 50) {
            return "Geçti";
        } else {
            return "Kaldı";
        }
    }
}
