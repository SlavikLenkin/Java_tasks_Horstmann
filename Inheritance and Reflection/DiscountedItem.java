package com.mycompany.java_horstman.chapter4;

import java.util.Objects;

    /*
    Exercise6
    Suppose that in Section 4.2.2, “The equals Method” (page 148), the
    Item.equals method uses an instanceof test. Implement DiscountedItem.equals so
    that it compares only the superclass if otherObject is an Item, but also includes the discount
    if it is a DiscountedItem. Show that this method preserves
    symmetry but fails to be transitive—that is, find a combination of items
    and discounted items so that x.equals(y) and y.equals(z), but not x.equals(z)
    */

public class DiscountedItem extends Item {
    private double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject.getClass() == Item.class) return super.equals(otherObject);
        DiscountedItem that = (DiscountedItem) otherObject;
        return Double.compare(that.discount, discount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}
