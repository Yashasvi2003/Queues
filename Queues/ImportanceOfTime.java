import java.util.*;
public class ImportanceOfTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> callOrder = new LinkedList<>();
        Queue<Integer> idealOrder = new LinkedList<>();
        for (int j = 0; j < N; j++) {
            int pro = sc.nextInt();
            callOrder.add(pro);
        }
        for (int j = 0; j < N; j++) {
            int pro = sc.nextInt();
            idealOrder.add(pro);
        }
        int totalTime = 0;
        while (!idealOrder.isEmpty()) {
            int idealProcess = idealOrder.peek();
            while (callOrder.peek() != idealProcess) {

                int firstProcess = callOrder.poll();
                callOrder.add(firstProcess);
                totalTime++;
            }
            callOrder.poll();
            idealOrder.poll();
            totalTime++;
        }
        System.out.println(totalTime);}}
