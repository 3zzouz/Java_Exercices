package ex3_tp1;
public class CustomArrayList {
    private int[] arraylist;
    private int size;

    public int [] getArrayList(){
        return this.arraylist;
    }
    public int getSize(){
        return this.size;
    }
    public CustomArrayList(){
        this.arraylist= new int[10];
        this.size=-1;
    }
    public CustomArrayList(int initialSize){
        if(initialSize<0)throw new Error("Error size of arraylist can't me negative ");
        this.arraylist= new int[initialSize];
        this.size=-1;
    }
    public void add(int obj){
        int [] aux = new int[this.size()+1];
        for(int i=0;i<this.size();i++){
            aux[i]=this.arraylist[i];
        }
        aux[++this.size]=obj;
        this.arraylist=aux;
    }
    public void add(int index,int x){
        if(index>this.size+1)index=this.size+1;
        if(index<0)throw new Error("Error index can't be negative");
        int [] aux = new int[this.size()+1];
        for(int i=0;i<index;i++){
            aux[i]=this.arraylist[i];
        }
        aux[index]=x;
        for(int i=index+1;i<=this.size();i++){
            aux[i]=this.arraylist[i-1];
        }
        this.arraylist=aux;
        this.size++;
    }
    public int get(int index){
        if(index>this.size)throw new Error("Index out of range ");
        if(index<0)throw new Error("Index can't be negative");
        return this.arraylist[index];
    }
    public int size(){
        return this.size+1;
    }
    public boolean isEmpty(){
        return this.size==-1;
    }
    public boolean isIn(int x){
        for(int i=0;i<=this.size;i++){
            if(this.arraylist[i]==x)return true;
        }
        return false;
    }
    public int find(int x){
        int pos;
        for(pos=0;pos<=this.size;pos++)
        {
            if(this.arraylist[pos]==x)return pos;
        }
        return -1;
    }
    public void remove(int x){
        if(this.isEmpty()==false && this.isIn(x)==true)
        {
            int [] aux = new int [this.size()-1];
            int i;
            for(i=0;i<=this.size && this.arraylist[i]!=x;i++)
            {
                aux[i]=this.arraylist[i];
            }
            for(int j=i+1;j<=this.size;j++)
            {
                aux[j-1]=this.arraylist[j];
            }
            this.arraylist=aux;
            this.size--;
        }
    }
}
