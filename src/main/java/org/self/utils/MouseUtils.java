package org.self.utils;

import org.self.enity.SelfPoint;

import java.awt.*;

/**
 * 鼠标工具类
 */
public class MouseUtils {

    /**
     * 获取鼠标当前位置
     * @return 鼠标坐标信息
     */
    public static SelfPoint getMousePosition() {
        SelfPoint selfPoint = new SelfPoint();
        PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        selfPoint.setX((float) pointerInfo.getLocation().getX());
        selfPoint.setY((float) pointerInfo.getLocation().getY());
        return selfPoint;
    }
}
