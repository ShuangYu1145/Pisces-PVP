package top.zklmc;

import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;
import top.zklmc.event.EventManager;
import top.zklmc.utils.wed.CheckProvince;

public enum Pisces {
    instance;
    private static final Logger logger = LogManager.getLogger();
    public static Minecraft mc;
    public static int delta;
    public static final String NAME = "Pisces";
    public static final String VERSION = "1.0";

    public void run() {
        //设置标题
        Display.setTitle(NAME + " " + VERSION + " " + CheckProvince.getLocation() + "入");

        EventManager eventManager = new EventManager();
        logger.info("");
    }

    public void stop() {
    }
}
