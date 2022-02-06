package com.oguzhancan;

import com.oguzhancan.entity.Urun;

public class RunnerUrun {
    public static void main(String[] args) {

        Urun urun = new Urun(); // boş constructor
        System.out.println(urun.toString());
        urun = new Urun(1,"pc",25); // parametreli constructor
        System.out.println(urun.toString());
    }
}
