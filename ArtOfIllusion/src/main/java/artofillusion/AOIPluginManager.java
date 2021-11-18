/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artofillusion;

import java.nio.file.Paths;
import org.pf4j.DefaultPluginManager;
import org.pf4j.ExtensionFactory;
import org.pf4j.PluginManager;
import org.pf4j.SingletonExtensionFactory;

/**
 *
 * @author MaksK
 */
public class AOIPluginManager extends DefaultPluginManager {

    private AOIPluginManager() {
        super(Paths.get(System.getProperty("user.dir"),"..","Plugins"));
        loadPlugins();
        startPlugins();
    }
    
    @Override
    protected ExtensionFactory createExtensionFactory() {
        return new SingletonExtensionFactory();
    }

    private static class PluginManagerHolder {
        public static PluginManager INSTANCE = new AOIPluginManager();
    }


    public static PluginManager getInstance() {
        return PluginManagerHolder.INSTANCE;
    }
}
