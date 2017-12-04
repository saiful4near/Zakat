package com.example.z.zakat.model;

/**
 * Created by z on 04/12/17.
 */

public class zakatFitr  {
    private int totalHasil ;
    private int zakat;
    private String kepalaKelName  ;

    public zakatFitr(int totalHasil, int zakat, String kepalaKelName) {
        this.totalHasil = totalHasil;
        this.zakat = zakat;
        this.kepalaKelName = kepalaKelName;
    }

    public int getTotalHasil() {
        return totalHasil;
    }

    public void setTotalHasil(int totalHasil) {
        this.totalHasil = totalHasil;
    }

    public int getZakat() {
        return zakat;
    }

    public void setZakat(int zakat) {
        this.zakat = zakat;
    }

    public String getKepalaKelName() {
        return kepalaKelName;
    }

    public void setKepalaKelName(String kepalaKelName) {
        this.kepalaKelName = kepalaKelName;
    }
}
