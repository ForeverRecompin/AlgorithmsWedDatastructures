package com.nocom.datastructures;

import java.util.Objects;

/**
 * Created by fraj on 6/19/16 at 8:21 PM.
 */
public class Pair<A extends Comparable<A>, B extends Comparable<B>> implements Comparable<Pair<A, B>> {
    private A first;
    private B second;

    public Pair(A first, B second) {
        this.setFirst(first);
        this.setSecond(second);
    }

    @Override
    public int compareTo(Pair<A, B> otherPair) {
        int firstCmp = this.getFirst().compareTo(otherPair.getFirst());
        return (firstCmp != 0 ? firstCmp : this.getSecond().compareTo(otherPair.getSecond()));
    }

    @Override
    public String toString() {
        return "Pair: (" + getFirst() + ", " + getSecond() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (this == null || getClass() != o.getClass()) {
            return false;
        }
        Pair otherPair = (Pair) o;
        return this.getFirst() == otherPair.getFirst() && this.getSecond() == otherPair.getSecond();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirst(), getSecond());
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }
}

