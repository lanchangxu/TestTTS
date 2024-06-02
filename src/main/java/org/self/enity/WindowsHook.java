package org.self.enity;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary;

/**
 * windows 钩子
 */
public class WindowsHook {
    public interface User32 extends StdCallLibrary {
        User32 INSTANCE = Native.load("user32", User32.class);

        /**
         * 创建钩子
         * @param idHook  钩子的类型（在这个例子中是WH_KEYBOARD_LL键盘事件或WH_MOUSE_LL鼠标事件）
         * @param lpfn    钩子过程的地址（一个回调函数，当事件发生时将被调用）。
         * @param lpParam 拥有钩子的窗口的句柄（NULL，表示全局钩子）。
         * @return
         */
        int setWindowsHookEx(int idHook, HookProc lpfn, Pointer lpParam);

        int CallNextHookEx(int hHook, int nCode, int wParam, Pointer lParam);


    }

    public interface HookProc extends StdCallLibrary {
        int Call(int nCode, int wParam, Pointer lParam);
    }
}
