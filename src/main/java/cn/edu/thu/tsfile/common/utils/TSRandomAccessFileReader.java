package cn.edu.thu.tsfile.common.utils;

import java.io.IOException;

/**
 * Interface for file read.
 *
 * @author Jinrui Zhang
 */
public interface TSRandomAccessFileReader {

    void seek(long offset) throws IOException;

    int read() throws IOException;

    int read(byte[] b, int off, int len) throws IOException;

    long length() throws IOException;

    int readInt() throws IOException;

    void close() throws IOException;
}
