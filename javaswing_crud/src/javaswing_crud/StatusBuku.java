/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing_crud;

/**
 *
 * @author DIMAS
 */
public enum StatusBuku {
    TERSEDIA("Tersedia"),
    DIPINJAM("Dipinjam"),
    RUSAK_HILANG("Rusak/Hilang");

    private final String label;

    StatusBuku(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static StatusBuku fromLabel(String label) {
        for (StatusBuku s : values()) {
            if (s.label.equalsIgnoreCase(label)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Status tidak valid: " + label);
    }
}

