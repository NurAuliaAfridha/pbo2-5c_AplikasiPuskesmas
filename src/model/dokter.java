/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.dokter;

/**
 *
 * @author ACER
 */
public class dokter {
    String kode_dokter;
    String nama_dokter;
    String spesialis;

    public String getKode_dokter() {
        return kode_dokter;
    }

    public void setKode_dokter(String kode_dokter) {
        this.kode_dokter = kode_dokter;
    }

    public String getNama_dokter() {
        return nama_dokter;
    }

    public void setNama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }

    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }
    
    
}
