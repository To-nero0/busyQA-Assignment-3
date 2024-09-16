package assignment;

class Calculation {
    // 3 integer variables
    int num1, num2, num3;


    Calculation(int x, int y, int z) {
        this.num1 = x;
        this.num2 = y;
        this.num3 = z;
    }

 
    void sum() {
        int total = num1 + num2 + num3;
        System.out.println("Sum of numbers: " + total);
    }
}


