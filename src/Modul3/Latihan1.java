package Modul3;

import java.util.Stack;

public class Latihan1 {

    public static void main(String[] args){
        Stack st = new Stack();

        st.push("aku");
        st.push("anak");
        st.push("Indonesia");

        System.out.println("Next : "+ st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

        int count = st.search("Aku");
        while (count != -1 && count > 1){
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}
