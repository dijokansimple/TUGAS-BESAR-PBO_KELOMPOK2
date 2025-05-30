/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaswing_crud;

/**
 *
 * @author DIMAS
 */
public interface AuthInterface {
        boolean login(String username, String password);
        void register();
    }