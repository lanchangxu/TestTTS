package org.self.utils;

import java.awt.*;

/**
 * 屏幕工具类
 */
public class ScreenUtils {

    public static void soutScreenInfo() {
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] screens = env.getScreenDevices();
        for (GraphicsDevice screen : screens) {
            DisplayMode dm = screen.getDisplayMode();
            int screenWidth = dm.getWidth();
            int screenHeight = dm.getHeight();
            System.out.println("屏幕分辨率：" + screenWidth + "x" + screenHeight);
        }
    }

}