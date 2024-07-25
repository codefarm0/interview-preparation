package com.greenlearner.general;


import java.util.Objects;

/**
 * Video explanation - https://youtu.be/PdtCEq5dzYE
 */
public class EqualityOperator {
    public static void main(String[] args) {

        MyClass o1 = new MyClass(1, "codefarm");
        MyClass o2 = new MyClass(1, "codefarm");

        if(o1==o2){
            System.out.println("o1==o2 >> true");
        }else{
            System.out.println("o1==o2 >> false");
        }

        if(o1.equals(o2)){
            System.out.println("o1.equals(o2) >> true");
        }else{
            System.out.println("o1.equals(o2)2 >> false");
        }
    }

    static class MyClass{
        int id;
        String name;

        public MyClass(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyClass myClass = (MyClass) o;
            return id == myClass.id && Objects.equals(name, myClass.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
}
