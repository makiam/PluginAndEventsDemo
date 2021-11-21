/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artofillusion.raytracer;

import artofillusion.renderer.Renderer;
import lombok.extern.slf4j.Slf4j;
import org.pf4j.Extension;

/**
 *
 * @author MaksK
 */
@Slf4j
@Extension
public class Raytracer implements Renderer {

    @Override
    public void render() {
        log.info("Render with {}", this.getClass().getSimpleName());
    }

}
