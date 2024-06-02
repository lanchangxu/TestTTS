package org.self.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class WindowsUtils {

    /**
     * 根据进程明获取PID
     *
     * @param processName 进程名称
     * @return PID
     */
    public static int getPidByName(String processName) throws IOException {
        Process process = Runtime.getRuntime().exec("TASKLIST /FI \"IMAGENAME eq " + processName + "\"");
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new BufferedInputStream(process.getInputStream()), StandardCharsets.UTF_8));
        String str;
        int pid = -1;
        while ((str = bufferedReader.readLine()) != null) {
            if (str.contains(processName)) {
                pid = Integer.parseInt(str.substring(processName.length(), str.indexOf("Console")).trim());
            }
        }
        return pid;
    }

}
