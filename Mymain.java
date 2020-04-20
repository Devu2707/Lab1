public class Mymain {
    public static void main(String[] args) {
        int max = 100;
        Arrayfind arr = new Arrayfind(max);
        arr.insert(45);
        arr.insert(7);
        arr.insert(89);
        arr.insert(45);
        arr.insert(45);
       // arr.display();
        arr.occurence(45);
        arr.duplicate();
    }
}
class Arrayfind{
    private long[] a;
    private int  nelems;
    public Arrayfind(int max){
        a=new long[max];
        nelems=0;
    }
    public void insert (long val){
        a[nelems]=val;
        nelems++;
    }
    public void display(){
        for (int i = 0; i <nelems ; i++) {
            System.out.println(a[i]+ " ");
        }
    }
    public void occurence(long g){
        System.out.println("occurence of "+ g+" ");
        for (int i = 0; i <nelems ; i++) {
            if(g==a[i]){
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");
    }
    public void duplicate() {
        System.out.println("duplicate elements  ");
        for (int i = 0; i < nelems; i++) {
            if (a[i]==a[i+1]){
                System.out.print(a[i]);
                break;
                }

            }
        }
    }
