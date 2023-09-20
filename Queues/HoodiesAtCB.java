import java.util.*;

class Main{

    protected int size;

    protected int front;
    protected int[] data;

    public Main() {
        this.size = 0;
        this.front = 0;
        this.data = new int[5];
    }

    public Main(int cap) {
        this.size = 0;
        this.front = 0;
        this.data = new int[cap];
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(int item) throws Exception {
        if (this.size() == this.data.length) {
            int[] oa = this.data;
            int[] na = new int[oa.length * 2];
            for (int i = 0; i < this.size(); i++) {
                int idx = (i + front) % oa.length;
                na[i] = oa[idx];
            }

            this.data = na;
            this.front = 0;
        }

        // if (this.size == this.data.length) {
        // throw new Exception("queue is full");
        // }

        this.data[(front + size) % this.data.length] = item;
        size++;

    }

    public int dequeue() throws Exception {
        if (this.size == 0) {
            throw new Exception("queue is empty");

        }

        int rv = this.data[front];
        front = (front + 1) % this.data.length;
        size--;

        return rv;

    }

    public int getFront() throws Exception {
        if (this.size == 0) {
            throw new Exception("queue is empty");
        }

        int rv = this.data[front];

        return rv;
    }

    public void display() {System.out.println();
        for (int i = 0; i < size; i++) {
            int idx = (i + front) % this.data.length;
            System.out.print(this.data[idx] + " ");
        }
        System.out.print("END");
    }



    public static void hoodies(int q) throws Exception{

        ArrayList<LinkedList<Integer>> Arlst = new ArrayList<>();
        for (int i = 0; i <q; i++) {
            Arlst.add(new LinkedList<Integer>());
        }
        ArrayList<Integer> Lsp = new ArrayList<Integer>();
        while(q-- >0) {
            char csp = scn.next().charAt(0);

            if(csp=='E') {
                int p = scn.nextInt();

                int a = scn.nextInt();

                if(Lsp.contains(p)) {
                    Arlst.get(p).add(a);
                }
                else {
                    Lsp.add(p);
                    Arlst.get(p).add(a);
                }

            }
            else {
                int Arlst_id=Lsp.get(0);

                int Rno_=Arlst.get(Arlst_id).removeFirst();

                System.out.println(Arlst_id+" "+Rno_);
                if(Arlst.get(Arlst_id).isEmpty()) {
                    Lsp.remove(0);
                }


            }
        }
    }


    static Scanner scn = new Scanner(System.in);


    public static void main(String[] args) throws Exception {

        int n = scn.nextInt();
        hoodies(n);
    }
}
