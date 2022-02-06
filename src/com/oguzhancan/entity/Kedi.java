package com.oguzhancan.entity;

public class Kedi {

    private String ad;
    private int yas;
    private String renk;
    private int agirlik;
    private String tur;
    private String cins;
    private boolean uyku;
    private int hiz;

    /** CONSTRUCTOR --> KURUCU YADA YAPICI METHOD
     * Syntax --> Erişim belirteci eklenir. Genellikle public dir.
     * return --> Eklenmez. Yani void, int, String vs. yazılmaz.
     * Method adı --> Sınıfın adı ne ise bu methodun adı da odur. Birebir sınıf adı ile aynı olmak zorundadır.
     * Parametre --> Opsiyoneldir. Method içine parametre alabilir ve almayabilir de. Yazılımcının kurgusuna göre bu değişim gösterir.
     * BİLGİ:
     * Yapıcı method sınıftan nesne yaratılmadan önce çalışır. Sınıf içinde default işlemler yapmak için kullanılır.
     * Geridönüş tipi eklenmese bile geri dönüş tipi vardır. O da sınıf objesidir.
     */

    /**
     * Default constructor
     * Bu method yazılmasa bile her sınıfın default constructorı vardır.
     */
    public Kedi(){
        ad = "Yumoş";
        agirlik = 120;
        renk = "sarı";
        System.out.println("Default constructor çalıştı.");

    }

    @Override
    public String toString() {
        return "Kedi{" +
                "ad='" + ad + '\'' +
                ", yas=" + yas +
                ", renk='" + renk + '\'' +
                ", agirlik=" + agirlik +
                ", tur='" + tur + '\'' +
                ", cins='" + cins + '\'' +
                ", uyku=" + uyku +
                ", hiz=" + hiz +
                '}';
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public boolean isUyku() {
        return uyku;
    }

    public void setUyku(boolean uyku) {
        this.uyku = uyku;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }
}
