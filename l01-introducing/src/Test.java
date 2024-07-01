public class Test implements Comparable<Test> {

    @Override
    public int compareTo(Test o) {
        return 0;
    }
}

sealed class A permits B, C{}

final class B extends A{}

final class C extends A{}