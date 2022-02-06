package com.oguzhancan;

import com.oguzhancan.entity.Musteri;

public class RunnerMusteri {
    public static void main(String[] args) {
        Musteri musteri = new Musteri("Oğuzhan","Can","555555555","asdadasdasda");

        /**
         * SORU: Aşağıdaki kod mu daha okunaklı ve temiz yoksa yukardaki mi?
         */
        /*
        musteri.setAd("Oğuzhan");
        musteri.setSoyad("Can");
        musteri.setAdres("sdad");
        musteri.setTelefon("64564656");
        */

        System.out.println(musteri.toString());

    }
}
