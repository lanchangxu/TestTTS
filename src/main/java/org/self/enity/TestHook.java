package org.self.enity;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.*;
import com.sun.jna.win32.W32APIOptions;
import org.self.constants.Constants;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import static com.sun.jna.platform.win32.WinUser.SWP_SHOWWINDOW;

public class TestHook implements Runnable {
    static volatile Date last = new Date();
    static volatile Date main = new Date();
    static ArrayList<String> windowText = new ArrayList<>();

    public static void close() throws IOException, InterruptedException {

        //通过窗口标题获取窗口句柄
        WinDef.HWND hWnd;
        final User32 user32 = User32.INSTANCE;
        user32.EnumWindows(new WinUser.WNDENUMPROC() {
            @Override
            public boolean callback(WinDef.HWND hWnd, Pointer arg1) {
                char[] windowText = new char[512];
                user32.GetWindowText(hWnd, windowText, 512);
                String wText = Native.toString(windowText);
                // get rid of this if block if you want all windows regardless of whether
                // or not they have text
                if (wText.isEmpty()) {
                    return true;
                }
                if (wText.contains("Google Chrome (192.168.70.241)")) {
                    TestHook.windowText.add(wText);
                }
                System.out.println(wText);
                return true;
            }
        }, null);
        if (TestHook.windowText.size() < 1) {
            System.out.println("找不到窗口，正在打开窗口。。。");
            TestHook.windowText.add("Shop Titans");
//            open("remote.rdp");
        } else {
            int y = 0;
            for (String title : TestHook.windowText) {
                hWnd = User32.INSTANCE.FindWindow(null, "Shop Titans");
                if ("新标签页 - Google Chrome (192.168.70.241)".equals(title) && y == 0) {
                    WinDef.LRESULT lresult = User32.INSTANCE.SendMessage(hWnd, 0X10, null, null);
                    System.out.println("关闭成功");
                    y++;
                } else {
                    int i = (int) (Math.random() * (3 - 2 + 1) + 2);
                    User32.INSTANCE.ShowWindow(hWnd, i);
                    User32.INSTANCE.SetForegroundWindow(hWnd);
                }
//                String username = "a";
//                for (Character c : username.toCharArray()) {
//                    sendChar(c);
//                }
            }
        }
    }

//    public static void open(String path) throws IOException {
//        java.awt.Desktop dp = java.awt.Desktop.getDesktop();
//        if (dp.isSupported(java.awt.Desktop.Action.BROWSE)) {
//            File file = new File(path);
//            dp.open(file);
//        }
//    }

