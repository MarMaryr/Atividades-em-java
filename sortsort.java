class sortsort {

    public static int[] preencher (int n, int[] arr) {
        int cont = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = cont;
            cont++;
        }
        return arr;
    }

    public static int[] sort(int n, int m, int[] arr) {
        int[] novo1 = new int[n];
        int[] comp1 = new int[n];
        int[] novoarr = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] % m == 1) {
                novo1[i] = arr[i];
                MyIO.println(novo1[i]);
                if (novo1[i] > comp1[i]) {
                    novoarr[i] = novo1[i];
                } else if (novo1[i] < comp1[i]) {
                    novoarr[i] = comp1[i];
                } else if (novo1[i] == comp1[i]) {
                    novoarr[i] = arr[i];
                }
            }
        }
        MyIO.println(novoarr);
        return novoarr;
    }

    public static void main(String[] args) {
        // digitar o tanto de numeros
        int n = MyIO.readInt();
        // digitar o mod
        int m = MyIO.readInt();
        int[] arr = new int[n];
        preencher(n, arr);
        sort(n, m, arr);
    }
}
// 1 % 3 = 1

// 2 % 3 = 2
// 3 % 3 = 0

// 4 % 3 = 1

// 5 % 3 = 2
// 6 % 3 = 0

// 7 % 3 = 1

// 8 % 3 = 2
// 9 % 3 = 0

// 10 % 3 = 1

// 11 % 3 = 2
// 12 % 3 = 0

// 13 % 3 = 1

// 14 % 3 = 2
// 15 % 3 = 0