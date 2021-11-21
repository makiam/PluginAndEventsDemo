/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artofillusion;

import artofillusion.event.OtherPluginEvent;
import artofillusion.event.PluginEvent;
import artofillusion.image.Filter;
import artofillusion.renderer.Renderer;
import artofillusion.tools.Tool;
import artofillusion.translator.Translator;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.greenrobot.eventbus.EventBus;
import org.pf4j.PluginManager;

/**
 *
 * @author MaksK
 */
@Slf4j
public class ArtOfIllusion {

    @Getter
    private final PluginManager manager = AOIPluginManager.getInstance();

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            AOIPluginManager.getInstance().stopPlugins();
        }, "Plugins shutdown thread"));
    }

    public ArtOfIllusion() {
    }


    public static void main(String[] args) {
        ArtOfIllusion application = new ArtOfIllusion();
        PluginManager manager = application.getManager();

        System.out.println("*******************************************");
        
        manager.getExtensionClasses(Translator.class).forEach(clazz -> {
            log.info("Found but not instantiated {}", clazz.getSimpleName());
        });

        System.out.println("*******************************************");
        manager.getExtensions(Tool.class).forEach(tool -> tool.execute());
        manager.getExtensions(Filter.class).forEach(tool -> tool.apply());
        manager.getExtensions(Renderer.class).forEach(tool -> tool.render());
        System.out.println("*******************************************");

        EventBus.getDefault().post(new PluginEvent());
        EventBus.getDefault().post(new OtherPluginEvent());
    }
}
