/**
 * Autogenerated by Thrift Compiler (0.9.2)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package cn.edu.thu.tsfile.format;


public enum PageType implements org.apache.thrift.TEnum {
    DATA_PAGE(0),
    INDEX_PAGE(1),
    DICTIONARY_PAGE(2);

    private final int value;

    private PageType(int value) {
        this.value = value;
    }

    /**
     * Find a the enum type by its integer value, as defined in the Thrift IDL.
     * @return null if the value is not found.
     */
    public static PageType findByValue(int value) {
        switch (value) {
            case 0:
                return DATA_PAGE;
            case 1:
                return INDEX_PAGE;
            case 2:
                return DICTIONARY_PAGE;
            default:
                return null;
        }
    }

    /**
     * Get the integer value of this enum value, as defined in the Thrift IDL.
     */
    public int getValue() {
        return value;
    }
}
