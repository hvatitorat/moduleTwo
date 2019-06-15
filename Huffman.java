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

        for (int c = 0; c < alphabetSize; c++) {
            int w = weights[c];
            if (w != 0) tree[used++] = new Tree(true, c, w);
        }

        while (used > 1) {
            int min = getLowestTree(used);
            int weight0 = tree[min].weight;
            Tree tmp = new Tree();
            tmp.child0 = tree[min];
            tree[min] = tree[--used]; //ставим последнее дерево на место первой ветки

            min = getLowestTree(used); //ищем вторую ветку
            tmp.child1 = tree[min];
            tmp.weight = weight0 + tree[min].weight;
            tree[min] = tmp;        //ставим новое дерево на место второй ветки

        }
    }

    public void makeCode() {
        tree[0].treeTraverse("", this);
    }

    public String coder(int[] data) {
        String str = "";
        for (int i = 0; i < data.length; i++) str += code[data[i]];
        return str;
    }

}
