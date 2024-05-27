package org.self;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
import org.self.enity.SelfPoint;
import org.self.service.MemoryManager;
import org.self.service.impl.MemoryManagerImpl;
import org.self.utils.WindowsUtils;
import org.self.utils.MouseUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
//        getPosition();
//        ScreenUtils.soutScreenInfo();
//        System.out.println("操作系统的名称：" + System.getProperty("os.name"));
//        System.out.println("操作系统的版本号：" + System.getProperty("os.version"));
//        System.out.println("操作系统的架构：" + System.getProperty("os.arch"));
        WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "Shop Titans");
        WinDef.HWND hwnd1 = User32.INSTANCE.GetWindow(hwnd, null);
        test();
    }

    private static void test() throws IOException {
//        JFrame frame = new JFrame("设置窗口大小示例");
//        frame.setSize(100, 100);
//        frame.setVisible(true);
        MemoryManager memoryManager = new MemoryManagerImpl();
        //打开进程名：PlantsVsZombies.exe
        int process = memoryManager.OpenProcess("ShopTitan.exe");

    }

    private static void getPosition() {
        SelfPoint point = MouseUtils.getMousePosition();
        System.out.println(point.getX());
        System.out.println(point.getY());
        //463,207
        //997,558
    }

    private static void run() {
        System.out.println("1");
        final User32 instance = User32.INSTANCE;
        WinDef.HWND hwnd = instance.FindWindow(null, "Shop Titans");
//        hwnd.setPointer(new Pointer(0));
        if (hwnd != null) {
            //获取窗口大小
            WinDef.RECT rect = new WinDef.RECT();
            instance.GetWindowRect(hwnd, rect);
            int width = rect.right - rect.left;
            int height = rect.bottom - rect.top;
            System.out.println("窗口大小: " + width + "x" + height);

            // 获取窗口坐标
            WinDef.POINT point = new WinDef.POINT();
            instance.GetCursorPos(point);
            System.out.println("窗口坐标: (" + point.x + ", " + point.y + ")");
        } else {
            System.out.println("找不到窗口");
            //启动逻辑
        }

        WinDef.RECT dimensionsOfWindow = new WinDef.RECT();


        //获取谷歌浏览器某一个标签的窗口
        instance.GetWindowRect(hwnd, dimensionsOfWindow);


        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        System.out.println(dimensionsOfWindow.toRectangle());

        assert robot != null;
        BufferedImage buf = robot.createScreenCapture(dimensionsOfWindow.toRectangle());
        File output = new File("screen//www.png");
        try {
            ImageIO.write(buf, "png", output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}