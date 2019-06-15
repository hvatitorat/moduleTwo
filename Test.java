package com.alevel.moduleTwo;

public class Test {
    public static void main(String[] args) {
        Huffman h = new Huffman();
        String str = "Jesus, it's alive!!";
        int data[] = new int[str.length()];
        for (int i = 0; i < str.length(); i++) data[i] = str.charAt(i);
        h.growTree(data);
        h.makeCode();
        str = h.coder(data);
        System.out.println(str);
    }
}
