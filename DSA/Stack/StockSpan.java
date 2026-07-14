import java.util.*;

public class StockSpan {

    int[] loadSpan(int[] load) {

        int[] span = new int[load.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0;i<load.length;i++) {

            while(!stack.isEmpty() &&
                  load[stack.peek()] <= load[i]) {
                stack.pop();
            }

            span[i] = stack.isEmpty()
                    ? i+1
                    : i-stack.peek();

            stack.push(i);
        }

        return span;
    }
}
