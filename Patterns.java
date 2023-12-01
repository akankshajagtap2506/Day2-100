package Day2;

public class Patterns {
    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(n - j + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j >= (n - (i - 1)) && j <= (n + (i - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 2 * n - 1; j >= 1; j--) {
                if (j >= (n - (i - 1)) && j <= (n + (i - 1))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < 2 * n - 1; j++) {
                if (j >= n - (i - 1) && j <= n + (i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 2 * n - 1; j >= 1; j--) {
                if (j >= n - (i - 1) && j <= n + (i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            int star = i;
            if (i > n) {
                star = 2 * n - i;
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                num = 1;
            } else {
                num = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = 1 - num;

            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 0; j < 2 * n - (2 * i + 2); j++)// 2*(n-1) n=4 so (4-1)=3 ->2*3=6
            {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern13(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }

    public static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            // char ch='A'
            for (char ch = 'A'; ch <= 'A' + i; ch++)// int j=1;j<=i;j++
            {
                System.out.print(ch + " ");
                // ch++;
            }
            System.out.println();
        }
    }

    public static void pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            // char ch='A';
            // for(int j=n;j>=i;j--)
            for (char ch = 'A'; ch <= 'A' + (n - i); ch++) {
                System.out.print(ch + " ");
                // ch++;
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)// space
            {
                System.out.print(" ");
            }
            // character print
            char ch = 'A';
            int br = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j < br) {
                    ch++;
                } else {
                    ch--;
                }
            }
            for (int j = 0; j < n - i - 1; j++)// space
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern18(int n) {
        for (int i = 0; i < n; i++) {

            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void pattern19(int n) {
        int space = 0;
        for (int i = 0; i < n; i++) {
            // star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }
        int spac = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 1; j <= spac; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(0);
        pattern2(0);
        pattern3(0);
        pattern4(0);
        pattern6(0);
        pattern7(0);
        pattern8(0);
        pattern9(0);
        pattern10(0);
        pattern11(0);
        pattern12(5);
        pattern13(0);
        pattern14(0);
        pattern15(0);
        pattern16(0);
        pattern17(0);
        pattern18(0);
        pattern19(0);
    }
}