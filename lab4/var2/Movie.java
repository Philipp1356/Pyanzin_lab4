package ru.mirea.gib04.lab4.var2;

class Movie implements Priceable{
    int price = 15;

    @Override
    public int getPrice()
    {
        return price;
    }
}