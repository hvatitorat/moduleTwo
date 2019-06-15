package com.alevel.moduleTwo;

public class Huffman {
    int alphabetSize = 256;
    Tree tree[] = new Tree[alphabetSize];   //массив деревьев
    int weights[] = new int[alphabetSize];  //массив частоты символов
    public String code[] = new String[alphabetSize];    //конечный код Хаффмана


    private int getLowestTree(int used) {
        int min = 0;
        for (int i = 1; i < used; i++) {
            if (tree[i].weight < tree[min].weight) {
                min = i;
            }
        }
        return min;
    }

    public void growTree(int[] data) {
        for (int i = 0; i < data.length; i++) {     //считает частоту символов
            weights[data[i]]++;
        }
        int used = 0;
    }

}
