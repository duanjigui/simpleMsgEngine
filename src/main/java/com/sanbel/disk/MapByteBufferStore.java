package com.sanbel.disk;

import java.io.File;

/**
 * 同步次要信息使用mmp
 */
public class MapByteBufferStore implements Store {

    public boolean writeFile(byte[] body, File file) {
        return false;
    }

    public byte[] readFile(File file) {
        return new byte[0];
    }
}
