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

}
