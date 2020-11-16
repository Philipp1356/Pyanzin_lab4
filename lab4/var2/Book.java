package ru.mirea.gib04.lab4.var2;

class Book implements Priceable
{
    int royalty = 2;
    int markup = 8;

    @Override
    public int getPrice()
    {
        return royalty + markup;
    }
}