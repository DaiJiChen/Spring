package collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    //Array
    private String[] array;

    private Set<String> set;

    private List<String> list;

    private Map<String, String> map;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "Student{" +
                "array=" + Arrays.toString(array) +
                ", set=" + set +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
