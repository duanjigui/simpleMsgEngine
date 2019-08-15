package com.sanbel.disk;

import java.io.File;
import java.nio.channels.FileChannel;

/**
 * 使用FilecHannel实现的store，效率方面比较好
 *   FileChannel + ByteBuf
 *
 */
public class FileChannelStore implements Store {

    private FileChannel channel;


    public boolean writeFile(byte[] body, File file) {

        return false;
    }

    public byte[] readFile(File file) {
        return new byte[0];
    }
}
