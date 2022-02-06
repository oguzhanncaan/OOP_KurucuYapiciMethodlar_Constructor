package com.oguzhancan;

import com.oguzhancan.entity.Kedi;

public class RunnerKedi {
    public static void main(String[] args) {
        System.out.println("Uygulamaya giriş yapıldı.");
        Kedi kedi = new Kedi();
        System.out.println("Kedi nesnesi oluşturuldu.");
        System.out.println("Kedi adı:"+kedi.getAd());
        System.out.println("Kedi yaş:"+kedi.getYas());
        System.out.println("Kedi ağırlık:"+kedi.getAgirlik());
        System.out.println(kedi.toString());
    }
}
