/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.pasien;
/**
 *
 * @author ACER
 */
public class pasien {
    int kode_pasien;
    String nama_pasien;
    String alamat;
    String goldar;

    public int getKode_pasien() {
        return kode_pasien;
    }

    public void setKode_pasien(int kode_pasien) {
        this.kode_pasien = kode_pasien;
    }

    public String getNama_pasien() {
        return nama_pasien;
    }

    public void setNama_pasien(String nama_pasien) {
        this.nama_pasien = nama_pasien;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getGoldar() {
        return goldar;
    }

    public void setGoldar(String goldar) {
        this.goldar = goldar;
    }
   
}
