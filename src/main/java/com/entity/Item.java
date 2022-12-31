package com.entity;

import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Item {

        @Id
        private int id;
        private String name;
        private double price;
        private int quantity;

//        @Transient
//        private int value;

        protected Item() {

        }

        public Item(int id, String name, double price, int quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

//        public int getValue() {
//            return value;
//        }

//        public void setValue(int value) {
//            this.value = value;
//        }

        public String toString() {
            return String.format("Item[%d, %s, %d, %d]", id, name, price, quantity);
        }
}
