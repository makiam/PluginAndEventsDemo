/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package artofillusion;

import artofillusion.event.OtherPluginEvent;
import artofillusion.event.PluginEvent;
import lombok.extern.slf4j.Slf4j;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

/**
 *
 * @author MaksK
 */

@Slf4j
public class Lifecycle extends Plugin {

    public Lifecycle(PluginWrapper wrapper) {
        super(wrapper);
        register();
    }

    private void register() {
        EventBus.getDefault().register(this);
    }

    @Override
    public void stop() {
        super.stop();
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> {} Pligin stopping", this.getClass().getSimpleName());
    }

    @Override
    public void start() {
        super.start();
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> {} Pligin starting", this.getClass().getSimpleName());
    }

    @Subscribe
    public void onPluginEvent(PluginEvent event) {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> {} Plugin Responds to custom event", this.getClass().getSimpleName());
    }

    @Subscribe
    public void onOtherPluginEvent(OtherPluginEvent event) {
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> {} Plugin Responds to other custom event", this.getClass().getSimpleName());
    }
}
