package DayThree.AdapterPattern;

public interface Test {
    default int methodCheck() {
        return 1;
    }

    default boolean method() {
        return true;
    }

    public boolean method1();
}
