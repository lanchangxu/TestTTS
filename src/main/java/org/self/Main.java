package org.self;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        run();
    }


    private static void run() {
        System.out.println("1");
//        WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "窗口标题");
//        if (hwnd != null) {
//            // 获取窗口大小
//            WinDef.RECT rect = new WinDef.RECT();
//            User32.INSTANCE.GetWindowRect(hwnd, rect);
//            int width = rect.right - rect.left;
//            int height = rect.bottom - rect.top;
//            System.out.println("窗口大小: " + width + "x" + height);
//
//            // 获取窗口坐标
//            WinDef.POINT point = new WinDef.POINT();
//            User32.INSTANCE.GetCursorPos(point);
//            System.out.println("窗口坐标: (" + point.x + ", " + point.y + ")");
//        } else {
//            System.out.println("找不到窗口");
//        }
    }
}