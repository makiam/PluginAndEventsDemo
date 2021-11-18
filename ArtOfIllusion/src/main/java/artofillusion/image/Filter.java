/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artofillusion.image;

import org.pf4j.ExtensionPoint;

/**
 *
 * @author MaksK
 */
public interface Filter extends ExtensionPoint {
    default void apply() {
        System.out.println("************************   Apply filter: " + this.getClass().getSimpleName());
    }
}
