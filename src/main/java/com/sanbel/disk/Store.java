package com.sanbel.disk;

import java.io.File;

/**
 * 存储api的暴露
 */
public interface Store {

    /**
     * 写文件
     * @param body
     * @param file
     */
    public boolean writeFile(byte[] body,File file);

    /**
     * 读取文件
     * @param file
     * @return
     */
    public byte[] readFile(File file);


}
