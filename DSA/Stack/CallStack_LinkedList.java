public class CallStack_LinkedList {

    private static class Frame {
        String functionName;
        Frame next;

        Frame(String name, Frame next) {
            this.functionName = name;
            this.next = next;
        }
    }

    private Frame top = null;

    void push(String functionName) {
        top = new Frame(functionName, top);
    }

    String pop() {
        if(top == null) throw new RuntimeException("No active call");

        String name = top.functionName;
        top = top.next;
        return name;
    }

    String peek() {
        if(top == null) throw new RuntimeException("Stack empty");
        return top.functionName;
    }
}
