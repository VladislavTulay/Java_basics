package generics;

public class Account<T, S>{

    private T id;
    private S sum;

    Account(T id, S sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public S getSum() { return sum; }
}
