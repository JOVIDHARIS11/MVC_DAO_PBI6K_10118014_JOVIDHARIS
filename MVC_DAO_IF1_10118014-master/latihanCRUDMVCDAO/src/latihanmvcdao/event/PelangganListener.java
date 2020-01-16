/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvcdao.event;

import latihanmvcdao.entity.pelanggan;
import latihanmvcdao.model.PelangganModel;

/**
 *Nama : Jovi D Haris
 * NIM : 10118014
 * Kelas : IF-1 2018
 * @author Jovi D Haris
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(pelanggan pelanggan);

    
    
}
