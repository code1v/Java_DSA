import java.util.PriorityQueue;
import java.util.Scanner;

public class FoodStamps {
    static class Food{
    int taste;
    int decay;

    Food(int taste,int decay){
        this.taste=taste;
        this.decay=decay;
    }
}
    public static void main(String[] args) {
        PriorityQueue<Food> pq=new PriorityQueue<>((a,b)->(b.taste-a.taste));         
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int taste = sc.nextInt();
            int decay = sc.nextInt();

            pq.add(new Food(taste, decay));
}

        long ans = 0;
        for (int i = 0; i < m; i++) {

    Food f = pq.poll();
    if(f.taste==0) break;
    ans += f.taste;

    f.taste = Math.max(0, f.taste - f.decay);

    pq.add(f);
}

System.out.println(ans);
    }
}