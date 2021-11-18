/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package artofillusion.translator;

import org.pf4j.ExtensionPoint;

/**
 *
 * @author MaksK
 */
public interface Translator extends ExtensionPoint {

    default void translate() {
        System.out.println("************************   Translator: " + this.getClass().getSimpleName());
    }
}
