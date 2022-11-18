// 2.Сила тяжести на Луне составляет около 17% земной. 
//   Напишите программу, которая вычислила бы ваш вес на Луне.

class Moon {
    public static void main(String args[]) {
    double catweight; // Вес кота
    double moonweight; // Вес на Луне
    catweight = 3.74;
    moonweight = catweight * 0.17;
    System.out.println(catweight +
                       " кг земного кота будет ровняться " +
                       moonweight + " кг лунного кота.");
    }
}