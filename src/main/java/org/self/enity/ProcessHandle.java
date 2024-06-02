package org.self.enity;

import com.sun.jna.Native;
import com.sun.jna.win32.StdCallLibrary;

public class ProcessHandle {

    public interface Kernel32 extends StdCallLibrary {
        Kernel32 INSTANCE = Native.load("kernel32", Kernel32.class);

        int OpenProcess(int dwDesiredAccess, boolean bInheritHandle, int dwProcessId);

        int CloseHandle(int hObject);
    }

}
