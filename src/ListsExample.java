import java.util.ArrayList;

public class ListsExample {
    public static void main(String[] args) {

        // Lists
        // 순서 구분, 중복 허용
        // Vector, ArrayList, LinkedList

        ArrayList list = new ArrayList(10);
        list.add(100);
        list.add("INFP");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
