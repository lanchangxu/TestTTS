package org.self;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.win32.StdCallLibrary;
import org.self.enity.ProcessHandle;
import org.self.enity.SelfPoint;
import org.self.service.MemoryManager;
import org.self.service.impl.MemoryManagerImpl;
import org.self.utils.MouseUtils;
import org.self.utils.WindowsUtils;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

import static com.sun.jna.platform.win32.WinUser.WH_KEYBOARD_LL;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello world!");

        Robot robot = new Robot();

        // Simulate a key press
        robot.keyPress(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_LEFT);

        int targetPid = WindowsUtils.getPidByName("ShopTitan.exe");
//
        int hProcess = ProcessHandle.Kernel32.INSTANCE.OpenProcess(0x1, false, targetPid);
//
//
//        HookProc hookProc = new HookProc() {
//            @Override
//            public int0 Call(int nCode, int wParam, Pointer lParam) {
//                // 处理键盘事件
//                System.out.println("Keyboard event: " + nCode + " " + wParam);
//                return User32.INSTANCE.CallNextHookEx(WH_KEYBOARD_LL, nCode, wParam, lParam);
//            }
//        };
//
//        // 设置键盘钩子
//        int hHook = User32.INSTANCE.SetWindowsHookEx(13, hookProc, Pointer.createConstant(targetPid),targetPid);
//        if (hHook == 0) {
//            System.out.println("Failed to set hook");
//            return;
//        }
//
//        // 等待钩子事件
//        while (true) {
//            // Create a robot instance
//            Robot robot = new Robot();
//
//            // Simulate a key press
//            robot.keyPress(KeyEvent.VK_LEFT);
//            robot.keyRelease(KeyEvent.VK_LEFT);
//            break;
//        }

//        getPosition();
//        ScreenUtils.soutScreenInfo();
//        System.out.println("操作系统的名称：" + System.getProperty("os.name"));
//        System.out.println("操作系统的版本号：" + System.getProperty("os.version"));
//        System.out.println("操作系统的架构：" + System.getProperty("os.arch"));
//        WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "Shop Titans");
//        WinDef.HWND hwnd1 = User32.INSTANCE.GetWindow(hwnd, null);
//        test();
    }

    public static void simKey() throws AWTException {
        // 创建Robot实例
        Robot robot = new Robot();

        // 模拟键盘按下
        robot.keyPress(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_LEFT);
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

//    private static void run() {
//        System.out.println("1");
//        final User32 instance = User32.INSTANCE;
//        WinDef.HWND hwnd = instance.FindWindow(null, "Shop Titans");
////        hwnd.setPointer(new Pointer(0));
//        if (hwnd != null) {
//            //获取窗口大小
//            WinDef.RECT rect = new WinDef.RECT();
//            instance.GetWindowRect(hwnd, rect);
//            int width = rect.right - rect.left;
//            int height = rect.bottom - rect.top;
//            System.out.println("窗口大小: " + width + "x" + height);
//
//            // 获取窗口坐标
//            WinDef.POINT point = new WinDef.POINT();
//            instance.GetCursorPos(point);
//            System.out.println("窗口坐标: (" + point.x + ", " + point.y + ")");
//        } else {
//            System.out.println("找不到窗口");
//            //启动逻辑
//        }
//
//        WinDef.RECT dimensionsOfWindow = new WinDef.RECT();
//
//
//        //获取谷歌浏览器某一个标签的窗口
//        instance.GetWindowRect(hwnd, dimensionsOfWindow);
//
//
//        Robot robot = null;
//        try {
//            robot = new Robot();
//        } catch (AWTException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(dimensionsOfWindow.toRectangle());
//
//        assert robot != null;
//        BufferedImage buf = robot.createScreenCapture(dimensionsOfWindow.toRectangle());
//        File output = new File("screen//www.png");
//        try {
//            ImageIO.write(buf, "png", output);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}