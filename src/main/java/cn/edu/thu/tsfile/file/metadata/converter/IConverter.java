package cn.edu.thu.tsfile.file.metadata.converter;

/**
 * convert metadata between TSFile format and thrift format
 *
 * @param <T>
 */
public interface IConverter<T> {
    /**
     * convert TSFile format metadata to thrift format
     *
     * @return metadata in thrift format
     */
    T convertToThrift();

    /**
     * convert thrift format metadata to TSFile format
     *
     * @param metadata metadata in thrift format
     */
    void convertToTSF(T metadata);
}
