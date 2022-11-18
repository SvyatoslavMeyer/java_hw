// 1.Реализовать таблицу истинности 
//   т е у нас есть p = false и q = true. 
//   Чему будет ранво p & q == ? , ? - вынести в таблицу.

public class trFl {
        public static void main(String[] args) {
            boolean[] bool = {false, false, true, false, false, true, true, true};
            System.out.println("  p\t\t" + "  q\t\t" + "p & q\tp | q\tp ^ q \t !p");
            for (int i = 0; i < bool.length; i++) {
                boolean p = bool[i++];
                boolean q = bool[i];
                System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + !p);
            }
        }
    }
