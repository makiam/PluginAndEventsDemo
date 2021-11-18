/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package artofillusion.tools;

import org.pf4j.ExtensionPoint;

/**
 *
 * @author MaksK
 */
public interface Tool extends ExtensionPoint {
    default void execute() {
        System.out.println("************************   Execute Tool " + this.getClass().getSimpleName());
    }
}
