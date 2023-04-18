package sg.edu.nus.iss;

import java.util.LinkedList;

public class LinedListExample {

    public void linkedListExample01() {
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("Heng Swee Kiat");
        linkedList.add("Leong Mun Wai");
        linkedList.add("Pritam Singh");
        linkedList.add("Gerald Giam");

        for (String item : linkedList) {
            System.out.println(item);
        }

        linkedList.remove("Leong Mun Wai");
        System.out.println(linkedList);

        linkedList.addFirst("Lee Hsien Loong");
        linkedList.addLast("Lee Kwan Yew");
        System.out.println(linkedList);
    }
}
