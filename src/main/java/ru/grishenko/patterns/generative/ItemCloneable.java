package ru.grishenko.patterns.generative;

public abstract class ItemCloneable implements Cloneable{

    public abstract ItemCloneable clone();

    public abstract boolean equals(Object o);
}
