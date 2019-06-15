package com.alevel.moduleTwo;

public class Tree {
    public Tree child0;
    public Tree child1;
    public boolean leaf;
    public int character;   //входной символ
    public int weight;  //частота символа

    public Tree(boolean leaf, int character, int weight) {
        this.leaf = leaf;
        this.character = character;
        this.weight = weight;
    }

    public void treeTraverse(String code, Huffman h) {      //пройтись по дереву и сгенерировать коды символов
        if (leaf) {
            System.out.println((char) character + "" + weight + "" + code);
            h.code[character] = code;
        }
        if (child0 != null) child0.treeTraverse(code + "0", h);
        if (child1 != null) child1.treeTraverse(code + "1", h);
    }

}