    public static void main(String[] args) throws Exception {

//        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//        GraphicsDevice gd = ge.getDefaultScreenDevice();
//        AffineTransform at = gd.getDefaultConfiguration().getNormalizingTransform();
//        double scaleX = at.getScaleX();
//        System.out.println("Screen scaling factor: " + scaleX);

        final int WM_LBUTTONUP = 514;

        final int WM_LBUTTONDOWN = 513;

        final int WM_LBUTTONDBLCLK = 0x203;

        User32 user32 = User32.INSTANCE;

        //调整窗体
        WinDef.HWND hWnd = user32.FindWindow(null, Constants.exeWindowName);
        user32.SetWindowPos(hWnd, null, 0, 0, 1200, 720, SWP_SHOWWINDOW);
        //获取截图
        WinDef.RECT dimensionsOfWindow = new WinDef.RECT();
        user32.GetWindowRect(hWnd, dimensionsOfWindow);

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        BufferedImage buf = robot.createScreenCapture(dimensionsOfWindow.toRectangle());
        File output = new File("www.png");
        try {
            ImageIO.write(buf, "png", output);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        user32.SetForegroundWindow(hWnd);
//
//        WinDef.LPARAM l = new WinDef.LPARAM(0);
//        WinDef.WPARAM myParam = new WinDef.WPARAM(27);
//        user32.SendMessage(hWnd, 0x0100, myParam, l);
//        Thread.sleep(100);
//        user32.SendMessage(hWnd, 0x0101, myParam, l);

//        WinDef.LPARAM l = new WinDef.LPARAM(y);
//
//        WinDef.WPARAM w = new WinDef.WPARAM(0);
//
//
//
//        user32.PostMessage(hwnd, WM_LBUTTONDOWN, w, l);
//
//        Thread.sleep(1000);
//
//        user32.PostMessage(hwnd, WM_LBUTTONUP, w, l);


//        System.out.println("正在监控中。。。。");
//        final Robot rb = new Robot();
//        rb.delay(500);
//        TestHook jianKong = new TestHook();
//        jianKong.run();

//        new Thread(jianKong).start();
//        new Thread(new ControShuBiao(rb)).start();
    }

    static WinUser.INPUT input = new WinUser.INPUT();

    static void sendChar(char ch) {
        input.type = new WinDef.DWORD(WinUser.INPUT.INPUT_KEYBOARD);
        input.input.setType("ki"); // Because setting INPUT_INPUT_KEYBOARD is not enough: https://groups.google.com/d/msg/jna-users/NDBGwC1VZbU/cjYCQ1CjBwAJ
        input.input.ki.wScan = new WinDef.WORD(0);
        input.input.ki.time = new WinDef.DWORD(0);
        input.input.ki.dwExtraInfo = new BaseTSD.ULONG_PTR(0);
        // Press
        input.input.ki.wVk = new WinDef.WORD(Character.toUpperCase(ch)); // 0x41
        input.input.ki.dwFlags = new WinDef.DWORD(0);  // keydown
        User32.INSTANCE.SendInput(new WinDef.DWORD(1), (WinUser.INPUT[]) input.toArray(1), input.size());
        // Release
        input.input.ki.wVk = new WinDef.WORD(Character.toUpperCase(ch)); // 0x41
        input.input.ki.dwFlags = new WinDef.DWORD(2);  // keyup
        User32.INSTANCE.SendInput(new WinDef.DWORD(1), (WinUser.INPUT[]) input.toArray(1), input.size());
    }

    @Override
    public void run() {
        setHookOn();
    }

    private WinUser.HHOOK hhkMouse;
    private WinUser.HHOOK hhkKeyBoard;

    private WinUser.LowLevelMouseProc mouseProc = new WinUser.LowLevelMouseProc() {

        @Override
        public WinDef.LRESULT callback(int nCode, WinDef.WPARAM wParam, WinUser.MSLLHOOKSTRUCT lParam) {
            if (nCode >= 0) {
                TestHook.last = new Date();
//                if (wParam.intValue() == 512) {
//                    System.out.println("鼠标移动");
//                }
                Point point = MouseInfo.getPointerInfo().getLocation();
                int x = (int) point.getX();
                int y = (int) point.getY();
                if (wParam.intValue() == 513) {
                    System.out.println("鼠标左键按下,坐标" + x + "," + y);
                    WinDef.HWND hWnd = User32.INSTANCE.FindWindow(null, "Shop Titans");
                    System.out.println("1");
                    WinDef.WPARAM myParam = new WinDef.WPARAM(0x1B);
                    User32.INSTANCE.SendMessage(hWnd, 0x0100, myParam, null);
                    System.out.println("2");
                    User32.INSTANCE.SendMessage(hWnd, 0x0101, myParam, null);
                    System.out.println("3");
                    Robot rb = null;
                    try {
                        rb = new Robot();
                    } catch (AWTException e) {
                        e.printStackTrace();
                    }
                    rb.keyPress(0x1B);
                    rb.setAutoDelay(500);
                    rb.keyRelease(0x1B);
                }

                if (wParam.intValue() == 514) {
                    System.out.println("鼠标左键弹起");
                }

                if (wParam.intValue() == 516) {
                    System.out.println("鼠标右键按下");
                }

                if (wParam.intValue() == 517) {
                    System.out.println("鼠标右键弹起");
                }
            }
            return User32.INSTANCE.CallNextHookEx(hhkMouse, nCode, wParam, null);
        }
    };

    private WinUser.LowLevelKeyboardProc keyboardProc = new WinUser.LowLevelKeyboardProc() {

        @Override
        public WinDef.LRESULT callback(int nCode, WinDef.WPARAM wParam, WinUser.KBDLLHOOKSTRUCT event) {


            if (nCode >= 0) {
                TestHook.last = new Date();
                if (wParam.intValue() == 512) {
                    System.out.println("出发");
                }


            }

            return User32.INSTANCE.CallNextHookEx(hhkKeyBoard, nCode, wParam, null);
        }
    };


    public void setHookOn() {
        WinDef.HMODULE hMod = Kernel32.INSTANCE.GetModuleHandle(null);
        hhkMouse = User32.INSTANCE.SetWindowsHookEx(User32.WH_MOUSE_LL, mouseProc, hMod, 0);
        int result;
        WinUser.MSG msg = new WinUser.MSG();
        while ((result = User32.INSTANCE.GetMessage(msg, null, 0, 0)) != 0) {

            if (result == -1) {
                setHookOff();
                break;
            } else {
                User32.INSTANCE.TranslateMessage(msg);
                User32.INSTANCE.DispatchMessage(msg);
            }
        }
    }

    public void setHookOff() {
        User32.INSTANCE.UnhookWindowsHookEx(hhkKeyBoard);
        System.exit(0);
    }

}
