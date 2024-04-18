package org.example;

public class BoxForPair<T extends Animal> {
    T a1;
    T a2;

    public void put(T a){
        if(a1 == null)
            a1 =a;
        else if(a2 == null)
            a2 = a;
    }

    public T takeOut(){
        if(a2 != null)
            return a2;
        else
            return a1;
    }

    @Override
    public String toString() {
        return "BoxForPair{" +
                "a1=" + a1 +
                ", a2=" + a2 +
                '}';
    }

    public int getAmountFilled(){
        int count=0;
        if(a1 != null) count++;
        if(a2 != null) count++;
        return count;
    }

    public int compareByFilling(BoxForPair<?> otherBox){
        return this.getAmountFilled() - otherBox.getAmountFilled();
    }
}
