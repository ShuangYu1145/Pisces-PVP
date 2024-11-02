package top.zklmc;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;

public enum Pisces {
    instance;
    public static Minecraft mc;
    public static final String NAME = "Pisces";
    public static final String VERSION = "1.0";

    public void run() {
        //设置标题
        Display.setTitle(NAME + " " + VERSION);
    }

    public void stop() {
    }
}
